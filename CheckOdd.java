package com;

public class CheckOdd {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 50;
        int odd=0;
        for(;awal<=akhir;awal++){
            odd=0;
            for(int check = 1;check<=awal;check++){
                if(awal%check==0){
                    odd+=1;
                }
            }
            if(odd==2){
                System.out.println(awal+" bilangan prima");
            }
            else{
                System.out.println(awal+" bukan bilangan prima");
            }
        }
    }
}
