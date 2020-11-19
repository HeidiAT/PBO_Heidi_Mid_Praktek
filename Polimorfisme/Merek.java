import java.util.Scanner;

class Merek
{
	Scanner input =  new Scanner(System.in);
	String nama;
	int merek, j, bayar, k, total, tipe1, tipe2;
	boolean loop = true;
	
	void getMerek()
	{
		System.out.print("Masukkan Nama: ");
			nama = input.nextLine();
		System.out.println("Merek");
		System.out.println("1. Merek G");
		System.out.println("2. Merek O");		
	}
}