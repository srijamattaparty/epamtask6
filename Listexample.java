package epam6.Listexample;
import java.io.*;
import java.util.*;

public class Listexample {

	public static void main(String[] args) {
		
		String[] arr= {"a","b","c","d","e","f","g","h","i","j"};
		List l=new ArrayList(Arrays.asList(arr));
		System.out.println("List at creation time: "+l);
		l.add("k");
		l.add("l");
		System.out.println("List after adding elements: "+l);
		l.remove(2);
		System.out.println("List after removing element at index 2: "+l);
		System.out.println("Final list is: "+l);
		
		

	}

}
