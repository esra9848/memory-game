import java.util.Scanner;

public class Main {
	private static Kart[][] kartlar = new Kart[4][4]; // bunu özellik olarak ekledik

	public static void main(String[] args) {

		kartlar[0][0] = new Kart('E');
		kartlar[0][1] = new Kart('A');
		kartlar[0][2] = new Kart('B');
		kartlar[0][3] = new Kart('F');
		kartlar[1][0] = new Kart('G');
		kartlar[1][1] = new Kart('A');
		kartlar[1][2] = new Kart('D');
		kartlar[1][3] = new Kart('H');
		kartlar[2][0] = new Kart('F');
		kartlar[2][1] = new Kart('C');
		kartlar[2][2] = new Kart('D');
		kartlar[2][3] = new Kart('H');
		kartlar[3][0] = new Kart('E');
		kartlar[3][1] = new Kart('G');
		kartlar[3][2] = new Kart('B');
		kartlar[3][3] = new Kart('C');
		while (oyunBittiMi() == false) {
			oyunTahtasi();
			TahminEt();
		}
	}

	public static void TahminEt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Tahmin (i ve j deðerlerini bir boþluklu girin )");
		int i1 = scanner.nextInt();
		int j1 = scanner.nextInt();
		kartlar[i1][j1].setTahmin(true);
		oyunTahtasi();

		System.out.println("Ýkinci Tahmin (i ve j deðerlerini bir boþluklu girin )");
		int i2 = scanner.nextInt();
		int j2 = scanner.nextInt();
		if (kartlar[i1][j1].getDeðer() == kartlar[i2][j2].getDeðer()) {
			System.out.println("Doðru Tahmin Tebrikler...");
			kartlar[i2][j2].setTahmin(true);
		} else {
			System.out.println("Yanlýþ tahmin...");
			kartlar[i1][j1].setTahmin(false);
		}
	}

	public static boolean oyunBittiMi() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; i++) {
				if (kartlar[i][j].isTahmin() == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static void oyunTahtasi() {

		for (int i = 0; i < 4; i++) {
			System.out.println("____________________");
			for (int j = 0; j < 4; j++) {

				if (kartlar[i][j].isTahmin()) {
					System.out.print(" |" + kartlar[i][j].getDeðer() + "| ");

				} else {
					System.out.print(" | | ");

				}
			}
			System.out.println("");
		}
		System.out.println("____________________");

	}

}
