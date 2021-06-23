import java.util.Date;
    //Membuat Class dengan 8 Atribut 4 Method
public class Karyawan {
    private int nik;
    private String nama;
    private String tempatLahir;
    private Date tanggalLahir;
    private String alamat;
    private String noTelepon;
    private String jabatan;
    private String status;

    public void masuk(){
        System.out.println("Karyawan Sedang Bekerja");
    }

    public void istirahat(){
        System.out.println("Karyawan Sedang Istirahat");
    }

    public void pulang(){
        System.out.println("Karyawan Sudah Pulang");
    }

    public void gajih(){
        System.out.println("Karyawan Menerima Gajih");
    }

    //Membuat 3 constructor

        public Karyawan() {
        }

        public Karyawan(int nik, String nama, String tempatLahir, Date tanggalLahir, String alamat, String noTelepon, String jabatan, String status) {
            this.nik = nik;
            this.nama = nama;
            this.tempatLahir = tempatLahir;
            this.tanggalLahir = tanggalLahir;
            this.alamat = alamat;
            this.noTelepon = noTelepon;
            this.jabatan = jabatan;
            this.status = status;
        }

        public Karyawan(int nik, String nama, String tempatLahir) {
            this.nik = nik;
            this.nama = nama;
            this.tempatLahir = tempatLahir;
        }
        //Membuat Setter & Getter
        public int getNik() {
            return nik;
        }

        public void setNik(int nik) {
            this.nik = nik;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getTempatLahir() {
            return tempatLahir;
        }

        public void setTempatLahir(String tempatLahir) {
            this.tempatLahir = tempatLahir;
        }

        public Date getTanggalLahir() {
            return tanggalLahir;
        }

        public void setTanggalLahir(Date tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getNoTelepon() {
            return noTelepon;
        }

        public void setNoTelepon(String noTelepon) {
            this.noTelepon = noTelepon;
        }

        public String getJabatan() {
            return jabatan;
        }

        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
