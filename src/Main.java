import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input nama & tujuan
        System.out.print("Masukkan nama penumpang: ");
        String nama = input.nextLine();

        System.out.print("Masukkan tujuan: ");
        String tujuan = input.nextLine();

        // Pilih jenis tiket
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        Tiket tiket;

        if (pilihan == 1) {
            tiket = new TiketEkonomi(nama, tujuan);
        } else {
            tiket = new TiketBisnis(nama, tujuan);
        }

        // Output tiket
        System.out.println("\n=== DATA TIKET ===");
        System.out.println("Penumpang: " + tiket.getNamaPenumpang());
        System.out.println("Tujuan: " + tiket.getTujuan());
        System.out.println("Harga: " + (int)tiket.hitungHarga());

        // Pilih pembayaran
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Transfer");
        System.out.println("2. E-Wallet");
        System.out.print("Pilihan: ");
        int bayar = input.nextInt();

        Pembayaran pembayaran;

        if (bayar == 1) {
            pembayaran = new PembayaranTransfer();
        } else {
            pembayaran = new PembayaranEWallet();
        }

        pembayaran.bayar((int)tiket.hitungHarga());

        input.close();
    }
}