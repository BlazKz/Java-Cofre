package cofre;

import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
	
	// CRIAÇÃO DO ARRAYLIST DA CLASSE MOEDA
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

	// METODO EQUALS PARA A COMPARAÇÃO DOS PARAMETROS DE REMOVER MOEDA INDICADOS PELO USUARIO
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoeda, other.listaMoeda);
	}

	// METODO ADICIONAR MOEDA
	public void adicionar(Moeda moeda) {
		listaMoeda.add(moeda);
	}
	
	// METODO REMOVER MOEDA
	public void remover(Cofrinho moeda) {
		listaMoeda.remove(moeda);
	}
	
	// METODO DE LISTAGEM DAS MOEDAS
	public void listagemMoeda() {
		for(Moeda c : listaMoeda) {
			System.out.println(c);
		}
	}
	
	// METODO DE CONVERSÃO DE TODOS AS MOEDAS
	public void totalConvertido() {
		double totalEuro = 0;
		double totalDolar = 0;
		double totalReal = 0;
		
		//LOOP PARA ANDAR PELO ARRAY MOEDA
		for(Moeda c : listaMoeda) {
			
			// IDENTIFICAÇÃO DO TIPO DE MOEDA NA POSICAO C DO ARRAY
			if(c instanceof Euro) {
				totalEuro += c.getQuantidade()*c.cotacaoEuro;
			}
			else if(c instanceof Dolar) {
				totalDolar += c.getQuantidade()*c.cotacaoDolar;
			}
			else {
				totalReal += c.getQuantidade();
			}
		}
		// VARIAVEL PARA SOMA DOS VALORES E PRINT PARA INFORMAR AO USUARIO O TOTAL
		totalReal += totalDolar + totalEuro;
		System.out.printf("SALDO TOTAL R$ %.2f", totalReal);
		System.out.println("");
		System.out.println("");
		}
	}
	

