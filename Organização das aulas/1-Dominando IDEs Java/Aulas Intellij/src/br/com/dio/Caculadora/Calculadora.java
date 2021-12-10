package br.com.dio.Caculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor"  );
        a = scan.nextInt();

        System.out.println("Digite o segundo  valor"  );
        b = scan.nextInt();

        int somar = somar(a,b);
        int subitrair = subitrair(a,b);
        int muitiplicar = mutiplicar(a,b);
        int dividir = dividir(a, b);

        System.out.println("soma é " + somar);
        System.out.println("subitração é " + subitrair);
        System.out.println("multiplicação  é " + muitiplicar);
        System.out.println("divisão é " + dividir);



    }
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subitrair(int a, int b) {
        return a - b;
    }

    public static int mutiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
