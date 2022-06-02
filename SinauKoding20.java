package com;

import java.util.Scanner;

public class SinauKoding20 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int Angka = scan.nextInt();
        int x=1;
        while(x<51){
            if(x%3==0){
                System.out.println("Angka "+x+" habis dibagi 3");
            }
            else{
                System.out.println("Angka "+x+" tidak habis dibagi 3");
            }
            x++;
        }
    }
}
