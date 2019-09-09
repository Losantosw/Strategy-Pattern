package br.com.strategypattern.example;

public interface CarStrategy {
	public double calcSellCar(double value, double kms);
}

/*
	O objetivo do strategy � oferecer uma familia de classes para cada varia��o
	de algor�timo. Esse padr�o � muito �til quando muitas classes relacionadas 
	diferem em seu comportameto. Evita a exposi��o das estruturas.
*/