package pemlanModul3Bab8.Praktikum;

class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    private String formatRupiah(int amount) {
        String formatted = String.format("%,d", amount).replace(',', '.');
        return "Rp." + formatted + ",00";
    }

    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %d x %-15s = %s", 
                productName, 
                quantity, 
                formatRupiah(pricePerItem), 
                formatRupiah(getPayableAmount()));
    }

    public void TampilkanInvoice() {
        System.out.println("Produk: " + productName);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Harga per item: " + formatRupiah(pricePerItem));
        System.out.println("Total: " + formatRupiah(getPayableAmount()));
        System.out.println("------------------------");
    }
}
