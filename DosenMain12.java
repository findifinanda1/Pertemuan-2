public class DosenMain12 {
    public static void main(String[] args) {

        
        Dosen12 d1 = new Dosen12();
        d1.idDosen = "D001";
        d1.nama = "Bapak Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Basis Data";

        Dosen12 d2 = new Dosen12(
                "D002",
                "Ibu Sari",
                true,
                2018,
                "AI");

        System.out.println("=== Data Dosen 1 ===");
        d1.tampilInformasi();
        System.out.println("Masa Kerja: "
                + d1.hitungMasaKerja(2025) + " tahun");

        d1.ubahKeahlian("Data Science");
        d1.setStatusAktif(false);

        System.out.println("\nSetelah diubah:");
        d1.tampilInformasi();

        System.out.println("\n=== Data Dosen 2 ===");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: "
                + d2.hitungMasaKerja(2025) + " tahun");
    }
}