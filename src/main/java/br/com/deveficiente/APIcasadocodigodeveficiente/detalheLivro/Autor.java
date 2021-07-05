package br.com.deveficiente.APIcasadocodigodeveficiente.detalheLivro;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.URL;


@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	private @NotBlank String nome;
	
	private @NotBlank @URL String linkGithub;
	 
	@PastOrPresent
	private LocalDateTime createAt = LocalDateTime.now();

	public Autor(@NotBlank String nome, @NotBlank @URL String linkGithub) {
		this.nome = nome;
		this.linkGithub=linkGithub;		
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", linkGithub=" + linkGithub + ", createAt=" + createAt + "]";
	}
	
}
