package Bubblesort;

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        int arr[] = {34,56,7,31,45};
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("For simplified way, press 1.  ");
        System.out.println("For optimised way, press 2.  ");
        System.out.println("For more optimised way, press 3.  ");
        int option = sc.nextInt();
        System.out.println("Initial array :  ");
        System.out.print(arr[0]);
        for (int m = 1 ; m < arr.length ; m++ ){
            System.out.print(", "+arr[m]);
        }
        System.out.println("");
        sortoperations sortoperations = new mysort();
        if (option == 1){
            sortoperations.sortm1(arr);
        }
        else if (option ==2){
            sortoperations.sortm2(arr);
        }
        else if (option == 3){
            sortoperations.sortm3(arr);
        }

        System.out.println("Sorted array :  ");
        System.out.println("");
        System.out.print(arr[0]);
        for (int n = 1 ; n < arr.length ; n++){
            System.out.print("," + arr[n]);
        }

    }
}
