package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class FahrenheitBean {

	@NotNull
	private double celsius;

	
	public FahrenheitBean() {
		// Nada a fazer
	}	
	public void calcular() {
		  double celsiusParaFahrenheit = Exercicios.celsiusParaFahrenheit(this.celsius);
		  Messages.addGlobalInfo("A temperatura em Fehrenheit é {0}", celsiusParaFahrenheit);
		
	}
		
		
		public double getCelsius() {
			return celsius;
		}

		public void setCelsius(double celsius) {
			this.celsius = celsius;
		}

	
	
		
	
	

	
}
