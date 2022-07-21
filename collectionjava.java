import java.util.*;
public class collectionjava {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Hyderabad");//
	      city.add("Chennai");    	   
	      System.out.println(city);  
	  	//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(5); 
	      vec.addElement(67); 
	      System.out.println(vec);
		
	  	//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Harsha");  
	      names.add("mohit");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(13);  
	       set.add(12);
	       set.add(4);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(5);  
	       set2.add(7);  
	       set2.add(8);
	       set2.add(1);	       
	       System.out.println(set2);
	      	} 
	}
}
