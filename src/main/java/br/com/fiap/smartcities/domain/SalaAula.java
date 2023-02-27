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
@Table(name="tbl_sala_aula")
public class SalaAula {
	
	@Id
	@SequenceGenerator(name="salaAula",sequenceName="sq_tbl_sala_aula",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="salaAula")
	@Column(name="id_sala_aula")
	private Integer idSala;
	
	@Column(name="nm_sala")
	private String nomeSala;
	
	@Column(name="nu_numeroSala")
	private String numeroSala;
	
	@Column(name="nn_periodo_aula")
	private String periodoAula;
	
	@Column(name="nm_grade_classe")
	private String gradeClasse;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_data_aulas")
	private Calendar dataAulas;

	public SalaAula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaAula(Integer idSala, String nomeSala, String numeroSala, String periodoAula, String gradeClasse,
			Calendar dataAulas) {
		super();
		this.idSala = idSala;
		this.nomeSala = nomeSala;
		this.numeroSala = numeroSala;
		this.periodoAula = periodoAula;
		this.gradeClasse = gradeClasse;
		this.dataAulas = dataAulas;
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public String getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}

	public String getPeriodoAula() {
		return periodoAula;
	}

	public void setPeriodoAula(String periodoAula) {
		this.periodoAula = periodoAula;
	}

	public String getGradeClasse() {
		return gradeClasse;
	}

	public void setGradeClasse(String gradeClasse) {
		this.gradeClasse = gradeClasse;
	}

	public Calendar getDataAulas() {
		return dataAulas;
	}

	public void setDataAulas(Calendar dataAulas) {
		this.dataAulas = dataAulas;
	}
	
	

}
