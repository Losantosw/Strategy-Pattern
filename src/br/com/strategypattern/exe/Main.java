package br.com.strategypattern.exe;

import java.util.Scanner;

import br.com.strategypattern.example.CarStrategy;
import br.com.strategypattern.example.Hatch;
import br.com.strategypattern.example.Sedan;

public class Main {
	
	public static void main(String[] args) {
		CarStrategy sellCar = null;
		Scanner sc = new Scanner(System.in);
		int typeCar, value=0, kms=0;
		
		do {
			System.out.println("---- Calculo de venda de carros ----");
			System.out.println("");
			
			System.out.println("Digite o preço do carro: ");
			value = sc.nextInt();
			
			System.out.println("Digite os kms rodados: ");
			kms = sc.nextInt();
			
			System.out.println("Escolha o modelo do carro: 1-Sedan, 2-Hatch");
			System.out.println("Ou digite 0 para sair!");
			typeCar = sc.nextInt();System.out.print("\n");
			
			
			
			switch (typeCar) {
				case 1:
					sellCar = new Sedan();
					double sellCarSedan = sellCar.calcSellCar(value, kms);
					System.out.println(sellCarSedan);
				break;
				case 2:
					sellCar = new Hatch();
					double sellCarHarch = sellCar.calcSellCar(value, kms);
					System.out.println(sellCarHarch);
				break;
				case 0:
					System.out.println("Programa encerrado!");
					System.exit(0);
				break;
				default:
					System.out.println("Opção Inválida!");
				break;
			}
			
		} while(typeCar!=0);
	}
}
