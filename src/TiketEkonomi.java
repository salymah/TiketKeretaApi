class TiketEkonomi extends Tiket {

    public TiketEkonomi(String nama, String tujuan) {
        super(nama, tujuan);
        this.harga = 100000;
    }

    @Override
    public double hitungHarga() {
        return harga;
    }
}