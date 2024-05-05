package ExerciciosJava;
import java.util.Locale;
import java.util.Scanner;

public class Projeto2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        double Resultado = nota1 + nota2;
        System.out.printf("Nota Final: %.2f Pontos", Resultado);

        if (Resultado < 60.00) {
            System.out.println(", REPROVADO!");
        }
        else {
            System.out.println(", APROVADO!");
        }

        
        sc.close();
    }
}
