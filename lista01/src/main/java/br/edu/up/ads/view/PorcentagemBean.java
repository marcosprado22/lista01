package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class PorcentagemBean {

	@NotNull
	private double valor;
	
	@NotNull
	private double acrescimo;
	
	public void calcular() {
		double calcularAcrescimoEmPorcentagem = Exercicios.calcularAcrescimoEmPorcentagem(this.valor, this.acrescimo);
		Messages.addGlobalInfo("O valor final com a porcentagem informada é: {0}", calcularAcrescimoEmPorcentagem);
		
	}
	
	public PorcentagemBean() {
		// Nada a fazer
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
}
