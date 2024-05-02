public class Main {
    public static void main(String[] args) {
        Pegawai[] pegawai = new Pegawai[3];
        pegawai[0] = new PegawaiTetap("Willem", "3507100202050003", 3000000.0);
        pegawai[1] = new PegawaiHarian("Ancha", "350710080509120007", 7000.0, 32);
        pegawai[2] = new Sales("Meloni", "3507102906030002", 60, 45000.0);

        for (Pegawai p : pegawai) {
            System.out.println(p.toString());
            System.out.println();
        }
    }
}