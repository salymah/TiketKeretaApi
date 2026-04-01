class TiketBisnis extends Tiket {

    public TiketBisnis(String nama, String tujuan) {
        super(nama, tujuan);
        this.harga = 200000;
    }

    @Override
    public double hitungHarga() {
        return harga + (harga * 0.1); // pajak 10%
    }
}