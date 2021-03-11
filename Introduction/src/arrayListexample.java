import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<String> a=new ArrayList<String>();
		 a.add("mirza");
		 a.add("Java");
		 System.out.println(a);
		 a.add(0, "student");
		 System.out.println(a);
		// a.remove(1);
		 System.out.println(a);
		// a.remove("Java");
		 System.out.println(a);
		// a.removeAll(a);
		 System.out.println(a);
		 System.out.println(a.get(2));
		 System.out.println(a.contains("mirza"));
		 System.out.println(a.isEmpty());
		 System.out.println(a.indexOf("mirza"));
		 System.out.println(a.size());
		 a.add("java");
		 System.out.println(a.size());
		 
	}	

} 
