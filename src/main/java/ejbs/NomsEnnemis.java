package ejbs;

import java.util.Random;

public enum NomsEnnemis {
	Tappurahiisiläinen, Haulikkohiisi, Rynkkyhiisi, Kranuhiisi, Toimari, Snipuhiisi, Parantajahiisi, Miinankylväjä, Liekkari, Stendari, Ukko, Sokaisunmestari, Alkemisti, Eldari ;
	
	public static NomsEnnemis aleatoire() {
		Random random = new Random();
		return NomsEnnemis.values()[random.nextInt(13)];
	}
}
