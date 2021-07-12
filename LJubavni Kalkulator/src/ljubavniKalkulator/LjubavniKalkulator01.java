package ljubavniKalkulator;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LjubavniKalkulator01 {
	ArrayList<Integer> lista = new ArrayList<>();
	ArrayList<Integer> lista2 = new ArrayList<>();
	
	public LjubavniKalkulator01() {
		String ime1 = JOptionPane.showInputDialog("Unesite svoje ime.");
		String ime2 = JOptionPane.showInputDialog("Unesite ime svoje simpatije.");

		usporediImena(ime1, ime2);
		lista = pretvoriImeUNizBrojeva(ime1.toLowerCase(), ime2.toLowerCase());
		System.out.println(lista);

		lista2 = ispisiPrvuPravilnuListu(ime1.toLowerCase(), ime2.toLowerCase(), lista);

		LjubavniKalkulator02.rekurzija(lista2);
	}
	
	private ArrayList<Integer> ispisiPrvuPravilnuListu(String ime1, String ime2, ArrayList<Integer> lista) {
		ArrayList<Integer> lista2 = new ArrayList<>();
		char[] niz1 = ime1.toCharArray();
		char[] niz2 = ime2.toCharArray();

		for (int i = 0, p = 0, m = lista.size() - 1; i < niz1.length; i++, p++, m--) {
			lista2.add(lista.get(p) + lista.get(m));
		}

		for (int i = niz1.length; i < lista.size() - niz1.length; i++) {
			lista2.add(lista.get(i));
		}

		return lista2;

	}

	String spojImena;

	private ArrayList<Integer> pretvoriImeUNizBrojeva(String ime1, String ime2) {
		ArrayList<Integer> lista = new ArrayList<>();
		if (ime1.length() == ime2.length() || ime1.length() < ime2.length()) {
			spojImena = ime1 + ime2;
		}else {
			spojImena = ime2 + ime1;
		}
		
		char[] niz = spojImena.toCharArray();

		int p;
		for (int i = 0; i < niz.length; i++) {
			p = 0;
			for (int j = 0; j < niz.length; j++) {
				if (niz[i] == niz[j]) {
					p++;
				}
			}
			lista.add(p);
		}
		return lista;
	}

	String prvoIme, drugoIme;

	private void usporediImena(String ime1, String ime2) {
		if (ime1.length() == ime2.length() || ime1.length() < ime2.length()) {
			prvoIme = ime1;
			drugoIme = ime2;
		} else {
			prvoIme = ime2;
			drugoIme = ime1;
		}
		System.out.println("Prvo ime: " + prvoIme + "; drugo ime: " + drugoIme);
	}
	
	public static void main(String[] args) {
		
		new LjubavniKalkulator01();
	}
}
