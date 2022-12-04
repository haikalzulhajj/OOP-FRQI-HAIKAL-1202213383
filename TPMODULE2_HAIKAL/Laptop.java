public class Laptop extends Perangkat{
    protected boolean webcam;  //attribute

    //constructor


    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
    
    }
    //override method detail dari perangkat


    @Override


    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+"Ghz. Selain itu laptop ini "+webcam+" memiliki fingerprint");
    }

    //method buka game


    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil buka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil kirim email ke "+email);
    }
    public void kirimEmail(String email1,String email2){
        System.out.println("Laptop berhasil kirim email ke"+email1+"dan ke "+email2);
    }
}
