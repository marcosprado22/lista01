package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class MediaPonderadaBean {
	
	@NotNull
	private double nota1;
	
	@NotNull
	private int peso1;
	
	@NotNull
	private double nota2;
	
	@NotNull
	private int peso2;
	
	@NotNull
	private double nota3;
	
	@NotNull
	private int peso3;

	public MediaPonderadaBean() {
		// Nada a fazer
	}
	
	public void calcular() {
	 double mediaPonderada = Exercicios.mediaPonderada(this.nota1, this.peso1, this.nota2, this.peso2, this.nota3, this.peso3);
	 Messages.addGlobalInfo("Média ponderada: {0}", mediaPonderada);
	}
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public int getPeso1() {
		return peso1;
	}

	public void setPeso1(int peso1) {
		this.peso1 = peso1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public int getPeso2() {
		return peso2;
	}

	public void setPeso2(int peso2) {
		this.peso2 = peso2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public int getPeso3() {
		return peso3;
	}

	public void setPeso3(int peso3) {
		this.peso3 = peso3;
	}
	
	

}
