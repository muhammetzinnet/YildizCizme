package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını girin : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }

            for (int k=1; k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 1; a < n; a++){
            for (int b=1; b <= a; b++){
                System.out.print(" ");
            }
            for (int c =1; c <= 2*(n-a)-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
