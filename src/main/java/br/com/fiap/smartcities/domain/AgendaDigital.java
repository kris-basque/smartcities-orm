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
@Table(name = "tbl_agenda_digital")
public class AgendaDigital {
	
	@Id
	@SequenceGenerator(name="agendaDigital",sequenceName="sq_tbl_agenda_digital",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="agendaDigital")
	@Column(name = "id_agenda_digital")
	private Integer id;
	
	@Column(name="nome_atividade",length=60)
	private String nomeAtividade;
	
	@Column(name="descricao_atividade",length=150)
	private String descricaoAtividade;
	
	@Column(name="nota_atividade",length=4)
	private Float notaAtividade;
	
	@Column(name="status_atividade",length=40)
	private String statusAtividade;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_entrega_atividade")
	private Calendar dataEntrega;
	
	@Column(name="fotos_atividade",length=40)
	private String fotosAtividade;
	
	@Column(name="comunicados",length=350)
	private String comunicados;

	public AgendaDigital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgendaDigital(Integer id, String nomeAtividade, String descricaoAtividade, Float notaAtividade,
			String statusAtividade, Calendar dataEntrega, String fotosAtividade, String comunicados) {
		super();
		this.id = id;
		this.nomeAtividade = nomeAtividade;
		this.descricaoAtividade = descricaoAtividade;
		this.notaAtividade = notaAtividade;
		this.statusAtividade = statusAtividade;
		this.dataEntrega = dataEntrega;
		this.fotosAtividade = fotosAtividade;
		this.comunicados = comunicados;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}

	public void setDescricaoAtividade(String descricaoAtividade) {
		this.descricaoAtividade = descricaoAtividade;
	}

	public Float getNotaAtividade() {
		return notaAtividade;
	}

	public void setNotaAtividade(Float notaAtividade) {
		this.notaAtividade = notaAtividade;
	}

	public String getStatusAtividade() {
		return statusAtividade;
	}

	public void setStatusAtividade(String statusAtividade) {
		this.statusAtividade = statusAtividade;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getFotosAtividade() {
		return fotosAtividade;
	}

	public void setFotosAtividade(String fotosAtividade) {
		this.fotosAtividade = fotosAtividade;
	}

	public String getComunicados() {
		return comunicados;
	}

	public void setComunicados(String comunicados) {
		this.comunicados = comunicados;
	}
	
	


}
