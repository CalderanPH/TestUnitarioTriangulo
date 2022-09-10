package br.paulocalderan.avaliacao_prova.domain;

import br.paulocalderan.avaliacao_prova.exception.TrianguloException;

public class Triangulo {
    public static String calcular(Integer lado1, Integer lado2, Integer lado3) throws TrianguloException {
        String retorno;

        if (lado1 == null || lado2 == null || lado3 == null) {
            throw new TrianguloException("Lado não preenchido");
        } else if ((lado1 <= 0 || lado2 <= 0 || lado3 <= 0)) {
            retorno = "Não é triangulo";
        } else {
            if (lado1.equals(lado2) && lado2.equals(lado3)) {
                retorno = "Triangulo Equilatero";
            } else if (lado1.equals(lado2) || lado2.equals(lado3) || lado1.equals(lado3)) {
                retorno = "Triangulo isosceles";
            } else {
                retorno = "Triangulo escaleno";
            }
        }
        return retorno;
    }

}