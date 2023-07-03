package cofre;

public abstract class Moeda extends Cofrinho{
	
	//VALORES DAS COTAÇÕES NO DIA EM QUE FOI FEITO O PROGRAMA
	public double cotacaoDolar = 4.84;
	public double cotacaoEuro = 5.29;
	
	// CLASSE MOEDA COM METODOS ABSTRATOS INFO, CONVERTER E GETQUANTIDADE
	
	abstract double info();
	
	abstract void converter();
	
	abstract double getQuantidade();
	
}
