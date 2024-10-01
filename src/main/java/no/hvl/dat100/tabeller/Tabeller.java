package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		String res = "[";
		for (int i = 0; i < tabell.length; i++) {
			res += tabell[i];
			if (i != tabell.length-1 ) {
				res += ", ";
			}
		}
		res += "]";
		System.out.println(res);
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String res = "[";
		for (int i = 0; i < tabell.length; i++) {
			res += tabell[i];
			if (i != tabell.length-1 ) {
				res += ",";
			}
		}
		res += "]";
		System.out.println("Test" + res);;
		return res;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return(i);
			}
		}
		return(-1);

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int idx = tabell.length-1;
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[idx--];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length < 2) {
			return true;
		} 
		for (int i = 1; i < tabell.length; i++) {
			if( tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];  
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTabell[tabell1.length+j] = tabell2[j];
		}
		return nyTabell;
	}
}
