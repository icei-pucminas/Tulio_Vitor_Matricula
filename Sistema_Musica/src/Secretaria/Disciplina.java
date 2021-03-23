package Secretaria;

import java.util.ArrayList;

public class Disciplina {
 private boolean Status;
 private String Nome;
 private String Periodo;
 private Professor professor;
 private int NAlunosMatri;
 private final int NALUNOSMAX = 60;
 ArrayList<Aluno> alunos = new ArrayList<>();
 
 //False = Obrigadtoria
 //True = Opcional
public boolean isStatus() {
	return Status;
}
public void setStatus(boolean status) {
	Status = status;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getPeriodo() {
	return Periodo;
}
public void setPeriodo(String periodo) {
	Periodo = periodo;
}
public int getNAlunosMatri() {
	return NAlunosMatri;
}
public void setNAlunosMatri(int nAlunosMatri) {
	NAlunosMatri = nAlunosMatri;
}
public int getNAlunosMax() {
	return NALUNOSMAX;
}

public Professor getProfessor() {
	return professor;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}
public Disciplina(String nome, String periodo, boolean status) {
	Status = status;
	Nome = nome;
	Periodo = periodo;
	NAlunosMatri = 0;
	
}

//Lista alunos matriculados na disciplina
public void listarAlunos(Disciplina d) {
	
	System.out.println("Alunos matriculados em "+d.getNome()+":");
	for(int i = 0; i < alunos.size(); i++) {
		System.out.println(1+"- "+alunos.get(i).getNome());
	}
}



 
 

 
}
