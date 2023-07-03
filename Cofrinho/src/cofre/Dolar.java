package cofre;

public class Dolar extends Moeda{

	double quantidade;
	
	//CRIAÇÃO DO METODO DE CHAMADA DA CLASSE
	public Dolar(double quantidade) {
		this.quantidade = quantidade;
	}

	//METODOS DA SUPERCLASSE MOEDA
	double info() {
		return 0;
	}

	void converter() {
		
	}

	public String toString() {
		return "Dolar USD " + quantidade;
	}

	double getQuantidade() {
		return quantidade;
	}

}
