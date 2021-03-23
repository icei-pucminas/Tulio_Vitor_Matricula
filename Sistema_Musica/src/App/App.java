package App;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Secretaria.*;
import Sistema.*;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
 int op = 0;
 do {
	 System.out.println("Escolha uma opcao:	");
	 System.out.println("Digite 1  Criar aluno:");
	 System.out.println("Digite 2 Criar Professor:");
	 System.out.println("Digite 3 Criar Secretaria:");
	 System.out.println("Digite 4 fazer login:");
	 System.out.println("Digite 8 para sair:");
	 op = sc.nextInt();
	 
	 String nome;
	 String login;
	 String senha;
	
switch(op) {

		case 1:
			nome = sc.nextLine();
			System.out.println("Digite seu nome:");
			nome = sc.nextLine();
			System.out.println("Digite seu login:");
			login = sc.nextLine();
			System.out.println("Digite sua senha:");
			senha = sc.nextLine();
			Usuario.newUser(1,nome,login,senha);
			System.out.flush(); 
			break;
		case 2:
			nome = sc.nextLine();
			System.out.println("Digite seu nome:");
			nome = sc.nextLine();
			System.out.println("Digite seu login:");
			login = sc.nextLine();
			System.out.println("Digite sua senha:");
			senha = sc.nextLine();
			Usuario.newUser(2,nome,login,senha);
			
			break;
			case 3:
				nome = sc.nextLine();
				System.out.println("Digite seu nome:");
				nome = sc.nextLine();
				System.out.println("Digite seu login:");
				login = sc.nextLine();
				System.out.println("Digite sua senha:");
				senha = sc.nextLine();
				Usuario.newUser(3,nome,login,senha);
				break;
		case 4:
			nome = sc.nextLine();
            System.out.println("Digite seu login:");
            login = sc.nextLine();
			System.out.println("Digite sua senha:");
			senha = sc.nextLine();
			Usuario.userLogin(login,senha);
			
			Usuario u = Usuario.userLogin(login,senha);
			
			if(u.getTipo() == 2) {
			 do {
				 System.out.println("Escolha uma opcao:	");
				 System.out.println("Digite 1 ver as suas materias:");
				 System.out.println("Digite 9 para voltar ao menu anterior:");
				 op = sc.nextInt();
				 switch(op) {
				 case 1:
					 
			        break;
				
				 case 9:
					 
				     break;
				 
				 }
			 }while (op !=9); 
			
			}
			
			else if(u.getTipo() == 1) {
				 do {
					 System.out.println("Escolha uma opcao:	");
					 System.out.println("Digite 1 fazer matricula em disciplina:");
					 System.out.println("Digite 2 Cancelar matricula:");
					 System.out.println("Digite 3 valor total a pagar:");
					 System.out.println("Digite 9 para voltar ao menu anterior:");
					 op = sc.nextInt();
					 Aluno a = (Aluno) Usuario.userLogin(login,senha);
					 switch(op) {
					 case 1:
						
						 nome = sc.nextLine();
						 System.out.println("Digite o nome da disciplina:"); 
						 nome = sc.nextLine();
						 for (int i=0; i<Secretaria.disciplina.size();i++) {
								if (Secretaria.disciplina.get(i).getNome().equals(nome)) {
									Aluno.matricular(a, Secretaria.disciplina.get(i) );
								}
								}
						
						 
				        break;
					 case 2:
						
						 nome = sc.nextLine();
						 System.out.println("Digite o nome da disciplina:"); 
						 nome = sc.nextLine();
						 for (int i=0; i<Secretaria.disciplina.size();i++) {
								if (Secretaria.disciplina.get(i).getNome().equals(nome)) {
									Aluno.desmatricular(Secretaria.disciplina.get(i));
								}
						 }
					     break;
					 case 3:
							
						System.out.println(Sistema_de_Cobranca.cobranca(a));
					     break;
					 case 9:
						 
					     break;
					 
					 }
				 }while (op !=9); 
			}
			else if(u.getTipo() == 3) {
				 do {
					 System.out.println("Escolha uma opcao:	");
					 System.out.println("Digite 1 criar curso e adicionar disciplinas:");
					 System.out.println("Digite 9 para voltar ao menu anterior:");
					 op = sc.nextInt();
					 switch(op) {
					 case 1:
						   int numCreditos = 0;
						   String periodo;
						   Boolean status;
						   String nomep;
						   Professor p;
						   Disciplina d;
						   
						    nome = sc.nextLine();
							System.out.println("Digite o nome do curso:");
							nome = sc.nextLine();
							System.out.println("Digite seu numero de creditos:");
							numCreditos = sc.nextInt();
							Secretaria.criarCurso(nome,numCreditos);
							
							System.out.println("Digite o nome da disciplina:");
							nome = sc.nextLine();
							System.out.println("Digite o periodo:");
							periodo = sc.nextLine();
							System.out.println("Digite o Status ( true - false):");
							status = sc.nextBoolean();
							System.out.println("Digite o nome do professor:");
							nomep = sc.nextLine();
							Secretaria.criarDisciplina(nome,periodo,status);
							
				        break;
					
					 case 9:
						 
					     break;
					 
					 }
				 }while (op !=9); 
			}
			break;
		case 8:
			System.out.println("Até breve!");
			break;
		
		}
	}while (op !=8);
	}
}
