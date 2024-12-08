async function listarLivros() {
    try {
        const response = await fetch('/api/livros'); // Chama o backend
        if (!response.ok) {
            throw new Error('Erro ao buscar os dados!');
        }

        const livros = await response.json(); // Converte a resposta para JSON
        const container = document.getElementById('livros-container');
        
        if (livros.length > 0) {
            container.innerHTML = `<h2>Lista de Livros:</h2>`;
            const list = document.createElement('ul');
            
            livros.forEach(livro => {
                const li = document.createElement('li');
                li.innerText = `${livro.titulo} - Autor: ${livro.autor} | Preço: R$${livro.preco} | Quantidade: ${livro.quantidade}`;
                list.appendChild(li);
            });
            
            container.appendChild(list);
        } else {
            container.innerHTML = '<p>Sem livros disponíveis no momento.</p>';
        }
    } catch (error) {
        console.error('Erro ao buscar livros:', error);
        alert('Erro ao buscar dados da API.');
    }
}
