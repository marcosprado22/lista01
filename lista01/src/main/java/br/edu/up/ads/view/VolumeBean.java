package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class VolumeBean {

	@NotNull
	private double raio;
	
	@NotNull
	private double altura;
	
	public void calcular() {
		double calcularVolumeCilindro = Exercicios.calcularVolumeCilindro(this.raio, this.altura);
		Messages.addGlobalInfo("O volume do cilindro é: {0}", calcularVolumeCilindro);
		
		
	}
	
	
	public VolumeBean() {
		// Nada a fazer
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
