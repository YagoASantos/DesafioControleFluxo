package com.curso.controleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paramUm = scanner.nextInt();
        int paramDois = scanner.nextInt();
        try {
            contar(paramUm, paramDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }
    static void contar (int paramUm, int paramDois) {
        int params = paramDois - paramUm;
        if (params < 0) {
            throw new ParametrosInvalidosException();
        }
        for (int i = 0; i <= params; i++) {
            System.out.println(i);
        }
    }
}
class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException () {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
