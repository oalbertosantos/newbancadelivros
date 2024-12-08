fetch('http://localhost:8080/api/produtos')
    .then(response => response.json())
    .then(produtos => {
        const container = document.getElementById('produtos-container');
        produtos.forEach(produto => {
            const item = document.createElement('div');
            item.innerHTML = `<h2>${produto.nome}</h2><p>${produto.descricao}</p><p>R$ ${produto.preco}</p>`;
            container.appendChild(item);
        });
    })
    .catch(error => console.error('Erro ao carregar produtos:', error));
