package Person;
import java.util.Comparator;

public class NachnameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getNachname().compareTo(o2.getNachname());
	}

}
