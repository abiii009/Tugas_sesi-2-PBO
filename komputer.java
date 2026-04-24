public class Komputer {
    // 2. Atribut / Variabel Instance
    String jenis_komputer;
    private String merk;

    // 3. Method Mutator (Setter) untuk mengisi data
    public void setDataKomputer(String jenis, String merk) {
        jenis_komputer = jenis;
        this.merk = merk;
    }

    // 4. Method Accessor (Getter) untuk mengambil jenis
    public String getJenis() {
        return jenis_komputer;
    }

    // 5. Method Accessor (Getter) untuk mengambil merk
    public String getMerk() {
        return merk;
    }

    public static void main(String[] args) {
        // 6. Instansiasi Object
        Komputer mykom = new Komputer();

        // 7. Memanggil method untuk mengisi data
        mykom.setDataKomputer("LAPTOP", "MACBOOK");

        // 8. Mencetak hasil ke layar
        System.out.println(mykom.getJenis());
        System.out.println(mykom.getMerk());
    }
}