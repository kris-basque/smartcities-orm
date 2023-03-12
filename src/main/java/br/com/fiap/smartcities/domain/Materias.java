package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_materias")
public class Materias {
	
	@Id
	@SequenceGenerator(name="materias",sequenceName="sq_tbl_materias",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="materias")
	@Column(name = "id_materias")
	private Integer id;
	
	@Column(name="nome_materia",length=60)
	private String nomeMateria;
	
	@Column(name="tipo_materia",length=40)
	private String tipoMateria;
	
	@Column(name="nome_professor",length=160)
	private String nomeProfessor;
	

	public Materias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materias(Integer id, String nomeMateria, String tipoMateria, String nomeProfessor) {
		super();
		this.id = id;
		this.nomeMateria = nomeMateria;
		this.tipoMateria = tipoMateria;
		this.nomeProfessor = nomeProfessor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public String getTipoMateria() {
		return tipoMateria;
	}

	public void setTipoMateria(String tipoMateria) {
		this.tipoMateria = tipoMateria;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	
	

}
