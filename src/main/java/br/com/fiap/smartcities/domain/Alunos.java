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
@Table(name="tbl_alunos")
public class Alunos {
	
	@Id
	@SequenceGenerator(name="alunos",sequenceName="sq_tbl_alunos",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="alunos")
	@Column(name="id_alunos")
	private Integer idAluno;
	
	@Column(name="nome_aluno",length=60)
	private String nomeAluno;
	
	@Column(name="sobrenome_aluno",length=180)
	private String sobrenomeAluno;
	
	@Column(name="idade_aluno",length=2)
	private Integer idadeAluno;
	
	@Column(name="endereco_aluno",length=180)
	private String enderecoAluno;
	
	@Column(name="serie_aluno",length=4)
	private String serieAluno;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_inscricao")
	private Calendar dataInscricao;
	

	public Alunos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alunos(Integer idAluno, String nomeAluno, String sobrenomeAluno, Integer idadeAluno, String enderecoAluno,
			String serieAluno, Calendar dataInscricao) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.sobrenomeAluno = sobrenomeAluno;
		this.idadeAluno = idadeAluno;
		this.enderecoAluno = enderecoAluno;
		this.serieAluno = serieAluno;
		this.dataInscricao = dataInscricao;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getSobrenomeAluno() {
		return sobrenomeAluno;
	}

	public void setSobrenomeAluno(String sobrenomeAluno) {
		this.sobrenomeAluno = sobrenomeAluno;
	}

	public Integer getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(Integer idadeAluno) {
		this.idadeAluno = idadeAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public String getSerieAluno() {
		return serieAluno;
	}

	public void setSerieAluno(String serieAluno) {
		this.serieAluno = serieAluno;
	}

	public Calendar getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Calendar dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	


	

}
