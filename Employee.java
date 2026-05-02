package pemlanModul3Bab8.Praktikum;

class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    private String formatRupiah(int amount) {
        String formatted = String.format("%,d", amount).replace(',', '.');
        return "Rp." + formatted + ",00";
    }
    
    public int getTotalInvoice() {
        int total = 0;
        for (Invoice tagih : invoices) {
            total += tagih.getPayableAmount();
        }
        return total;
    }

    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void TampilkanData() {
        System.out.println("No. Registrasi : " + registrationNumber);
        System.out.println("Nama Karyawan  : " + name);
        System.out.println("Gaji Pokok     : " + formatRupiah(salaryPerMonth));
        System.out.println("\nDetail Belanja Koperasi (Invoices):");

        for (Invoice tagihan : invoices) {
            tagihan.TampilkanInvoice(); 
        }

        System.out.println("Gaji Bersih: " + formatRupiah(getPayableAmount()));;
    }
}
