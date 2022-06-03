import java.text.DecimalFormat;
import java.util.Scanner;

abstract class BangunDatar {
    int keliling, luas;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void KelilingPersegi(int x) {
        System.out.println("------------------------------------------------");
        keliling = 4 * x;
        System.out.println("Keliling Persegi : " + keliling + " cm");
    }

    public void LuasPersegi(int x) {
        System.out.println("------------------------------------------------");
        luas = x * x;
        System.out.println("Luas Persegi : " + luas + " cm^2");
    }

    public void KelilingPersegiPanjang(int x, int y) {
        System.out.println("------------------------------------------------");
        keliling = 2 * (x + y);
        System.out.println("Keliling Persegi Panjang : " + keliling + " cm");
    }

    public void LuasPersegiPanjang(int x, int y) {
        System.out.println("------------------------------------------------");
        luas = x * y;
        System.out.println("Luas Persegi Panjang : " + luas + " cm^2");
    }

    public void KelilingSegitiga(int x, int y, int z) {
        System.out.println("------------------------------------------------");
        keliling = x + y + z;
        System.out.println("Keliling Segitiga : " + keliling + " cm");
    }

    public void LuasSegitiga(double x, double y) {

        System.out.println("------------------------------------------------");
        double luas = (x * y) / 2;
        System.out.println("Luas Segitiga : " + df.format(luas) + " cm^2");
    }

    public void KelilingLingkaran(int x) {
        System.out.println("------------------------------------------------");
        double keliling = 2 * Math.PI * x;
        System.out.println("Keliling Lingkaran : " + df.format(keliling) + " cm");
    }

    public void LuasLingkaran(int x) {
        System.out.println("------------------------------------------------");
        double luas = Math.PI * Math.pow(x, 2);
        System.out.println("Luas Lingkaran : " + df.format(luas) + " cm^2");
    }
}

class selectBD extends BangunDatar {
    public void selectObject(int x) {
        if (x == 5) {
            System.out.println("Keluar Aplikasi");
            System.exit(0);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Pilih perhitungan Object : ");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan angka perhitungan pilihan : ");
        int selectPerhitungan = scan.nextInt();
        if (x == 1) {
            System.out.print("Masukkan panjang sisi persegi (cm) : ");
            int sisi = scan.nextInt();
            if (selectPerhitungan == 1) {
                KelilingPersegi(sisi);
            } else if (selectPerhitungan == 2) {
                LuasPersegi(sisi);
            } else {
                System.out.println("Pilihan perhitungan anda salah");
            }
        } else if (x == 2) {
            System.out.print("Masukkan panjang persegi (cm) : ");
            int sisi1 = scan.nextInt();
            System.out.print("Masukkan lebar persegi (cm) : ");
            int sisi2 = scan.nextInt();
            if (selectPerhitungan == 1) {
                KelilingPersegiPanjang(sisi1, sisi2);
            } else if (selectPerhitungan == 2) {
                LuasPersegiPanjang(sisi1, sisi2);
            } else {
                System.out.println("Pilihan perhitungan anda salah");
            }
        } else if (x == 3) {
            int a, b, c;
            if (selectPerhitungan == 1) {
                System.out.print("Masukkan panjang sisi 1 (cm) : ");
                a = scan.nextInt();
                System.out.print("Masukkan panjang sisi 2 (cm) : ");
                b = scan.nextInt();
                System.out.print("Masukkan panjang sisi 3 (cm) : ");
                c = scan.nextInt();
                KelilingSegitiga(a, b, c);
            } else if (selectPerhitungan == 2) {
                System.out.print("Masukkan panjang alas (cm) : ");
                a = scan.nextInt();
                System.out.print("Masukkan panjang tinggi (cm) : ");
                b = scan.nextInt();
                LuasSegitiga(a, b);
            } else {
                System.out.println("Pilihan yang anda masukkan salah");
            }
        } else if (x == 4) {
            System.out.print("Masukkan panjang jari-jari (cm) : ");
            int r = scan.nextInt();
            if (selectPerhitungan == 1) {
                KelilingLingkaran(r);
            } else if (selectPerhitungan == 2) {
                LuasLingkaran(r);
            } else {
                System.out.println("Pilihan perhitungan anda salah");
            }
        } else {
            System.out.println("Object yang anda pilih tidak ditemukan");
        }
    }
}

public class Tugas4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Aplikasi Hitung Keliling dan Luas Bangun Datar");
            System.out.println("Pilih Object diantara berikut :");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.println("------------------------------------------------");
            System.out.print("Masukkan angka object pilihan : ");
            int sob = scan.nextInt();
            selectBD bd = new selectBD();
            bd.selectObject(sob);
        }
    }
}
