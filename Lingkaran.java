public class Lingkaran extends bidangDuaDimensi{
  double r;

  public Lingkaran(String nama, double r){
    super(nama);
    this.r = r;
  }
  public double luas(){
    return 3.14 * r * r;
  }
}
