package main.java.Laborator10Mai;

public class ReversTwoStrings {
    public static void main(String[] args) {
        String pahar1 = "BERE";
        String pahar2 = "VIN";
        System.out.println(pahar1 + " " + pahar2);
        String pahar3 = pahar2;
        pahar2 = pahar1;
        pahar1 = pahar3;
        System.out.println(pahar1 + ' ' + pahar2);
    }
}
