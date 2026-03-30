package br.com.fiap.study_apir.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.fiap.study_apir.model.Produto;

public class RepositoryProdutoMockup {
    private List<Produto> produtos = new ArrayList<>();

    public RepositoryProdutoMockup() {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Kiwi");

        produtos.add(produto);
    }

    public RepositoryProdutoMockup(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public Optional<Produto> findById(Long id) { // optional ter ou não o produto
        return produtos.stream() // stream para percorrer a lista completa em memória
                .filter(p -> p.getId().equals(id)) // filter percorre elemento por elemento
                .findFirst();
    }

}
