package ljubavniKalkulator;

import java.util.ArrayList;

public class LjubavniKalkulator03 {

	public static ArrayList<Integer> ispisiPrvuPravilnuListu2(String ime1, String ime2, ArrayList<Integer> lista) {
		// Ako je ime1 veæe od ime2, tj duže
		ArrayList<Integer> lista2 = new ArrayList<>();
		char[] niz1 = ime1.toCharArray();
		char[] niz2 = ime2.toCharArray();

		for (int i = 0, p = 0, m = lista.size() - 1; i < niz2.length; i++, p++, m--) {
			lista2.add(lista.get(p) + lista.get(m));
		}

		for (int i = niz2.length; i < lista.size() - niz2.length; i++) {
			lista2.add(lista.get(i));
		}

		return lista2;
	}
}
