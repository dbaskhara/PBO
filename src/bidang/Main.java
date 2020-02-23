package bidang;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int pilihan = 0;
		System.out.println("Perhitungan Bidang");
		System.out.println("1.Persegi");
		System.out.println("2.Persegi Panjang");
		System.out.println("3.Segitiga");
		pilihan = a.nextInt();
		switch(pilihan)
		{
		case 1:
			System.out.print("Masukkan Nilai Sisi : ");
			Persegi persegi = new Persegi(a.nextInt());
			Persegi kubus = new Kubus(persegi.ambilSisi());
			Persegi limasPersegi = new LimasPersegi(persegi.ambilSisi());
			System.out.println("Keliling Persegi " + persegi.hitungKeliling());
			System.out.println("Luas Persegi     " + persegi.hitungLuas());
			System.out.println("Luas Kubus       " + ((Kubus)kubus).hitungLuas());
			System.out.println("Volume Kubus     " + ((Kubus)kubus).hitungVolume());
			System.out.println("Luas Limas       " + ((LimasPersegi)limasPersegi).hitungLuas());
			System.out.println("Volume Limas     " + ((LimasPersegi)limasPersegi).hitungVolume());
			break;
		case 2:
			System.out.println("Masukkan Nilai Panjang , Lebar dan Tinggi : ");
			PersegiPanjang persegiPanjang = new PersegiPanjang(a.nextInt() , a.nextInt());
			PersegiPanjang balok = new Balok(persegiPanjang.ambilPanjang() , persegiPanjang.ambilLebar());
			((Balok)balok).simpanTinggi(a.nextInt());
			PersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(persegiPanjang.ambilPanjang() , persegiPanjang.ambilLebar());
			((LimasPersegiPanjang)limasPersegiPanjang).simpanTinggi(((Balok)balok).ambilTinggi());
			System.out.println("Keliling Persegi Panjang " + persegiPanjang.hitungKeliling());
			System.out.println("Luas Persegi Panjang     " + persegiPanjang.hitungLuas());
			System.out.println("Luas Balok               " + ((Balok)balok).hitungLuas());
			System.out.println("Volume Balok             " + ((Balok)balok).hitungVolume());
			System.out.println("Luas Limas               " + ((LimasPersegiPanjang)limasPersegiPanjang).hitungLuas());
			System.out.println("Volume Limas             " + ((LimasPersegiPanjang)limasPersegiPanjang).hitungVolume());
			break;
		case 3:
			System.out.println("Masukkan Nilai Sisi dan Tinggi");
			Segitiga segitiga = new Segitiga(a.nextInt());
			Segitiga prismaLimasSegitiga = new PrismaLimasSegitiga(segitiga.ambilSisi());
			((PrismaLimasSegitiga)prismaLimasSegitiga).simpanTinggi(a.nextInt());
			System.out.println("Keliling Segitiga " + segitiga.hitungKeliling());
			System.out.println("Luas Segitiga     " + segitiga.hitungLuas());
			System.out.println("Luas Prisma       " + ((PrismaLimasSegitiga)prismaLimasSegitiga).hitungLuasPrisma());
			System.out.println("Volume Prisma     " + ((PrismaLimasSegitiga)prismaLimasSegitiga).hitungVolume());
			System.out.println("Luas Limas        " + ((PrismaLimasSegitiga)prismaLimasSegitiga).hitungLuasLimas());
			System.out.println("Volume Limas      " + ((PrismaLimasSegitiga)prismaLimasSegitiga).hitungVolume(((PrismaLimasSegitiga)prismaLimasSegitiga).hitungVolume()));
			break;
		default:
			System.out.println("Inputan Anda Salah");
		}
	}

}
