package classes.partiel;

public class StatItem {
	private char c;
	private int nb;
	
	public StatItem(char c, int nb) {
		this.c = c;
		this.nb = nb;
	}
	
	public void incremente(){
		this.nb += 1;
	}
	
	public String toString(){
		return c + " a été trouver "+nb+ "fois";
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}
	
}
