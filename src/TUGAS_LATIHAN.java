/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THINKPAD
 */
 import java.util.Locale;
 import java.util.Scanner;
public class TUGAS_LATIHAN {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String karyawan[][];
        int jumlah;
        System.out.println("DATA GAJI KARYAWAN");
        System.out.print("Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());
        karyawan = new String[jumlah][4];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Karyawan ke -" + (i + 1));
            System.out.print("NAMA : ");
            karyawan[i][0] = input.nextLine();
            System.out.print("JABATAN : ");
            karyawan[i][1] = input.nextLine();
            System.out.print("GAPOK : ");
            karyawan[i][2] = input.nextLine();
            System.out.print("TUNJANGAN : ");
            karyawan[i][3] = input.nextLine();
        }
        System.out.print("\nNO\tNAMA\tJABATAN\t\tGAPOK\t\tTUNJANGAN\n");
        for (int i = 0; i < jumlah; i++) {
            long gapok = Long.parseLong(karyawan[i][2]);
            long tunjangan = Long.parseLong(karyawan[i][3]);
            Locale id = Locale.forLanguageTag("id-ID");
            System.out.println((i + 1) + "\t" + karyawan[i][0] + "\t" + karyawan[i][1] + "\t\t" + String.format(id, "%,d", gapok) + "\t" + String.format(id, "%,d", tunjangan));
        }
    }
}
