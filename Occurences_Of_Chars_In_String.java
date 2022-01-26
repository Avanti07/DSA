import java.util.*;
import java.util.stream.Collectors;

class MyClass {

	public static void main(String[] args)
	{
		String str = "acdaaadcab";   // ans = 5a1b2c2d

    HashMap<Character, Integer> m = new HashMap<>();
    
    for(int i =0; i<str.length(); i++){
	    if(m.containsKey(str.charAt(i)))
		      m.put(str.charAt(i), m.get(str.charAt(i))+1);
	    else m.put(str.charAt(i), 1);
    }
     m.entrySet().stream().forEach( p -> System.out.print(p.getValue()+ ""+(p.getKey())));
  }  
}
