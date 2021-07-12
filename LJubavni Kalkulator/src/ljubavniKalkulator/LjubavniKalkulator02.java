package ljubavniKalkulator;

import java.util.ArrayList;

public class LjubavniKalkulator02 {

	public static void rekurzija(ArrayList<Integer> lista) {
		if (lista.size() == 2) {
			System.out.println(lista);
			return;
		}
		System.out.println(lista);
		rekurzija(napraviNovuListu(lista));
	}
	
	public static ArrayList<Integer> dvoznamenkastiProblem(int a) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(a / 10);
		lista.add(a % 10);
		
		return lista;
	}

	public static ArrayList<Integer> napraviNovuListu(ArrayList<Integer> lista) {
		ArrayList<Integer> lista2 = new ArrayList<>();
		int p = 0;
		int p2 = 0;

		if (lista.size() == 3) {
			p = lista.get(0) + lista.get(2);
			p2 = lista.get(1);

			if (p < 10) {
				lista2.add(p);
			} else if (p >= 10) {
				lista2.add(dvoznamenkastiProblem(p).get(0));
				lista2.add(dvoznamenkastiProblem(p).get(1));
			}
			lista2.add(p2);

		} else {

			for (int i = 0, max = lista.size() - 1; i < lista.size() / 2; i++, max--) {
				p = 0;

				p = lista.get(i) + lista.get(max);

				if (p < 10) {
					lista2.add(p);
				} else if (p >= 10) {
					lista2.add(dvoznamenkastiProblem(p).get(0));
					lista2.add(dvoznamenkastiProblem(p).get(1));
				}
			}
			if (lista.size() % 2 != 0) {
				lista2.add(lista.get(lista.size() / 2));
			}
		}

		return lista2;
	}
}
