package com;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
        int x=1;
        while(x<51){
            if(x%3==0 && x%5==0){
                System.out.println("Angka "+x+" habis dibagi 3 dan 5");
            }
            else if(x%3==0){
                System.out.println("Angka "+x+" habis dibagi 3");
            }
            else if(x%5==0){
                System.out.println("Angka "+x+" habis dibagi 5");
            }
            x++;
        }
    }
}
