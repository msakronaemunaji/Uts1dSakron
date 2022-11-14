import java.util.Random;
import java.util.Scanner;
public class JawabanNoTiga {
    int DataArea = 5;
    static int jumlah = 50;
    public static String[] K_Kudus = new String[5];
    public static String[] B_Jakarta = new String[20];
    public static String[] AB_Jogja = new String[10];
    public static String[] T_Karawang = new String[5];
    public static String[] AD_Solo = new String[10];

    public static void PrintInfoPlat(){
        int totalK_Kudus=0;
        int totalSisaPlat=0;
        for (int index=0; index<K_Kudus.length;index++){
            if (K_Kudus[index] !=null){
                totalK_Kudus++;
            }
        }
        int totalB_Jakarta=0;
        for (int index=0; index<B_Jakarta.length;index++){
            if (B_Jakarta[index] !=null){
                totalB_Jakarta++;
            }
        }
        int totalAB_Jogja=0;
        for (int index=0; index<AB_Jogja.length;index++){
            if (AB_Jogja[index] !=null){
                totalAB_Jogja++;
            }
        }
        int totalT_Karawang=0;
        for (int index=0; index<T_Karawang.length;index++){
            if (T_Karawang[index] !=null){
                totalT_Karawang++;
            }
        }
        int totalAD_Solo=0;
        for (int index=0; index<AD_Solo.length;index++){
            if (AD_Solo[index] !=null){
                totalAD_Solo++;
            }
        }
        totalSisaPlat = jumlah - totalK_Kudus - totalB_Jakarta - totalAB_Jogja - totalT_Karawang - totalAD_Solo;
        System.out.println("Total Plat K_Kudus: " + totalK_Kudus + " | Total Plat B_Jakarta : " + totalB_Jakarta + " | Total Plat AB_Jogja: " + totalAB_Jogja + " | Total Plat T_Karawang: " + totalT_Karawang + " | Total Plat AD_Solo: " + totalAD_Solo);
        System.out.println("Jumlah Seluruh Plat : " + jumlah + " | Total Sisa Plat: " + totalSisaPlat);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String plat){
        int indexNow = 0;
        for (int index=0; index<myArray.length;index++){
            if (myArray[index] !=null){
                indexNow = index+1;
            }
        }
        if (indexNow<myArray.length){
            myArray[indexNow] = plat;
        }
    }
    public static void asalPlat(int nomorPlat,String plat){
        switch (nomorPlat){
            case 1:
                CheckIndexArray(K_Kudus,plat);
                System.out.println("Anda Berasal Dari Kudus");
                PrintInfoPlat();

                break;
            case 2:
                CheckIndexArray(B_Jakarta,plat);
                System.out.println("Anda Berasal Dari Jakarta");
                PrintInfoPlat();

                break;
            case 3:
                CheckIndexArray(AB_Jogja,plat);
                System.out.println("Anda Berasal Dari Jogja");
                PrintInfoPlat();

                break;
            case 4:
                CheckIndexArray(T_Karawang,plat);
                System.out.println("Anda Berasal Dari Karawang");
                PrintInfoPlat();

                break;
            case 5:
                CheckIndexArray(AD_Solo,plat);
                System.out.println("Anda Berasal Dari Solo");
                PrintInfoPlat();

                break;




        }
    }
    public static void inputPlat(){
        Scanner inputData = new Scanner (System.in);
        while(true){
            System.out.println("Masukkan Plat = ");
            String MasukkanPlat = inputData.nextLine();
            if (MasukkanPlat.isBlank()){
                System.out.println("Nomor Plat yang wajib diisi ");
                inputPlat();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                asalPlat(JenisRandom,MasukkanPlat);
            }
        }
    }
    public static void main(String[] args){
        inputPlat();
        //
    }
}
