package br.eti.webstuff.estudosjdk8.entidade;

import br.eti.webstuff.estudosjdk8.enumeration.Nivel;

public class Perfil {

	private Integer id;
	private int mesesAtuando;
	private String nome;
	private Nivel nivel;
	private Boolean curso;
	private Boolean participacaoProjeto;
	private String nomeDesenvolvedor;
	private int nivelConhecimento;

	public Perfil(Integer id, String nome, Nivel nivel, Boolean curso, Boolean participacaoProjeto, int mesesAtuando,
			String nomeDesenvolvedor, int nivelConhecimento) {
		this.id = id;
		this.mesesAtuando = mesesAtuando;
		this.nome = nome;
		this.nivel = nivel;
		this.curso = curso;
		this.participacaoProjeto = participacaoProjeto;
		this.nomeDesenvolvedor = nomeDesenvolvedor;
		this.nivelConhecimento =nivelConhecimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMesesAtuando() {
		return mesesAtuando;
	}

	public void setMesesAtuando(int mesesAtuando) {
		this.mesesAtuando = mesesAtuando;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Boolean getCurso() {
		return curso;
	}

	public void setCurso(Boolean curso) {
		this.curso = curso;
	}

	public Boolean getParticipacaoProjeto() {
		return participacaoProjeto;
	}

	public void setParticipacaoProjeto(Boolean participacaoProjeto) {
		this.participacaoProjeto = participacaoProjeto;
	}

	public String getNomeDesenvolvedor() {
		return nomeDesenvolvedor;
	}

	public void setNomeDesenvolvedor(String nomeDesenvolvedor) {
		this.nomeDesenvolvedor = nomeDesenvolvedor;
	}

	public int getNivelConhecimento() {
		return nivelConhecimento;
	}

	public void setNivelConhecimento(int nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}
     
	
}
