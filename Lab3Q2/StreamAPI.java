/* Write a program that reads a list of strings and removes duplicate strings from the list using the Stream API. Avoid using lambda expressions for this task. */
package Lab3Q2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("MCA");
		strings.add("MBA");
		strings.add("MCA");
		strings.add("PGDM");
		strings.add("PGDM");

		// Remove duplicates using Stream API
		//distinct() use for delete a duplicate string
		//collect(Collector. toList ()) is use for store a list of string without duplicate
		List<String> uniqueStrings = strings.stream().distinct().collect(Collectors.toList());
		// Print the list without duplicates
		System.out.println(uniqueStrings);
	}
}

