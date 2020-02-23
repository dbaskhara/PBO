package bidang;

public class LimasPersegi extends Persegi
{
	public LimasPersegi(int a)
	{
		super(a);
	}
	public double hitungLuas()
	{
		return (sisi * sisi) + 4*(Math.sqrt((sisi * sisi) + (sisi * sisi / 4)) * sisi / 2);
	}
	public double hitungVolume()
	{
		return (sisi * sisi * sisi)/3;
	}
}
