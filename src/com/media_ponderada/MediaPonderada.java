package com.media_ponderada;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculando as notas: ");
        System.out.println("---------------------");
        System.out.print("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = scan.nextDouble();
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.printf("Média final: %.1f", media);
    }
}
