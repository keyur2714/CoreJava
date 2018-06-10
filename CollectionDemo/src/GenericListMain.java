import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenericListMain {

	public static void main(String str[]) {
		List<String> names=new LinkedList<String>();
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		
		Integer lastNo= numbers.getLast();
		
		System.out.println("LastNo: "+lastNo);
		
		
		names.add("keyur");
		names.add("denish");		
		names.add("vinit");
		names.add("darshana");
		
		long count = names.stream().filter(p->p.startsWith("d")).count();
		String fileredNames =  names.stream().filter(p->p.startsWith("d")).collect(Collectors.joining("|"));
		System.out.println(fileredNames);
		//fileredNames.stream().forEach(p->System.out.println(p));
		System.out.println("Filter Record Count::"+count);
		
		System.out.println("After Filtered Records...");
		List<String> filteredNameList = names.stream().filter(p->p.startsWith("d")).collect(Collectors.toList());
		filteredNameList.stream().forEach(p->System.out.println(p));
		
	}
	
}
