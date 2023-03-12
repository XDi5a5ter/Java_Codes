import java.util.Scanner;
public class EquacaoSegundoGrau {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etapa 1");
        System.out.println("Informe o valor de 'A': ");
        int a = sc.nextInt();
        System.out.println("Informe o valor de 'B': ");
        int b = sc.nextInt();
        System.out.println("Informe o valor de 'C': ");
        int c = sc.nextInt();
        System.out.println("Etapa 2");
        try {
            double delta = calcularDelta(a, b, c);
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O valor de delta é: " + delta);
            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            throw new IllegalArgumentException("Delta é: " + delta + "\nNão existem raízes reais.");
        }
        return delta;
    }
}
