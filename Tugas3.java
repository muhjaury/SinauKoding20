import java.text.DecimalFormat;
import java.util.Scanner;

final class BangunDatar {
    int keliling, luas;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void Persegi(int x) {
        System.out.println("------------------------------------------------");
        keliling = 4 * x;
        luas = x * x;
        System.out.println("Keliling Persegi : " + keliling + " cm");
        System.out.println("Luas Persegi : " + luas + " cm^2");
    }

    public void PersegiPanjang(int x, int y) {
        System.out.println("------------------------------------------------");
        keliling = 2 * (x + y);
        luas = x * y;
        System.out.println("Keliling Persegi Panjang : " + keliling + " cm");
        System.out.println("Luas Persegi Panjang : " + luas + " cm^2");
    }

    public void KelilingSegitiga(int x, int y, int z) {
        System.out.println("------------------------------------------------");
        keliling = x + y + z;
        System.out.println("Keliling Segitiga : " + keliling + " cm");
    }

    public void LuasSegitiga(int x, int y) {

        System.out.println("------------------------------------------------");
        double luas = (x * y) / 2;
        System.out.println("Luas Segitiga : " + df.format(luas) + " cm^2");
    }

    public void Lingkaran(int x) {
        System.out.println("------------------------------------------------");
        double keliling = 2 * Math.PI * x;
        double luas = Math.PI * Math.pow(x, 2);
        System.out.println("Keliling Lingkaran : " + df.format(keliling) + " cm");
        System.out.println("Luas Lingkaran : " + df.format(luas) + " cm^2");
    }
}

class selectBD {
    public void selectObject(int x) {
        System.out.println("------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();
        if (x == 1) {
            System.out.print("Masukkan panjang sisi persegi (cm) : ");
            int sisi = scan.nextInt();
            bd.Persegi(sisi);
        } else if (x == 2) {
            System.out.print("Masukkan panjang persegi (cm) : ");
            int sisi1 = scan.nextInt();
            System.out.print("Masukkan lebar persegi (cm) : ");
            int sisi2 = scan.nextInt();
            bd.PersegiPanjang(sisi1, sisi2);
        } else if (x == 3) {
            System.out.println("Pilih perhitungan Object : ");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.println("------------------------------------------------");
            System.out.print("Masukkan angka pilihan : ");
            int selectSegitiga = scan.nextInt();
            System.out.println("------------------------------------------------");
            if (selectSegitiga == 1) {
                System.out.print("Masukkan panjang sisi 1 (cm) : ");
                int a = scan.nextInt();
                System.out.print("Masukkan panjang sisi 2 (cm) : ");
                int b = scan.nextInt();
                System.out.print("Masukkan panjang sisi 3 (cm) : ");
                int c = scan.nextInt();
                bd.KelilingSegitiga(a, b, c);
            } else if (selectSegitiga == 2) {
                System.out.print("Masukkan panjang alas (cm) : ");
                int a = scan.nextInt();
                System.out.print("Masukkan panjang tinggi (cm) : ");
                int b = scan.nextInt();
                bd.LuasSegitiga(a, b);
            } else {
                System.out.println("Pilihan yang anda masukkan salah");
            }
        } else if (x == 4) {
            System.out.print("Masukkan panjang jari-jari (cm) : ");
            int r = scan.nextInt();
            bd.Lingkaran(r);
        } else {
            System.out.println("Object yang anda pilih tidak ditemukan");
        }
    }
}

public class Tugas3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aplikasi Hitung Keliling dan Luas Bangun Datar");
        System.out.println("Pilih Object diantara berikut :");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan angka object pilihan : ");
        int sob = scan.nextInt();
        selectBD bd = new selectBD();
        bd.selectObject(sob);
    }
}