package main.java.Laborator10Mai;

public class GetEvenAndOddFromArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        int nrPare = 0;
        int nrImpare = 0;
        for (int element : arr){
            if(element%2==0){
                nrPare++;
            } else {
                nrImpare++;
            }
        }
        System.out.println("Number of even elements in the array: " + nrPare);
        System.out.println("Number of odd elements and the array: " + nrImpare);
    }


}
