public class KaryawanTidakTetap extends Karyawan{
    public int id;
    public String nomorKontrak;
    public String durasiKontrak;


    public void menandatanganiKontrak(){
        System.out.println("Karyawan Menandatangani Kontrak");
    }
    public void mengajukanPerpanjangan(){
        System.out.println("Karyawan Mengajukan Kontrak");
    }
        //Membuat Setter & Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomorKontrak() {
        return nomorKontrak;
    }

    public void setNomorKontrak(String nomorKontrak) {
        this.nomorKontrak = nomorKontrak;
    }

    public String getDurasiKontrak() {
        return durasiKontrak;
    }

    public void setDurasiKontrak(String durasiKontrak) {
        this.durasiKontrak = durasiKontrak;
    }
}
