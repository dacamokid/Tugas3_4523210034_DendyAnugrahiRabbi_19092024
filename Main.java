public class Main {
    public static void main(String[] args) throws Exception{
        Karyawan ridho = new Karyawan("12345","ridho");
        ridho.getinfo();
        ridho.absenpagi();
        ridho.kerja();
        ridho.absenpulang();

        Karyawan melan = new Karyawan("12346", "Melan");
        melan.getinfo();
        melan.absenpagi();
        melan.kerja();
        melan.absenpulang();

        Dosen andiani = new Dosen("23455", "332211", "Andiani");
        andiani.getinfo();
        andiani.absenpagi();
        andiani.kerja();
        andiani.ngajar();
        andiani.absenpulang();

        Dosen ionia = new Dosen("23456", "332212", "Ionia");
        ionia.getinfo();
        ionia.absenpagi();
        ionia.kerja();
        ionia.ngajar();
        ionia.absenpulang();
        
    }
}
