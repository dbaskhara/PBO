package bidang;
public class Persegi 
{
	protected int sisi;
	public Persegi(int a)
	{
		this.sisi = a;
	}
	public int ambilSisi()
	{
		return sisi;
	}
	public int hitungKeliling()
	{
		return 4 * sisi;
	}
	public double hitungLuas()
	{
		return sisi * sisi;
	}
}
