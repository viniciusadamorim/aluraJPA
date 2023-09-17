package br.com.alura.loja.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {
	public static void main(String[] args) {
		
		Produto celular = new 
				Produto("Xiaomi,Redmi", "Muito Legal", new BigDecimal ("800"), Categoria.CELULARES);
		
	
		//No Jdbc teriamos que criar uma connection
		
		EntityManager em = JPAUtil.getEntityManager();
		
		ProdutoDAO dao = new ProdutoDAO (em);
		dao.Cadastrar(celular);
		
		
	}
}
