import java.util.*;
import java.util.stream.Stream;
public class Main {

	public static void main(String s[]) {
		
		List list = new ArrayList();
		
		list.add("keyur");
		list.add("denish");
		list.add(10000);
		list.add("denish");
		
		//using normal for loop
		for(int i=0;i<list.size();i++) {			
			System.out.println("==> "+list.get(i));
		}
		System.out.println("===================");
		//using forEach loop
		for(Object obj : list) {
			System.out.println("==>"+obj);
		}
		
		System.out.println("===================");
		//usingIterator
		
		Iterator iterator = list.iterator();
		int i=1;
		while(iterator.hasNext()) {
			System.out.println("==>"+iterator.next());
			if(i==2)
				iterator.remove();			
			i++;
		}
		
		System.out.println("After Remove size: "+list.size());
		
		System.out.println("====================");
		//using java 8
		Stream<Object> listStream = list.stream();
		listStream.filter(p->p.equals("keyur")).
		forEach(p-> System.out.println("==>"+p));
	}
	
}
