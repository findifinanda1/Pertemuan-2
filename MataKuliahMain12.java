public class MataKuliahMain12 {
    public static void main(String[] args) {

        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah12 mk2 = new MataKuliah12(
                "MK002",
                "Struktur Data",
                4,
                8);

        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\nData MK2:");
        mk2.tampilInformasi();
    }
}