package br.com.strategypattern.example;

public class Hatch implements CarStrategy{
    @Override
    public double calcSellCar(double value, double kms) {
        double sellValue;
        sellValue = value - (kms * 20);
        
        return sellValue;
    }   
}

