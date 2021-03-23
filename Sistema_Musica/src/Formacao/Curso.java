package Formacao;

import java.util.ArrayList;

public class Curso {
 private String Nome;
 private int NumCreditos;
 ArrayList<Disciplina> dis = new ArrayList<>();
 
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public int getNumCreditos() {
	return NumCreditos;
}
public void setNumCreditos(int numCreditos) {
	NumCreditos = numCreditos;
}

public Curso(String nome, int numCreditos) {
	Nome = nome;
	NumCreditos = numCreditos;
}

public Curso(String nome, int numCreditos, ArrayList<Disciplina> dis) {
	super();
	Nome = nome;
	NumCreditos = numCreditos;
	this.dis = dis;
}
public void addDisciplina(Disciplina d) {
	dis.add(d);
}


 
}
