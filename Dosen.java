public class Dosen extends Karyawan{
    private String NIDN;
    public Dosen(String NIDN, String kodeKaryawan, String nama){
        super(kodeKaryawan, nama);
        this.NIDN = NIDN;
    }

public void setNIDN(String NIDN) {
    this.NIDN = NIDN;
}
public void getNIDN(){
    System.out.println("NIDN : " + this.NIDN);
}
public void ngajar() {
    System.out.println(this.nama + ": sedang mengajar");
}
@Override
public void getinfo(){
    super.getinfo();
    System.out.println("NIDN : " + this.NIDN);
    }
}

