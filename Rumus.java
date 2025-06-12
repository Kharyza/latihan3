package latihan3;

/**
 * Nama  : Muhammad Azmi Khairy
 * NPM   : 2310010349
 * Kelas : 4C
 */
public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }
}