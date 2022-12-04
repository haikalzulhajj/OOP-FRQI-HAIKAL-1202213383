public class MainApp {

    //main class
    public static void main(String[]args ) {

        Perangkat Perangkat = new Perangkat(null,0,0);
        Handphone hp = new Handphone("WD",6,2,true);
        hp.drive="WD";
        hp.ram = 6;
        hp.processor = 2;
        hp.fingerprint = true;

        Laptop lptp = new Laptop("WD",3,6,false);

        lptp.drive="WD";
        lptp.ram = 16;
        lptp.processor = 9;
        lptp.webcam = false;

        Perangkat.informasi();
        System.out.println();

        hp.informasi();
        hp.telfon(59389843);
        hp.kirimSMS(838838);
        hp.kirimSMS(39494,49494);

        lptp.informasi();
        lptp.bukaGame("Dynasty Warrior");
        lptp.kirimEmail("maklorrt123@gmail.com");
        lptp.kirimEmail("juicyybox@gmail.com", "thatsmineee@gmail.com");
        

    }
    
}
