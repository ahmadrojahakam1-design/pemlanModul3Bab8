package pemlanModul3Bab8;

public class Manusia implements MakhlukHidup, Identitas {

    private String nama;
    private int umur;
    private String hobi;

    public Manusia(String nama, int umur, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai sendok garpu");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya merdu");
    }

    @Override
    public void bernapas() {
        System.out.println("Kadang nafas manual");
    }

    @Override
    public void TampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    @Override
    public void TampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }

    @Override
    public void TampilkanHobi() {
        System.out.println("Hobi saya: " + this.hobi);
    }

}
