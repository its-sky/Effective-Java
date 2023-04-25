package Item14;

import java.util.Comparator;

import static java.util.Comparator.*;

public class Comp implements Comparable<Comp>{
	private final Comparator<Comp> COMPARATOR =
			comparing((Comp c) -> c.name)
					.thenComparingInt(c -> c.number)
					.thenComparingInt(c -> c.age);

	String name;
	int age;
	int number;

	@Override
	public int compareTo(Comp o) {
		return COMPARATOR.compare(this, o);
	}
}
