package bidang;
public class Balok extends PersegiPanjang
{
	private int tinggi;
	public Balok(int a , int b)
	{
		super(a , b);
	}
	public void simpanTinggi(int a)
	{
		this.tinggi = a;
	}
	public int ambilTinggi()
	{
		return tinggi;
	}
	public double hitungLuas()
	{
		return (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
	}
	public int hitungVolume()
	{
		return panjang * lebar * tinggi;
	}
}