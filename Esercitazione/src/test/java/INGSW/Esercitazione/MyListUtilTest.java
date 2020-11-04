package INGSW.Esercitazione;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil m;
	
	@BeforeClass
	public static void initialize () {
		m = new MyListUtil();
		
		m.lista = new ArrayList<Integer>();
		m.a = new ArrayList<Integer>();
		
		m.lista.add(5);
		m.lista.add(12);
		m.lista.add(0);
		m.lista.add(23);
		
		m.a.add(12);
		m.a.add(0);
		m.a.add(55);
		m.a.add(91);
		m.a.add(1);
		m.a.add(1);
		m.a.add(33);
	}
	
	
	@Test
	public void decrescenteWorks() {
		assertEquals(Arrays.asList(23, 12, 5, 0), m.sortDecrescente(m.lista));
		assertEquals(Arrays.asList(91, 55, 33, 12, 1, 1, 0), m.sortDecrescente(m.a));
	}
	
	@Test
	public void crescenteWorks() {
		assertEquals(Arrays.asList(0, 5, 12, 23), m.sortCrescente(m.lista));
		assertEquals(Arrays.asList(0, 1, 1, 12, 33, 55, 91), m.sortCrescente(m.a));
	}
	
}
