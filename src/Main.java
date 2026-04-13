import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // 🔹 List kereta (dynamic)
        List<Kereta> daftarKereta = new ArrayList<>();

        daftarKereta.add(new Kereta("KA Ekonomi", "Bandung", 100000, "Ekonomi"));
        daftarKereta.add(new Kereta("KA Bisnis", "Jakarta", 200000, "Bisnis"));
        daftarKereta.add(new Kereta("KA Eksekutif", "Surabaya", 300000, "Bisnis"));

        // 🔹 Tampilkan semua kereta
        System.out.println("=== DAFTAR KERETA ===");
        for (int i = 0; i < daftarKereta.size(); i++) {
            Kereta k = daftarKereta.get(i);
            System.out.println((i + 1) + ". " + k.getNama() +
                    " - " + k.getTujuan() +
                    " - " + k.getHarga());
        }

        // 🔹 Input pilihan kereta


        try {
            System.out.print("\nPilih kereta (1-3): ");
        int pilihan = input.nextInt();

        Kereta pilihKereta = daftarKereta.get(pilihan - 1);

        input.nextLine(); // buang enter

        // 🔹 Input nama penumpang
        String namaPenumpang;

    while (true) {
    try {
        System.out.print("Masukkan nama penumpang: ");
        namaPenumpang = input.nextLine();

        if (!namaPenumpang.matches("[a-zA-Z ]+")) {
            throw new Exception("Nama harus huruf saja!");
        }

        break;

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
        



        // 🔹 Tentukan jenis tiket
        Tiket tiket;
        if (pilihKereta.getJenis().equals("Ekonomi")) {
            tiket = new TiketEkonomi(namaPenumpang, pilihKereta.getTujuan());
        } else {
            tiket = new TiketBisnis(namaPenumpang, pilihKereta.getTujuan());
        }

        // 🔹 Input jumlah tiket
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = input.nextInt();

        int hargaSatuan = pilihKereta.getHarga();
        int totalHarga = hargaSatuan * jumlahTiket;

        // 🔹 Output
        System.out.println("\n=== DATA TIKET ===");
        System.out.println("Penumpang: " + namaPenumpang);
        System.out.println("Kereta: " + pilihKereta.getNama());
        System.out.println("Tujuan: " + pilihKereta.getTujuan());
        System.out.println("Jenis: " + pilihKereta.getJenis());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga per Tiket: " + hargaSatuan);
        System.out.println("Total Harga: " + totalHarga);

        // 🔹 Pilih pembayaran
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

        pembayaran.bayar(totalHarga);

        } catch (Exception e) {
            System.out.println("silahkan coba lagi \n" + e.getMessage());
            // TODO: handle exception
        } finally {
            System.out.println("program selesai");



        }


  }
}