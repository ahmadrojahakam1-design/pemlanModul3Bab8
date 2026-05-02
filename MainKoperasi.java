package pemlanModul3Bab8.Praktikum;

public class MainKoperasi {
    public static void main(String[] args) {

        Invoice tagih1 = new Invoice("Beras", 2, 75000);
        Invoice tagih2 = new Invoice("Minyak", 3, 30000);
        Invoice tagih3 = new Invoice ("Gula", 10, 18000);

        Invoice[] daftarBelanja = {tagih1, tagih2,tagih3};

        Employee pekerja = new Employee(1212, "Roja Hakam", 2000000, daftarBelanja);

        pekerja.TampilkanData();
    }
}
