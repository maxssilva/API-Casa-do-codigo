package br.com.deveficiente.APIcasadocodigodeveficiente.detalheLivro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long> {

}
