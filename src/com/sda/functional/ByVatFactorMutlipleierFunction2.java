package com.sda.functional;

import java.util.function.Function;

public class ByVatFactorMutlipleierFunction2 {

    static Function<Integer, Double> vatMultiplier = new Function<Integer, Double>() {
        @Override
        public Double apply(Integer integer) {
            return integer * 1.22;
        }
    };

    static VatMultiplier vatMultiplierLambda22 = integer -> integer * 1.22;
    static VatMultiplier vatMultiplierLambda8 = integer -> integer * 1.08;
    static VatMultiplier vatMultiplierLambda12 = integer -> integer * 1.12;


    public static void main(String[] args) {
        Double priceWithVat = vatMultiplier.apply(110);

        Double aDouble = calcuateVat(100, vatMultiplierLambda22);

    }

    static Double calcuateVat(int priceNetto, Function<Integer, Double> vatMultiplier){
        return vatMultiplier.apply(priceNetto);
    }



}
