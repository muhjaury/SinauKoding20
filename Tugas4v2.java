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
    private float alas, tinggi, sisi1, sisi2, sisi3;

    public void KelilingSegitiga(float sisi1, float sisi2, float sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public void LuasSegitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float keliling() {
        return sisi1 + sisi2 + sisi3;
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
                        System.out.println(persegi.keliling() + " cm");
                        break;
                    case 2:
                        System.out.println(persegi.luas() + " cm^2");
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
                        System.out.println(persegiPanjang.keliling() + " cm");
                        break;
                    case 2:
                        System.out.println(persegiPanjang.luas() + " cm^2");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 3:
                System.out.println("------------------------------------------------");
                Segitiga segitiga = new Segitiga();
                switch (selectPerhitungan) {
                    case 1:
                        System.out.print("Masukkan panjang sisi 1 (cm) : ");
                        float sisi1 = scan.nextFloat();
                        System.out.print("Masukkan panjang sisi 2 (cm) : ");
                        float sisi2 = scan.nextFloat();
                        System.out.print("Masukkan panjang sisi 3 (cm) : ");
                        float sisi3 = scan.nextFloat();
                        segitiga.KelilingSegitiga(sisi1, sisi2, sisi3);
                        System.out.println("------------------------------------------------");
                        System.out.println(segitiga.keliling() + " cm");
                        break;
                    case 2:
                        System.out.print("Masukkan alas (cm) : ");
                        float alas = scan.nextFloat();
                        System.out.print("Masukkan tinggi (cm) : ");
                        float tinggi = scan.nextFloat();
                        segitiga.LuasSegitiga(alas, tinggi);
                        System.out.println("------------------------------------------------");
                        System.out.println(segitiga.luas() + " cm^2");
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
                        System.out.println(lingkaran.keliling() + " cm");
                        break;
                    case 2:
                        System.out.println(lingkaran.luas() + " cm^2");
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
