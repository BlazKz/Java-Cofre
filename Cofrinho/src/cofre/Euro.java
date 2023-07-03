package cofre;

public class Euro extends Moeda{

	double quantidade;	
	
	//CRIAÇÃO DO METODO DE CHAMADA DA CLASSE
	public Euro(double quantidade) {
		this.quantidade = quantidade;
	}

	//METODOS DA SUPERCLASSE MOEDA
	double info() {
		return 0;
	}

	void converter() {
	}

	public String toString() {
		return "Euro EUR " + quantidade;
	}

	double getQuantidade() {
		return quantidade;
		
	}
	
}
