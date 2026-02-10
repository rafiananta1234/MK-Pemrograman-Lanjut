public class App1{
  public static void main(String[] args){
    bujurSangkar kotak = new bujurSangkar("Persegi", 20);
    Lingkaran koin = new Lingkaran("Rp500", 2);

    kotak.info();
    System.out.println("Luas: " + kotak.luas());

    koin.info();
    System.out.println("Luas: " + koin.luas());
    
  }
}
