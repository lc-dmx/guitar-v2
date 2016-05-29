package guitarshop.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class inventory {
	private static List<guitar> guitars;

	public inventory() {
		guitars = new LinkedList<guitar>();
	}

	public void addguitar(String serialNumber, double price, guitarspec spec) {
		guitar guitar = new guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public List<guitar> search(guitarspec searchSpec) {
		List<guitar> matchingguitars = new LinkedList<guitar>();
		for (Iterator<guitar> i = guitars.iterator(); i.hasNext();) {
			guitar guitar = (guitar) i.next();
			if (guitar.getSpec().matches(searchSpec))
				matchingguitars.add(guitar);
		}
		return matchingguitars;
	}

}
