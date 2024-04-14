package Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person> {
	
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person {name=" + name + ", age=" + age + "}";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o==null || getClass() != o.getClass()) return false;
		
		Person person = (Person)o;
		return Objects.equals(name ,person.name) && Objects.equals(age , person.age);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name , age);
	}
	
	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}
	
	



	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("ravi" ,25) );
		personList.add(new Person("seema",27));
		personList.add(new Person("ramesh" , 21));
		personList.add(new Person("aseema" ,27));
		System.out.println("person data print without sorting");
		System.out.println(personList);
		
		System.out.println("persont data sorting with help of age");
		
		Collections.sort(personList);
		System.out.println(personList);
		
        System.out.println("persont data sorting with help of name");
		
		Collections.sort(personList , new SortByName());
		System.out.println(personList);
		
	}	

}
class SortByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
