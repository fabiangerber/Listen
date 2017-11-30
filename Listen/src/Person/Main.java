package Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Person> personen = new ArrayList<Person>();
		
		personen.add(new Person("Hans", "Müller", 37));
		personen.add(new Person("Lukas", "Müller", 23));
		personen.add(new Person("Ludwig", "Meier", 80));
		personen.add(new Person("Hannes", "Koch", 7));
		personen.add(new Person("Anna", "Brunner", 20));
		personen.add(new Person("Alexander", "Zimmermann", 18));
		System.out.println("Unsortierte Liste");
		printPersonen(personen);
		
		
		
		
//		Consumer<Person> print = new myConsumer();
		
		// Stream-Version
		System.out.println("Gefiltert nach Vorname mit L mit Stream");
		personen.stream()
			.filter(person -> person.getVorname().startsWith("L"))
			.sorted((p1, p2) -> p1.getAge() - p2.getAge())
			.forEach(p-> System.out.println(p.toString()));
		
		// Plain
		System.out.println("Gefiltert nach Vorname mit L mit Plain-Old");
		List<Person> result = new ArrayList<Person>();
		for (Person p : personen) {
			if(p.getVorname().startsWith("L")) {
				result.add(p);
			}
		}
		Comparator<Person> c3 = new VornameComparator();
		result.sort(c3);
		for (Person person2 : result) {
			System.out.println(person2);
		}
		
		
		
		
		
	}

	private static void printPersonen(List<Person> personen) {
		for (Person p : personen) {
			System.out.println(p);
		}
		System.out.println("");
	}
}
