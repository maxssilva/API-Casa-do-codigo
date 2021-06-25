package br.com.deveficiente.APIcasadocodigodeveficiente.detalheLivro;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudAutoresController {
	 
	@PostMapping(value =  "/api/autor")
	/*marcar como valid para validar as informações e trazer a exception de erro no corpo da 
	 * requisição e com requestBody para que
	 * o corpo da requisição venha no formato JSON, do contrario vem como form urlencoded*/
	public void novo (@Valid @RequestBody NovoAutorForm form) {
		 Autor novoAutor=form.novoAutor();
		 //parei aqui//
	 }
 
}
