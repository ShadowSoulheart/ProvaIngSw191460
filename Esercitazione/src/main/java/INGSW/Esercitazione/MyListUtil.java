package INGSW.Esercitazione;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;
public class MyListUtil {
	
	public static ArrayList<Integer> lista;
	public static ArrayList<Integer> a;
	
	public static void main(String[] args) {
		//DateTime a = new DateTime();
		//System.out.println(a.now());
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