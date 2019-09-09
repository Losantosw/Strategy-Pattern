package br.com.strategypattern.example;

public class Sedan implements CarStrategy{
    @Override
    public double calcSellCar(double value, double kms) {
        double sellValue;
        sellValue = value - (kms * 10);
        
        return sellValue;
    }  
}
