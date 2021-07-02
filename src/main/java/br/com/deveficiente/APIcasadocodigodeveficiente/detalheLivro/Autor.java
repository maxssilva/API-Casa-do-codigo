package br.com.deveficiente.APIcasadocodigodeveficiente.detalheLivro;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.URL;

public class Autor {

		
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
