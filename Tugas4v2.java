import java.util.Scanner;

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
            int object = scan.nextInt();
            selectObject bd = new selectObject();
            bd.select(object);
        }
    }
}

interface Formula {
    public float keliling();

    public float luas();
}

class Persegi implements Formula {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }
}

class PersegiPanjang implements Formula {
    private float x, y;

    public PersegiPanjang(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float keliling() {
        return 2 * (x + y);
    }

    @Override
    public float luas() {
        return x * y;
    }
}

class Segitiga implements Formula {
    private float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float keliling() {
        return (float) (alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }
}

class Lingkaran implements Formula {
    private float x;

    public Lingkaran(float x) {
        this.x = x;
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * x);
    }

    @Override
    public float luas() {
        return (float) (Math.PI * Math.pow(x, 2));
    }
}

class selectObject {
    void select(int x) {
        if (x == 5) {
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

        switch (x) {
            case 1:
                System.out.println("------------------------------------------------");
                System.out.print("Masukkan panjang sisi persegi (cm) : ");
                float sisi = scan.nextInt();
                Persegi persegi = new Persegi(sisi);
                System.out.println("------------------------------------------------");
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println(persegi.keliling());
                        break;
                    case 2:
                        System.out.println(persegi.luas());
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 2:
                System.out.println("------------------------------------------------");
                System.out.print("Masukkan panjang (cm) : ");
                float panjang = scan.nextFloat();
                System.out.print("Masukkan lebar (cm) : ");
                float lebar = scan.nextFloat();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("------------------------------------------------");
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println(persegiPanjang.keliling());
                        break;
                    case 2:
                        System.out.println(persegiPanjang.luas());
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 3:
                System.out.println("------------------------------------------------");
                System.out.print("Masukkan alas (cm) : ");
                float alas = scan.nextFloat();
                System.out.print("Masukkan tinggi (cm) : ");
                float tinggi = scan.nextFloat();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                System.out.println("------------------------------------------------");
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println(segitiga.keliling());
                        break;
                    case 2:
                        System.out.println(segitiga.luas());
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 4:
                System.out.println("------------------------------------------------");
                System.out.print("Masukkan jari-jari (cm) : ");
                float jari = scan.nextFloat();
                Lingkaran lingkaran = new Lingkaran(jari);
                System.out.println("------------------------------------------------");
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println(lingkaran.keliling());
                        break;
                    case 2:
                        System.out.println(lingkaran.luas());
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
