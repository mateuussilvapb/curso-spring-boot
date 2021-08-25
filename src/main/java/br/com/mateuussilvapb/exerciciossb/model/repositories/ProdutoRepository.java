package br.com.mateuussilvapb.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.mateuussilvapb.exerciciossb.model.entities.Produto;

/*
 * O primeiro item a ser definido no contexto de generics para a classe 
 * CrudRepository é a classe que será trabalhada. O segundo é o tipo de dados 
 * que representa o ID da classe.
 */
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
