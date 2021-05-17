
public class Kart {
	private char değer;
	private boolean tahmin = false;


	public Kart(char değer) {
		this.değer = değer;
	}

	public char getDeğer() {
		return değer;
	}

	public void setDeğer(char değer) {
		this.değer = değer;
	}

	public boolean isTahmin() {
		return tahmin;
	}

	public void setTahmin(boolean tahmin) {
		this.tahmin = tahmin;
	}


}
