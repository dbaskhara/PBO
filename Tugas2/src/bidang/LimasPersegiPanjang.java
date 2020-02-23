package bidang;
public class LimasPersegiPanjang extends PersegiPanjang
{
	private int tinggi;
	public LimasPersegiPanjang(int a , int b)
	{
		super(a, b);
	}
	public void simpanTinggi(int a)
	{
		this.tinggi = a;
	}
	public double hitungLuas()
	{
		return (panjang * lebar) + 2 * (Math.sqrt((tinggi * tinggi) + (panjang * lebar / 4)) * panjang / 2) + 2 * (Math.sqrt((tinggi * tinggi) + (panjang * lebar / 4)) * lebar / 2);
	}
	public double hitungVolume()
	{
		return (panjang * lebar * tinggi)/3;
	}
}
