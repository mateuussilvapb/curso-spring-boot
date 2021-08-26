package br.com.mateuussilvapb.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.mateuussilvapb.exerciciossb.model.entities.Produto;

/*
 * O primeiro item a ser definido no contexto de generics para a classe 
 * CrudRepository é a classe que será trabalhada. O segundo é o tipo de dados 
 * que representa o ID da classe.
 */
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	/*
	 * Por ter uma convenção, o SpringBoot entende que determinados métodos, ao
	 * começarem por 'findBy', por exemplo, são para buscar algo. Dessa forma, a
	 * própria API implementa o método, bastando apenas que esse método esteja
	 * assinado na interface
	 */
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//	finByNomeContaining
//	finByNomeIsContaining
//	finByNomeContains

//	finByNomeStartsWith
//	finByNomeEndsWith

//	finByNomeNotContaining

	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
