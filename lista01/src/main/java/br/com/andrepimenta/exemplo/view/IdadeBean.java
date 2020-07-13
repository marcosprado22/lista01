package br.com.andrepimenta.exemplo.view;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.omnifaces.util.Messages;

/**
 * BackingBean para testes. Faz o c�lculo da idade de uma pessoa de acordo com
 * sua data de nascimento.
 * 
 * @author Andre Pimenta
 *
 */
@Named
@ViewScoped
public class IdadeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4373909204128839746L;

	@NotNull(message = "Campo obrigat�rio!")
	@Past(message = "Apenas datas no passado ser�o aceitas.")
	private Date dataNascimento;
	
	public IdadeBean() {
		// default Constructor
	}

	public void verificarIdade() {
		// Calcula a idade pela data de nascimento
		Integer idade = this.calcularIdadeComNascimentoEm(this.dataNascimento);
		// Envia uma mensagem para a tela do su�rio com a classifica��o Global
		Messages.addGlobal(FacesMessage.SEVERITY_INFO, "Ok, sua idade � {0}", idade);
	}

	/**
	 * Returns a Idade a partir da data de nascimento.
	 * 
	 * @param birthDate
	 * @return a idade em anos.
	 */
	private Integer calcularIdadeComNascimentoEm(Date birthDate) {
		// Recupera a Data e hora atual.
		LocalDate now = LocalDate.now();
		// Converte Date para LocalDate.
		LocalDate birth = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		// Calcula o per�odo entre as duas datas.
		Period period = Period.between(birth, now);
		// Pega a quantidade de anos do per�odo.
		return period.getYears();
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
