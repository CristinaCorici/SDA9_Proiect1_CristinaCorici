package main.java.tablainmultirii;

import java.util.Scanner;

public class CalcOperatorDeLaTastatura1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primul numar: ");
        int numar1 = sc.nextInt();
        System.out.print("Al doilea numar: ");
        int numar2 = sc.nextInt();
        operatii(numar1, numar2);
    }

    static void operatii(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Operatie: ");
        char op = sc.nextLine().charAt(0);
        System.out.print("Rezultat = ");
        switch (op){
            case '+':
                int sum = a+b;
                System.out.println(sum);
                break;
            case '-':
                int dif = a-b;
                System.out.println(dif);
                break;
            case '*':
                int prod = a*b;
                System.out.println(prod);
                break;
                default:
                    double div = (double) a/b;
                    System.out.println(div);
                    break;
        }
    }
}
