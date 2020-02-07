//Demitries Baskhara Rivaldo Tolla 123180137
import java.util.Scanner;
public class PBO1 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String nama;
		int banyak;
		int jumlah = 0;
		int max = 0;
		int min = 0;
		int[] nilai = new int[100];
		System.out.print("Nama : ");
		nama = input.nextLine();
		System.out.print("Jumlah Nilai : ");
		banyak = input.nextInt();
		for(int i = 1 ; i <= banyak ; i++)
		{
			System.out.print("Nilai ke " + i + " : ");
			nilai[i] = input.nextInt();
			if(i == 1)
			{
				min = nilai[1];
				max = nilai[1];
			}
			else
			{
				if(nilai[i] < min)
				{
					min = nilai[i];
				}
				else if(nilai[i] > max)
				{
					max = nilai[i];
				}
			}
			jumlah += nilai[i];
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Nama : " + nama);
		System.out.println("Nilai Tertinggi : " + max);
		System.out.println("Nilai Terrendah : " + min);
		System.out.println("Nilai Rata Rata : " + (jumlah * 1.0 / banyak * 1.0));
	}
}
