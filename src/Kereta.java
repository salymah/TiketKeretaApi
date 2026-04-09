class Kereta {
    private String nama;
    private String tujuan;
    private int harga;
    private String jenis;

    public Kereta(String nama, String tujuan, int harga, String jenis) {
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
    return jenis;
    }
}