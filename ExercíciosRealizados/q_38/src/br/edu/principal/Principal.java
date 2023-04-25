package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// O programa irá receber o valor do salário e com isso resultara em calculos sobre kw
		Scanner sc = new Scanner(System.in);
		double sal, qtd = 1, valor_kw, gasto, acresc = 0, total,total_geral = 0;
		int qtd_cons = 0,tipo;
		System.out.println("Digite seu salário: ");
		sal = sc.nextDouble();
		valor_kw = sal/8;
		while(qtd != 0) {
			gasto = qtd * valor_kw;
			System.out.println("Digite o tipo: ");
			tipo = sc.nextInt();
			if(tipo == 1) {
				acresc = gasto * 0.05;
			}
			else if(tipo == 2) {
				acresc = gasto * 0.10;
			}
			else if(tipo == 3) {
				acresc = gasto * 0.15;
			}
			total = gasto + acresc;
			total_geral = total_geral + total;
			
			if(total >= 500 && total <= 1200) {
				qtd_cons = qtd_cons + 1;
			}
			System.out.println("A quantidade gasta foi: "+gasto);
			System.out.println("O valor do acréscimo foi de: "+acresc);
			System.out.println("O total é de: "+total);
			System.out.println("Quantidade: "+qtd);
			break;
		}
		System.out.println("O total geral foi: "+total_geral);
		System.out.println("A quantidade consumida foi de: "+qtd_cons);
	}
}