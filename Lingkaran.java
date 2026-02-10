public class Lingkaran extends bidangDuaDimensi{
  double r;

  public Lingkaran(String nama, double r){
    super(nama);
    this.r = r;
  }
  @Override
  public double luas(){
    return Math.PI * r * r;
  }
}
