abstract class Tiket {
    private String namaPenumpang;
    private String tujuan;
    protected double harga;

    // Constructor
    public Tiket(String namaPenumpang, String tujuan) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
    }

    // Getter
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    // Abstract method
    public abstract double hitungHarga();
}