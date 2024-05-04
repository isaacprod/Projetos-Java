package ProjetosJava;

import java.util.Locale;
import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declarando: Largura, Comprimento, Metro Quadrado, Area e Preço:
        double Largura = sc.nextDouble();
        double Comprimento = sc.nextDouble();
        double MetroQuadrado = sc.nextDouble();

        double Area = Largura * Comprimento;
        double Preco = Area * MetroQuadrado;

        System.out.printf("Area = m²%.0f%n", Area);
        System.out.printf("Preço = R$ %.2f%n", Preco);

        sc.close();
    }
}
