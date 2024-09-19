public class Karyawan {
    public String nama;
    public String kodeKaryawan;

        public Karyawan(String kodeKaryawan, String nama) {
            this.kodeKaryawan = kodeKaryawan;
            this.nama = nama;
    }

    public void absenpagi(){
        System.out.println(this.nama + " absen pagi");
    }

    public void kerja (){
        System.out.println(this.nama + " kerja");
    }

    public void absenpulang(){
        System.out.println(this.nama + " absen pulang");
    }
    public void getinfo(){
        System.out.println("");
        System.out.println("kode Karyawan : " + this.kodeKaryawan);
        System.out.println("nama : " + this.nama);    
    }
}
