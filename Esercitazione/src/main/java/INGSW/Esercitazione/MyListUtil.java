package INGSW.Esercitazione;

import java.util.ArrayList;
public class MyListUtil {
	
	public static ArrayList<Integer> lista;
	public static ArrayList<Integer> a;
	
	public static void main(String[] args) {
		
		lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(12);
		lista.add(0);
		lista.add(23);

		System.out.println(sortDecrescente(lista));
		
	}
	

	public static ArrayList<Integer> sortDecrescente (ArrayList<Integer> lista) {
		
		ArrayList<Integer> nuovaL = new ArrayList<Integer>();
		int temp;
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size()-1; j++) {
				if (i != j) {
					if (lista.get(i) > lista.get(j)) {
						temp = lista.get(j);
						lista.set(j, lista.get(i));
						lista.set(i, temp);
					}
				}
			}
		}
		nuovaL = lista;
		
		return nuovaL;
	}
	
	public static ArrayList<Integer> sortCrescente (ArrayList<Integer> lista) {
		
		ArrayList<Integer> nuovaL = new ArrayList<Integer>();
		int temp;
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size()-1; j++) {
				if (i != j) {
					if (lista.get(i) < lista.get(j)) {
						temp = lista.get(j);
						lista.set(j, lista.get(i));
						lista.set(i, temp);
					}
				}
			}
		}
		
		nuovaL = lista;
		return nuovaL;
	}
	


}