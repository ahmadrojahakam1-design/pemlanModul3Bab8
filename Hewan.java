package pemlanModul3Bab8;

public class Hewan implements MakhlukHidup, Identitas {

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void bernapas() {
        System.out.println("Kadang nafas manual");
    }

    @Override
    public void TampilkanHobi() {
        System.out.println("Hobi hewan tidak diketahui");
    }

    public void TampilkanNama () {}

    public void TampilkanUmur () {}

}
