package Secretaria;

import java.util.ArrayList;

import Formacao.Curso;
import Formacao.Disciplina;

public class Secretaria extends Usuario {

	static ArrayList<Curso> curso = new ArrayList<>();
	public static ArrayList<Disciplina> disciplina = new ArrayList<>();
	
	public Secretaria(String nome, String login, String senha) {
		super(3, nome, login, senha);
	}
  
	public static void criarCurso(String nome, int numCreditos) {
		curso.add( new Curso(nome,numCreditos));		
	}
	
	public void adicDisciplina(Curso curso, Disciplina disciplina) {
		curso.addDisciplina(disciplina);
	}
	//False = Obrigadtoria
	 //True = Opcional
	public static void criarDisciplina(String nome, String periodo, boolean status) {
		disciplina.add( new Disciplina(nome,periodo,status));
	}
	
	//adiciona professor a materia
	public void adicProfessor(Disciplina d, Professor p) {
		for (int i=0; i<disciplina.size();i++) {
			if (disciplina.get(i).equals(d)) {
				disciplina.get(i).setProfessor(p);
			}
		}
		
	}
}
