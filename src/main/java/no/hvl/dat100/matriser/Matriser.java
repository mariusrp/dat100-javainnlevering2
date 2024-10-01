package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] i : matrise) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String message = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				message += matrise[i][j] + " ";
			}
			message += "\n";
		}
		return message;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] returMatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				returMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return returMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length == b.length && a[0].length == b[0].length) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					if(a[i][j] != b[i][j]) {
						System.out.println(false);
						return false;
					}
				}
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] returMatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[0].length; j++) {
				returMatrise[i][j] = matrise[j][i];
			}
		}
		return returMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] returMatrise = new int[a.length][b[0].length];
		int temp = 0;
		for(int k = 0; k < returMatrise[0].length; k++) {
			for(int j = 0; j < returMatrise.length; j++) {
				for(int i = 0; i < returMatrise[0].length; i++) {
					temp += a[j][i] * b[i][k];
				}
				returMatrise[j][k] = temp;
				temp = 0;
			}
		}
		return returMatrise;
	}
}
