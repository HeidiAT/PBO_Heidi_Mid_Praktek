import java.util.Scanner;

class TipeG extends Merek
{
	void getTipeG()
	{
		System.out.println("Tipe: ");
		System.out.println("1. Meja   Rp 95.000");
		System.out.println("2. Kursi  Rp 125.000");
		System.out.println("3. Lemari Rp 450.000");
		System.out.print("Masukkan Pilihan Tipe Barang: ");
			tipe1 = input.nextInt();
		switch(tipe1)
		{
			case 1: System.out.print("Masukkan Jumlah Unit: ");
					j = input.nextInt();
					total = j * 95000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			case 2: System.out.print("Masukkan Jumlah Unit: ");
					j = input.nextInt();
					total = j * 125000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			case 3: System.out.print("Masukkan Jumlah Unit: ");
					j = input.nextInt();
					total = j * 450000;
					System.out.println("Total Harga: Rp "+total);
					System.out.print("Masukkan Bayar: Rp ");
						bayar = input.nextInt();
					k = bayar - total;
					loop = false; break;
			default: System.out.println("Tipe yang dimasukkan Salah!! Pilih Tipe 1-3");
		}
	}
}