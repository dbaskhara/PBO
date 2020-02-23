package bidang;
public class PersegiPanjang
{
	protected int panjang;
	protected int lebar;
	public PersegiPanjang(int a , int b)
	{
		this.panjang = a;
		this.lebar= b;
	}
	public int ambilPanjang()
	{
		return panjang;
	}
	public int ambilLebar()
	{
		return lebar;
	}
	public int hitungKeliling()
	{
		return 2 * (panjang + lebar);
	}
	public double hitungLuas()
	{
		return panjang * lebar;
	}
}
