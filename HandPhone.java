public class HandPhone {
    // Deklarasi Atribut
    String jenis_hp;
    int tahun_pembuatan;

    // Perbaikan Method Setter: Urutan akses modifier dan penggunaan 'this'
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Method Getter untuk jenis HP
    public String getJenisHP() {
        return jenis_hp;
    }

    // Method Getter untuk tahun pembuatan
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    // Perbaikan pada Main Method: Urutan yang benar adalah 'public static void main'
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        
        // Memberikan nilai input (contoh: "Samsung", 2023)
        hp.setDataHP("Samsung", 2023);
        
        // Mencetak hasil dengan memanggil method getter
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}