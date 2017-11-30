package Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;


class PersonTest {

	private ArrayList<Person> personen;

	public void setup() {
		personen = new ArrayList<Person>();
		personen.add(new Person("Hans", "Müller", 37));
		personen.add(new Person("Lukas", "Müller", 23));
		personen.add(new Person("Ludwig", "Meier", 80));
		personen.add(new Person("Hannes", "Koch", 7));
		personen.add(new Person("Anna", "Brunner", 20));
		personen.add(new Person("Alexander", "Zimmermann", 18));
	}
	
	public void printPersonenListe() {
		personen.stream().forEach(p-> System.out.println(p.toString()));
		System.out.println("");
	}

	@Test
	void SortVornameWithComparator() {
		setup();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Sortiert nach Vorname mit Comparator");
		Comparator<Person> c = new VornameComparator();
		personen.sort(c);
		assertEquals(personen.get(0).getVorname(), "Alexander");
		printPersonenListe();
	}
	
	@Test
	void SortNachnameWithComparator() {
		setup();
		System.out.println("Sortiert nach Nachname mit Comparator");
		Comparator<Person> c = new NachnameComparator();
		personen.sort(c);
		assertEquals(personen.get(0).getVorname(), "Anna");
		printPersonenListe();
	}
	
	@Test
	void sortAlterWithLambdaExpr() {
		setup();
		System.out.println("Sortiert nach Alter mit Lambda");
		personen.sort((p1, p2) -> p1.getAge() - p2.getAge());
		assertEquals(personen.get(0).getVorname(), "Hannes");
		printPersonenListe();
	}
	
	@Test
	void useStreamFindVornameWithL() {
		setup();
		System.out.println("Gefiltert nach Vorname mit L mit Stream");
		List<Person> personenWithL = new ArrayList<Person>();
		personen.stream()
			.filter(person -> person.getVorname().startsWith("L"))
			.sorted((p1, p2) ->  p1.getAge()-p2.getAge())
			.forEach(p->System.out.println(p.toString()));
		System.out.println("");
	}
	
	@Test 
	void plainOldFindVornameWithL(){
		setup();
		System.out.println("Gefiltert nach Vorname mit L mit Plain-Old");
		List<Person> result = new ArrayList<Person>();
		for (Person p : personen) {
			if(p.getVorname().startsWith("L")) {
				result.add(p);
			}
		}
		Comparator<Person> c = new VornameComparator();
		result.sort(c);
		for (Person person2 : result) {
			System.out.println(person2);
		}
		System.out.println("");
	}
	
//	@Test
//	void getPersonBetween13And25() {
//		setup();
//		personen.stream()
//			.filter(person-> (person.getAge<25 && person.getAge()>12)
//			.;
//	}
}
 