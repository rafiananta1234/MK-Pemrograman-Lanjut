public Lingkaran extend bidangDuaDimensi{
  double r;

  public Lingkaran(nama, r){
    super(nama);
    this.r = r;
  }
  public double luas(){
    return 3.14 * r * r;
}
