
package it.daniele;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Calcolatrice {

	Operazione operazione;

	public Calcolatrice(Operazione operazione) {
		this.operazione=operazione;
	}
}