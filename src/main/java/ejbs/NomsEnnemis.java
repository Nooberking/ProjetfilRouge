package ejbs;

import java.util.Random;

public enum NomsEnnemis {
	Tappurahiisil�inen, Haulikkohiisi, Rynkkyhiisi, Kranuhiisi, Toimari, Snipuhiisi, Parantajahiisi, Miinankylv�j�, Liekkari, Stendari, Ukko, Sokaisunmestari, Alkemisti, Eldari ;
	
	public static NomsEnnemis aleatoire() {
		Random random = new Random();
		return NomsEnnemis.values()[random.nextInt(13)];
	}
}
