package bidang;
public class Kubus extends Persegi
{
	public Kubus(int a)
	{
		super(a);
	}
	public double hitungLuas()
	{
		return 6*(sisi * sisi);
	}
	public int hitungVolume()
	{
		return sisi * sisi * sisi;
	}
}
