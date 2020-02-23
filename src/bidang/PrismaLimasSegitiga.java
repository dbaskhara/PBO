package bidang;
public class PrismaLimasSegitiga extends Segitiga
{
	private int tinggi;
	public PrismaLimasSegitiga(int a)
	{
		super(a);
	}
	public void simpanTinggi(int a)
	{
		this.tinggi = a;
	}
	public double hitungLuasPrisma()
	{
		return (2 * (sisi * sisi / 2) + (3 * (sisi * tinggi)));
	}
	public double hitungLuasLimas()
	{
		return Math.sqrt(Math.pow(tinggi, 2) + Math.pow((Math.sqrt(Math.pow(sisi, 2) + (Math.pow(sisi, 2) / 4))) / 2, 2));
	}
	public double hitungVolume()
	{
		return (sisi * sisi / 2) * tinggi;
	}
	public double hitungVolume(double a)
	{
		a = hitungVolume();
		return a / 3;
	}
}
