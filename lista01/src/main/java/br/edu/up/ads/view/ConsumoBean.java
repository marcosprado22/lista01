package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class ConsumoBean {
	
	@NotNull
	private double tempo;
	
	@NotNull
	private double velocidadeMedia;
	
	public void calcular() {
		double calculaLitrosConsumidos = Exercicios.calculaLitrosConsumidos(this.tempo, this.velocidadeMedia);
		Messages.addGlobalInfo("O consumo médio por litro é {0}", calculaLitrosConsumidos);
	}
	
	public ConsumoBean() {
		// Nada a fazer
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

}
