package Sistema;

import Secretaria.Aluno;

public class Sistema_de_Cobranca {
	
	private double valor;
	private final static double PRECO_DISC = 1234.56; //Valor por disciplina

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static double cobranca(Aluno a) {
		
		return (a.cursando.size() * PRECO_DISC);
		
	}

}
