package br.edu.up.ads.view;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

/**
 * Classe JSF para operações de Progressão Aritmética
 * 
 * @author andre
 *
 */
@Named
@ViewScoped
public class PABean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5810180564483591242L;

	/**
	 * Primeiro termo da PA
	 */
	@NotNull
	private Double a1;

	/**
	 * Representa o enésimo termo da PA.
	 */
	@NotNull
	private Integer n;

	/**
	 * Representa a Razão da PA
	 */
	@NotNull
	private Double r;

	public void calcular() {
		Double an = Exercicios.calcularNEsimoTermo(this.a1, this.n, this.r);
		Messages.addGlobalInfo("O elemento an é: {0}", an);
	}

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

}
