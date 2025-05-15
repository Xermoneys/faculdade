
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

