package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Given a list of strings, use the Streams API to perform the following operations in sequence: filter out strings that are shorter than 4 characters, convert each string to uppercase, and collect the results into a new list.
//Print the original list and the transformed list.
public class UseStreamApi {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("ravi");
		stringList.add("jay");
		stringList.add("raj");
		stringList.add("ram");
		stringList.add("yesvant");
		stringList.add("xyz");
		stringList.add("A");
		stringList.add("ap");
		stringList.add("seema");
		stringList.add("hansraj");
		
		System.out.println(stringList);
		
		List<String> newList = stringList.stream().filter(name-> name.length()<=4).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
