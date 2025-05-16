 function buscar_Exibir_Patentes(containerId = 'dados-container') {
    fetch('/buscar_patentes')
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na resposta da rede');
            }
            return response.json();
        })
        .then(data => {
            const container = document.getElementById(containerId);
            
            // Limpa o container antes de adicionar novos dados
            container.innerHTML = '';
            
            if (data.length === 0) {
                container.innerHTML = "<p>Nenhuma patente registrada ainda.</p>";
                return;
            }

            data.forEach(patente => {
                const patenteElement = document.createElement('div');
                patenteElement.className = 'patente-item';
                patenteElement.innerHTML = `
                    <h3>${patente.db_nome}</h3>
                    <p>Proprietário: ${patente.db_proprietário}</p>
                    <p>Data de Expedição: ${new Date(patente.db_data_expedição).toLocaleDateString()}</p>
                    <hr>
                `;
                container.appendChild(patenteElement);
            });
        })
        .catch(error => {
            console.error('Erro:', error);
            const container = document.getElementById(containerId);
            container.innerHTML = 
                "<p>Erro ao carregar os dados. Tente recarregar a página.</p>";
        });
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