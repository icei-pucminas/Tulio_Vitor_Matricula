package Secretaria;

import java.util.ArrayList;

public class Aluno extends Usuario {

	private static int NObrigatoria;
	private final static int NOBRIGATORIAMAX = 4;
	private static int NOpcional;
	private final static int NOPCIONALMAX = 2;
	public static ArrayList<Disciplina> cursando = new ArrayList<>();

	public int getNObrigatoria() {
		return NObrigatoria;
	}

	public void setNObrigatoria(int nObrigatoria) {
		NObrigatoria = nObrigatoria;
	}

	public int getNOpcional() {
		return NOpcional;
	}

	public void setNOpcional(int nOpcional) {
		NOpcional = nOpcional;
	}

	public int getNOBRIGATORIAMAX() {
		return NOBRIGATORIAMAX;
	}

	public int getNOPCIONALMAX() {
		return NOPCIONALMAX;
	}

	// Cria novo aluno
	public Aluno(String nome, String login, String senha) {
		super(1, nome, login, senha);
		NOpcional = 0;
		NObrigatoria = 0;
	}
	
	//Retorna o numero de disciplinas que o aluno esta matriculado (max = 6, sendo 4 obrig e 2 opt)
	public int matriculado() {
		return cursando.size();
	}
	
	//Matricula aluno em uma disciplina
	public static void matricular(Aluno a, Disciplina d) {
		
		//Confere o tipo de disciplina (Obrig ou Optat), confere o limite de matricula e o limite de alunos da disciplina
		if(d.isStatus() == false && NObrigatoria <= NOBRIGATORIAMAX && d.getNAlunosMatri() <= d.getNAlunosMax()) {
			NObrigatoria += NObrigatoria;
			
			//Adiciona a disciplina
			cursando.add(d);
			System.out.println("Aluno matriculado em: "+d.getNome()+" periodo "+d.getPeriodo());
			
			//Disciplina aumenta em 1 a quantidade de matriculados e adiciona o aluno na lista de matriculados
			d.setNAlunosMatri(d.getNAlunosMatri()+1);
			d.alunos.add(a);
		}else if(NOpcional <= NOPCIONALMAX && d.getNAlunosMatri() <= d.getNAlunosMax()){
			NOpcional += NOpcional;
			
			//Adiciona a disciplina
			cursando.add(d);
			System.out.println("Aluno matriculado em: "+d.getNome()+" periodo "+d.getPeriodo());
			
			//Disciplina aumenta em 1 a quantidade de matriculados e adiciona o aluno na lista de matriculados
			d.setNAlunosMatri(d.getNAlunosMatri()+1);
			d.alunos.add(a);
		}else System.out.println("Limite maximo de inscricoes atingido!");
		
	}
	
	//cancela matricula em uma disciplina
	public static void desmatricular(Disciplina d) {
		cursando.remove(d);
		System.out.println("Aluno nao esta mais matriculado em: "+d.getNome()+" periodo "+d.getPeriodo());
	}
	
	//lista disciplinas matriculadas
	public void listarMatriculas(){
		for(int i = 0; i < cursando.size(); i++) {
			String a;
			if(cursando.get(i).isStatus()==false) {
				a = "Obrigatoria";
			}else a = "Opcional";
			System.out.println(i+"- "+cursando.get(i).getNome()+"["+a+"]");
		}
	}

}
