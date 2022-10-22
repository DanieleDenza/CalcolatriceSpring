
package it.daniele.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.daniele.Calcolatrice;
import it.daniele.Operazione;

@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)
public class Config {

	@Bean
	public Operazione getOperazione() {
		return new Operazione();
	}
}