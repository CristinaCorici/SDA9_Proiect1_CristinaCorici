package main.java.Laborator10Mai;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int numbOfRows = sc.nextInt();
        for (int i=1; i<=numbOfRows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
