import java.util.ArrayList;
import java.util.List;

public class Sample {
 public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(70);
	li.add(20);
	li.add(100);
	System.out.println(li);
//
	System.out.println("Forloop");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
//
	System.out.println("Enhanced Forloop");
	for (Integer x : li) {
		System.out.println(x);
	}
	
	List<Integer> l1= new ArrayList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	System.out.println(l1);
	
//To add List to List
	li.addAll(l1);
	System.out.println(li);
	
	
	
	
	
	
			
	
	
	
	
}
}
