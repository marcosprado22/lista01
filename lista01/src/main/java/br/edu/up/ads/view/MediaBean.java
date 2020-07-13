package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped

public class MediaBean {
	
	@NotNull
	private double valor1;
	
	@NotNull
	private double valor2;
	
	@NotNull
	private double valor3;

	public MediaBean() {
		//Nada a fazer
	}
	
	public void calcular() {
		double mediaAritmretica = Exercicios.mediaAritmetica(this.valor1, this.valor2, this.valor3);
		double mediaHarmonica =	Exercicios.mediaHarmonica(this.valor1, this.valor2, this.valor3);
		Messages.addGlobalInfo("Média aritmética: {0}", mediaAritmretica);
		Messages.addGlobalInfo("Média harmônica: {0}", mediaHarmonica);
		Messages.addGlobalInfo("Ambas as médias: {0}, {1}", mediaAritmretica, mediaHarmonica);
		
	}
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}

}
