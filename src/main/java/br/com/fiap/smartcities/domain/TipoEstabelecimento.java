package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tbl_tipo_estabelecimento")
public class TipoEstabelecimento {
	
	@Id
	@SequenceGenerator(name="tipo_estabelecimento",sequenceName="sq_tbl_tipo_estabelecimento",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tipo_estabelecimento")
	@Column(name="id_tipo_estabelecimento")
	private Integer id;
	
	@Column(name="nome_estabelecimento",length=60)
	private String nome;
	
	@Column(name="tipo_estabelecimento",length=40)
	private String tipo;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_criacao")
	private Calendar dataCriacao;
	

	public TipoEstabelecimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoEstabelecimento(Integer id, String nome, String tipo, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	

}







