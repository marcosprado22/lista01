package br.edu.up.ads.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import br.edu.up.ads.lista01.Exercicios;

@Named
@RequestScoped
public class DistanciaBean {
	
	@NotNull
	private Integer x1;
	
	@NotNull
	private Integer y1;
	
	@NotNull
	private Integer x2;
	
	@NotNull
	private Integer y2;
	
	public DistanciaBean() {
		// nada a fazer
	}
	
	public void calcular() {
	 double distanciaEntrePontos = Exercicios.calcularDistanciaEntrePontos(this.x1, this.y1, this.x2, this.y2);
	 Messages.addGlobalInfo("A distância é: {0}", distanciaEntrePontos);
	}
	
	public Integer getX1() {
		return x1;
	}

	public void setX1(Integer x1) {
		this.x1 = x1;
	}

	public Integer getY1() {
		return y1;
	}

	public void setY1(Integer y1) {
		this.y1 = y1;
	}

	public Integer getX2() {
		return x2;
	}

	public void setX2(Integer x2) {
		this.x2 = x2;
	}

	public Integer getY2() {
		return y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

}
