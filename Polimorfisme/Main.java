import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Merek mrk = new Merek();
		TipeG tpg = new TipeG();
		TipeO tpo = new TipeO();
		Scanner input =  new Scanner(System.in);
		boolean loop = true;
		int merek;
		
		mrk.getMerek();
		System.out.print("Masukkan Pilihan Merek: ");
			merek = input.nextInt();
		while(loop)
		{
			switch(merek)
			{
				case 1: tpg.getTipeG();
						System.out.println();
						System.out.println("Nama: "+mrk.nama);
						System.out.println("Total Harga: Rp "+tpg.total);
						System.out.println("Bayar: Rp "+tpg.bayar);
						System.out.println("Kembalian: Rp "+tpg.k);
						loop = false; break;
				case 2: tpo.getTipeO();
						System.out.println();
						System.out.println("Nama: "+mrk.nama);
						System.out.println("Total Harga: Rp "+tpo.total);
						System.out.println("Bayar: Rp "+tpo.bayar);
						System.out.println("Kembalian: Rp "+tpo.k);
						loop = false; break;
				default: System.out.println("Merek yang dimasukkan salah!! Silahkan pilih antara 1 dan 2!");			
			}
		}
	}
}