import java.util.Scanner;

public class sooal3 {

    public class check {
        static int jumlahPlat = 10;
        static int Kudus = 0;
        static int Jakarta = 0;
        static int Jogja = 0;
        static int Karawang = 0;
        static int Solo = 0;
        static int sisaKuota = 0;

        static boolean success = false;



        public static void cekPlatNomor(String kodePlat){
            if (kodePlat.contains("K")) {
                success = true;
                Kudus++;
            } else if (kodePlat.contains("B")) {
                success = true;
                Jakarta++;
            } else if (kodePlat.contains("AB")) {
                success = true;
                Jogja++;
            } else if (kodePlat.contains("T")) {
                success = true;
                Karawang++;
            } else if (kodePlat.contains("AD")) {
                success = true;
                Solo++;
            }
            else {
                success = false;
                System.out.println("kode yang anda isi tidak valid");
            }
        }

        static void plat(){
            Scanner inputData = new Scanner(System.in);
            System.out.println("masukkan plat nomor");
            String plat = inputData.nextLine();

            cekPlatNomor(plat);

            if (success){
                printPlat();
            }
        }
        public static void printPlat (){
            sisaKuota = jumlahPlat - Kudus - Jakarta - Jogja - Karawang - Solo;
            System.out.println("Total Plat Kudus " + Kudus + " | " + " Total Plat jakarta | " + Jakarta + " Total Plat Jogja | "
                    + Jogja +
                    " Total Plat Karawang | " + Karawang + " Total Plat Solo | " + Solo);
            System.out.println("jumlah penerima vaksin : " + jumlahPlat  + "Sisa kuota " + sisaKuota);
        }

    }

    public static void main(String[] args) {
        while (true){
            check.plat();
        }
    }

}