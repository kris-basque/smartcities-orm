package br.com.fiap.smartcities.domain;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Cadastro {
	
	private static final String MARCH = null;

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
		
		TipoEstabelecimento tipo1 = new TipoEstabelecimento(0,null,"Escola", null);
		TipoEstabelecimento tipo2 = new TipoEstabelecimento(0,null,"Creche", null);
		
		
		Estabelecimento est1 = new Estabelecimento(0,"Escola Pequenos Amigos",null,null);
		Estabelecimento est2 = new Estabelecimento(0,"Escola Vagalume",null,null);
		Estabelecimento est3 = new Estabelecimento(0,"Escola Estrela Guia",null,null);
		
		SalaAula sala = new SalaAula(0,"Sala Amarela",null,null,null,null);
		SalaAula Sala1 = new SalaAula(0,"Sala Azul",null,null,null,null);
		SalaAula Sala2 = new SalaAula(0,"Sala Verde",null,null,null,null);
		SalaAula Sala3 = new SalaAula(0,"Sala Vermelha",null,null,null,null);
		
		Alunos aluno = new Alunos(0,"Pedrinho",null,null,null,null,null);
		Alunos aluno1 = new Alunos(0,"Paulino",null,null,null,null,null);
		Alunos aluno2 = new Alunos(0,"Claudinho",null,null,null,null,null);
		Alunos aluno3 = new Alunos(0,"Jorginho",null,null,null,null,null);
		
		Materias materia = new Materias(0,"Matemática","Exatas","Paulo Eduardo");
		Materias materia1 = new Materias(0,"Artes","Humanas","Marisa Cardoso");
		Materias materia2 = new Materias(0,"Ciências","Exatas","José Caetano");
		
		AgendaDigital agenda = new AgendaDigital(0,"Trabalho de Matemática",null,null, "Concluída",new GregorianCalendar(2021,Calendar.MARCH,10),null,null);
		AgendaDigital agenda1 = new AgendaDigital(0,"Trabalho de Português",null,null, "Pendente",new GregorianCalendar(2021,Calendar.APRIL,18),null,null);
		AgendaDigital agenda2 = new AgendaDigital(0,"Trabalho de Ciências",null,null, "Concluída",new GregorianCalendar(2021,Calendar.MAY,23),null,null);
		
		List<TipoEstabelecimento> listaTipo = new ArrayList<>();
		listaTipo.add(tipo1);
		listaTipo.add(tipo2);
		
		List<Estabelecimento> listaEstab = new ArrayList<>();
		listaEstab.add(est1);
		listaEstab.add(est2);
		listaEstab.add(est3);
		
		List<SalaAula> listaSala = new ArrayList<>();
		listaSala.add(sala);
		listaSala.add(Sala1);
		listaSala.add(Sala2);
		listaSala.add(Sala3);
		
		List<Alunos> listaAluno = new ArrayList<>();
		listaAluno.add(aluno);
		listaAluno.add(aluno1);
		listaAluno.add(aluno2);
		listaAluno.add(aluno3);
		
		List<Materias> listaMateria = new ArrayList<>();
		listaMateria.add(materia);
		listaMateria.add(materia1);
		listaMateria.add(materia2);
		
		List<AgendaDigital> listaAgenda = new ArrayList<>();
		listaAgenda.add(agenda);
		listaAgenda.add(agenda2);
	
		em.persist(est1);
		em.persist(est2);
		em.persist(est3);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
	}

}
