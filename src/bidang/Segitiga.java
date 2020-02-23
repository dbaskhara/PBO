package bidang;
public class Segitiga
{
	protected int sisi;
	public Segitiga(int a)
	{
		this.sisi = a;
	}
	public int ambilSisi()
	{
		return sisi;
	}
	public int hitungKeliling()
	{
		return sisi * 3;
	}
	public double hitungLuas()
	{
		return sisi * sisi / 2;
	}
}
