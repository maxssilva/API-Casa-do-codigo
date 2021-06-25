package br.com.deveficiente.APIcasadocodigodeveficiente.shared.configuration;

import javax.sound.midi.Patch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;


import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public Docket api() {
		Predicate<RequestHandler>basePackage = RequestHandlerSelectors.basePackage("br.com.deveficiente.APIcasadocodigodeveficiente");
		Predicate<String>apiurls=PathSelectors.ant("/api/**");
		return new Docket(DocumentationType.SWAGGER_2).select().apis(basePackage).
				paths(apiurls).build();
						
				
	}

}
