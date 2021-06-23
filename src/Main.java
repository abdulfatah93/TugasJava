import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Karyawan Muhammad = new Karyawan();

        Karyawan abdul = new Karyawan(
                1,
                "abdul",
                "sampit",
                new Date(),
                "martapura",
                "08986396612",
                "manager","tetap");

        Karyawan fatah = new Karyawan(2,"fatah","sampit");
    }
}
