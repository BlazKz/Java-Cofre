//ALUNO: MATEUS DE MELLO BLASCZAH 
//RU: 4178278
package cofre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// CRIAÇÃO DA CHAMADA DO OBJETO DA CLASSE COFRINHO
		Cofrinho cofrinho = new Cofrinho();
		
		//CRIAÇÃO DAS VARIAVEIS 
		int op = 0;
		double valor;
		int tipoMoeda;
		Cofrinho moeda;
		
		//LOOP DO MENU PRINCIPAL
		while(op!=5) {
			
			System.out.println(" ---- MENU COFRINHO FAJUTO ----");
			System.out.println("| 1 - ADICIONAR MOEDA           |");
			System.out.println("| 2 - REMOVER MOEDA             |");
			System.out.println("| 3 - LISTAR MOEDAS             |");
			System.out.println("| 4 - TOTAL CONVERTIDO P/ BRL   |");
			System.out.println("| 5 - SAIR DO COFRINHO FAJUTO   |");
			System.out.println(" -------------------------------");
			System.out.print(">>");
			op = teclado.nextInt();
			
			// ESCOLHA DO USUARIO PASSANDO PELO SWITCH CASE
			switch(op) {
			
			// MENU DE ADIÇÃO DE MOEDA
			case 1:	
				
				// MENU PARA IDENTIFICAR QUAL MOEDA A SER ADICIONADA
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println(" ---- MENU ADICIONAR MOEDA  ----");
					System.out.println("| 1 - REAL (BRL)                |");
					System.out.println("| 2 - DOLAR (USD)               |");
					System.out.println("| 3 - EURO (EUR)                |");
					System.out.println(" -------------------------------");
					System.out.print(">>");
					tipoMoeda = teclado.nextInt();
				}
				// VALOR PARA SER DEPOSITADO
				System.out.println("VALOR DO DEPOSITO:");
				System.out.println(">>");
				valor = teclado.nextDouble();
				
				moeda = null;
				
				// VERIFICAÇÃO DO TIPO DE MOEDA ESCOLHIDA PARA A CRIAÇÃO DO ARRAY
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				else if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				else {
					moeda = new Euro(valor);
				}
				// CHAMADA DA CLASSE COFRINHO PARA A ADIÇÃO DA MOEDA
				cofrinho.adicionar((Moeda) moeda);
				
				break;
				
			// MENU PARA REMOÇÃO DA MOEDA
			case 2: 
				
				// IDENTIFICAÇÃO DO TIPO DE MOEDA A SER REMOVIDO
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println(" ----  MENU REMOVER MOEDA   ----");
					System.out.println("| 1 - REAL (BRL)                |");
					System.out.println("| 2 - DOLAR (USD)               |");
					System.out.println("| 3 - EURO (EUR)                |");
					System.out.println(" -------------------------------");
					System.out.print(">>");
					tipoMoeda = teclado.nextInt();
				}
				//O VALOR REFERENTE A MOEDA PARA SER REMOVIDO
				System.out.println("VALOR DA RETIRADA:");
				System.out.println(">>");
				valor = teclado.nextDouble();
				
				//IDENTIFICAÇÃO DO TIPO DE MOEDA
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				else if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				else {
					moeda = new Euro(valor);
				}
				// CHAMADA DO METODO REMOVER EM COFRINHO
				cofrinho.remover(moeda);
				
				break;
				
			// MENU LISTAGEM DAS MOEDAS ADICIONADAS && CHAMADA DO METODO LISTAGEMMOEDA NA CLASSE COFRINHO
			case 3:
				cofrinho.listagemMoeda();
				break;
				
			// MENU TOTAL DOS VALORES CONVERTIDOS PARA REAL && CHAMADA METODO DE CONVERSAO DE COFRINHO
			case 4:
				cofrinho.totalConvertido();
				break;
				
			// OPÇÃO DE SAIR DO PROGRAMA
			case 5:
				break;
				
			// METODO DEFAULT CASO NUMERO DIGITADO PELO USUARIO NAO ESTIVER NOS PARAMETROS
			default:
				System.out.println("");
				System.out.println("OPCAO INVALIDA!");
				System.out.println("");
			}
		}
		
	}

}
