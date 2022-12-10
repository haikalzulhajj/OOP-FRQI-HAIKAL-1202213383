public class TransportasiAir {
    
    protected int jumlahKursi, biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya= biaya;
    }

    public void informasi(){
        System.out.printf("Transportasi Air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. %d %n", jumlahKursi, biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.printf("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai %n %n");
    }
}