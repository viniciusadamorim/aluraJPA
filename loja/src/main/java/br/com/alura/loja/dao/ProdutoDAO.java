package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Produto;

public class ProdutoDAO {
	
	private EntityManager em;

	public ProdutoDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void Cadastrar(Produto produto) {
		this.em.persist(produto);
	}

}
