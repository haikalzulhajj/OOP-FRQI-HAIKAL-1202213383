public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportair = new TransportasiAir(4,20000);
        transportair.informasi();
        transportair.berlayar();
        transportair.berlabuh();

        Sampan smpn = new Sampan(20,50000,2);
        smpn.informasi();
        smpn.berlayar();
        smpn.berlabuh();
        smpn.berlabuh(2);
        
        Kapal kpl = new Kapal(50,100000, "Diesel");
        kpl.informasi();
        kpl.berlayar();
        kpl.berlayar(20);
        kpl.berlabuh();
        
    };
    
}
