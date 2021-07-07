package br.com.deveficiente.APIcasadocodigodeveficiente.detalheLivro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

	  Optional<Categoria> findByNome (String nome);
	
	 

}
