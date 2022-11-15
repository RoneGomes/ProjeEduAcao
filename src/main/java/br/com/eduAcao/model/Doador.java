package br.com.eduAcao.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Doador extends Pessoa {

	@Column(nullable = false)
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
