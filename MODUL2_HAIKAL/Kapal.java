public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.printf("Transportasi Air jenis Kapal dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. %d %n", jumlahKursi, biaya);
    }

    @Override
    public void berlayar(){
        System.out.printf("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan yang tidak stabil %n", mesin);
    }

    public void berlayar(int kecepatan){
        System.out.printf("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di kisaran %d knot %n", mesin, kecepatan);
    }

    @Override
    public void berlabuh(){
        System.out.printf("Transportasi Air jenis Kapal berlabuh di pantai %n");
    }
    
}
