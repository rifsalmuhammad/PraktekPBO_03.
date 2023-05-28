package praktekpbo_03;

public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        
        s.setMerk("Kupu-kupu");
        s.setWarna("Merah");
        s.setHarga(1000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        Sepeda sm = new SepedaMotor();
        sm.setMerk("Honda");
        sm.setWarna("Merah");
        sm.setHarga(10000);
        sm.setJenisMotor("Motor Touring");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getJenisMotor());
        sm.throttle();
        
        
        
        
       
                
    }
}
