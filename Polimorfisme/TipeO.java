import java.util.Scanner;

class TipeO extends Merek
{
	void getTipeO()
	{
		System.out.println("Tipe: ");
		System.out.println("1. Meja   Rp 115.000");
		System.out.println("2. Kursi  Rp 135.000");
		System.out.println("3. Lemari Rp 550.000");
		System.out.print("Masukkan Pilihan Tipe Barang: ");
			tipe2 = input.nextInt();
		switch(tipe2)
		{
			case 1: System.out.print("Masukkan Jumlah Unit: ");
						j = input.nextInt();
					total = j * 115000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			case 2: System.out.print("Masukkan Jumlah Unit: ");
						j = input.nextInt();
					total = j * 135000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			case 3: System.out.print("Masukkan Jumlah Unit: ");
						j = input.nextInt();
					total = j * 550000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			default: System.out.println("Tipe yang dimasukkan Salah!! Pilih Tipe 1-3"); break;
						}
	}
}