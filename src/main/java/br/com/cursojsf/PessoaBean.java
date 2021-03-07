package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	private HtmlCommandButton commandButton;
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}
	
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		if(nomes.size() > 3) {
		  commandButton.setDisabled(true);	
		}
		return "";
	
	}
	
	

	public List<String> getNomes() {
		return nomes;
	}



	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}



	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
