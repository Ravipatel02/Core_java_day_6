package Question4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {

	private String name;
	private Integer age;
	
	public Student(String name , Integer age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("ram",24));
		studentList.add(new Student("ramesh",21));
		studentList.add(new Student("ravi",26));
		studentList.add(new Student("simu",24));
		
		System.out.println("File serialization ..");
		fileSerializaion(studentList , "demo.txt");
		
		System.out.println("file deseriliazation ...");
		
		List<Student> ans = fileDeserialization("demo.txt");
		System.out.println(ans);

		
	}

	private static List<Student> fileDeserialization(String string) {
		List<Student> student = new ArrayList<>();
		try {
			FileInputStream file = new FileInputStream(string);
			ObjectInputStream object = new ObjectInputStream(file);
			Object object2 = object.readObject();
			student = (List<Student>) object2;
			System.out.println("file deseriliazation successfuly ...");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return student;
		
	}

	private static void fileSerializaion(List<Student> studentList, String string) {
		try {
			FileOutputStream file = new FileOutputStream(string);
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(studentList);
			System.out.println("successfully serialization ....");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
