export async function carregarPatentes() {
    try {
        const response = await fetch('/buscar_patentes');
        const result = await response.json();

        const container = document.getElementById('patentes-table');

        if (result.success && result.patentes.length > 0) {
            // Filtrar apenas patentes sem status definido
            const naoAvaliadas = result.patentes.filter(p => !p.db_status);

            if (naoAvaliadas.length === 0) {
                container.innerHTML = '<div class="empty-message">Todas as patentes foram avaliadas.</div>';
                return;
            }

            let html = `
                <table class="patente-table">
                    <thead>
                        <tr>
                            <th>Nome da Marca</th>
                            <th>Proprietário</th>
                            <th>Data de Expedição</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>`;

            naoAvaliadas.forEach(patente => {
                const dataExpedicao = new Date(patente.db_data_expedição);
                const dataFormatada = dataExpedicao.toLocaleDateString('pt-BR');

                html += `
                    <tr>
                        <td>${patente.db_nome || 'N/A'}</td>
                        <td>${patente.db_proprietário || 'N/A'}</td>
                        <td class="date-cell">${dataFormatada}</td>
                        <td>
                            <button class="status-btn aceitar" data-id="${patente._id}" data-status="Aceito">Aceitar</button>
                            <button class="status-btn recusar" data-id="${patente._id}" data-status="Recusado">Recusar</button>
                        </td>
                    </tr>`;
            });

            html += `</tbody></table>`;
            container.innerHTML = html;

            document.querySelectorAll('.status-btn').forEach(button => {
                button.addEventListener('click', async (e) => {
                    const id = e.target.dataset.id;
                    const status = e.target.dataset.status;
                    await atualizarStatusPatente(id, status);
                });
            });

        } else {
            container.innerHTML = '<div class="empty-message">Nenhuma patente cadastrada ainda.</div>';
        }
    } catch (error) {
        console.error('Erro ao carregar patentes:', error);
        container.innerHTML = '<div class="empty-message">Ocorreu um erro ao carregar as patentes.</div>';
    }
}

// Função para enviar o status para o servidor
async function atualizarStatusPatente(id, status) {
    try {
        const response = await fetch('/atualizar_status', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ id, status })
        });

        const result = await response.json();
        if (result.success) {
            alert("Status atualizado com sucesso!");
            carregarPatentes(); // Atualiza lista sem recarregar página inteira
        } else {
            alert("Erro ao atualizar status.");
        }
    } catch (error) {
        console.error("Erro ao enviar status:", error);
        alert("Erro inesperado.");
    }
}

//Função para carregar as patentes avaliadas anteriormente
export async function carregarPatentesAvaliadas() {
    const res = await fetch("/buscar_patentes");
    const result = await res.json();

    const container = document.getElementById("patentes-listadas");
    if (!container) return;

    if (result.success && result.patentes.length > 0) {
        const avaliadas = result.patentes.filter(p => p.db_status === "Aceito" || p.db_status === "Recusado");

        if (avaliadas.length === 0) {
            container.innerHTML = "<p class='empty-message'>Nenhuma patente avaliada ainda.</p>";
            return;
        }

        let html = `
            <table class="patente-table">
                <thead>
                    <tr>
                        <th>Marca</th>
                        <th>Proprietário</th>
                        <th>Expedição</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>`;

        avaliadas.forEach(p => {
            const data = new Date(p.db_data_expedição).toLocaleDateString('pt-BR');

            html += `
                <tr>
                    <td>${p.db_nome}</td>
                    <td>${p.db_proprietário}</td>
                    <td>${data}</td>
                    <td class="status-${p.db_status.toLowerCase()}">${p.db_status}</td>
                </tr>`;
        });

        html += "</tbody></table>";
        container.innerHTML = html;
    } else {
        container.innerHTML = "<p class='empty-message'>Erro ao carregar patentes.</p>";
    }
}


// Função principal para configurar o formulário
export function setupPatenteForm() {
    const form = document.getElementById("patenteForm");
    
    if (!form) {
        console.error("Formulário não encontrado!");
        return;
    }

    form.addEventListener("submit", handleFormSubmit);
}

// Manipulador do envio do formulário
async function handleFormSubmit(e) {
    e.preventDefault();

    try {
        const formData = getFormData();
        const response = await submitFormData(formData);
        handleResponse(response);
    } catch (error) {
        handleError(error);
    }
}

// Coleta os dados do formulário
function getFormData() {
    return {
        nome: document.getElementById("nome").value.trim(),
        proprietario: document.getElementById("proprietario").value.trim(),
        expedicao: document.getElementById("expedicao").value
    };
}

// Envia os dados para o servidor
async function submitFormData(data) {
    const response = await fetch("/submeter_patente", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
    });
    return await response.json();
}

// Processa a resposta do servidor
function handleResponse(result) {
    if (result.success) {
        showAlert("success", result.message);
        document.getElementById("patenteForm").reset();
    } else {
        showAlert("error", result.message);
    }
}

// Manipula erros
function handleError(error) {
    console.error("Erro:", error);
    showAlert("error", "Ocorreu um erro inesperado ao enviar o formulário");
}

// Mostra mensagem (substitua por um modal bonito se preferir)
function showAlert(type, message) {
    alert(message); // Você pode substituir por SweetAlert2 ou outro
}

// Inicializa o formulário quando o DOM estiver pronto
document.addEventListener("DOMContentLoaded", setupPatenteForm);