package Person;

public class Person {
	private String vorname;
	private String nachname;
	private int age;
	
	Person(String vorname, String nachname, int age){
		this.vorname = vorname;
		this.nachname  = nachname;
		this.age = age;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAge() {
		return age;
	}

	
	
	
	@Override
	public String toString() {
		return vorname + " " + nachname + " " + age;
	}
}
