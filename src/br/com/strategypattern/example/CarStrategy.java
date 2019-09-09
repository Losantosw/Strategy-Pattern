package br.com.strategypattern.example;

public interface CarStrategy {
	public double calcSellCar(double value, double kms);
}

/*
	O objetivo do strategy é oferecer uma familia de classes para cada variação
	de algorítimo. Esse padrão é muito útil quando muitas classes relacionadas 
	diferem em seu comportameto. Evita a exposição das estruturas.
*/