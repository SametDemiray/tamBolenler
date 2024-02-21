package org.example;

import java.util.Scanner;

// girilen pozitif bir tamsayının tam bölenlerini hesaplayan program.

public class Main {
    public static void main(String[] args) {

        int a,i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif Tam Sayı Giriniz : ");
        a = scanner.nextInt();
        System.out.println(a + " sayısının tam bölenleri : ");

        for (i=1; i<=a; i++)
            if(a % i == 0)
                System.out.print(i + ", ");
        scanner.close();
    }
}