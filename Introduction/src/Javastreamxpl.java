import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class Javastreamxpl {

	// USING OLD WAY NOT JAVA STREAMS

	@Test
	public void regular() {

		// Count the number of names starting with alphabet A in list

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Delon");
		names.add("Keset");
		names.add("Poster");
		names.add("Astorija");
		names.add("Aron");
		names.add("Ron");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}

		}

		System.out.println(count);
	}

	
	  //USING JAVA STREAMS API
	  
	  @Test public void stramFilter()
	  
	  { ArrayList<String> names = new ArrayList<String>(); names.add("Abhijeet");
	  names.add("Delon"); names.add("Keset"); names.add("Poster");
	  names.add("Astorija"); names.add("Aron"); names.add("Ron");
	  
	  Long c =names.stream().filter(s->s.startsWith("A")).count();
	  System.out.println(c);
	  
	 
	  long d =
	  Stream.of("Abhijet","Delon","Keset","Poster","Astorija","Aron","Ron").filter(
	  s-> { s.startsWith("A"); return true; }).count(); //System.out.println(d);
	  //print all the names of ArrayList
	 
	  //names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
	  
	  }
	 

	@Test
	public void streamMap() 
	{ArrayList<String> names=new ArrayList<String>();
		names.add("Set");
		names.add("Redem");
		names.add("Posten");
		names.add("Kuooli");
		

		// print names which have last letter as "a"
		// then it will mapped names with "a" and convert it to Upper case
		Stream.of("Abhijet", "Delon", "Keset", "Poster", "Astorija", "Aron", "Rona").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		// print names which have first letter as a with uppercase and sorted
		// Converting Arrays to ArraysList
		List<String>names1=Arrays.asList("abhijet", "Delon", "Keset", "Poster", "astorija", "aron", "Rona");
		names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 
		//merging 2 different lists
		Stream<String> newStream =Stream.concat(names.stream(),names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Kuooli"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("abhijeta", "Delon", "Keset", "Poster", "astorij", "Aron", "Rona").filter(s -> s.endsWith("a"))
		.map(s -> s.toUpperCase()) .collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//
		List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array
		
		//values.stream().distinct().forEach(s->System.out.print(s));
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		 
	}
	
    
}
