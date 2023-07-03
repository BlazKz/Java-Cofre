package cofre;

public class Real extends Moeda{

	double quantidade;
	
	//CRIAÇÃO DO METODO DE CHAMADA DA CLASSE
	public Real(double quantidade) {
		this.quantidade = quantidade;
	}

	//METODOS DA SUPERCLASSE MOEDA
	double info() {
		return 0;
	}
	void converter() {
	}
	
	public String toString() {
		return "Real R$ " + quantidade;
	}
	
	double getQuantidade() {
		return quantidade;
	}
}
