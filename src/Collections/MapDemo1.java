package Collections;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo1 {
	
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		map.put(1, "Dhananjai");
		map.put(2, "Amit");
		
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}

	
	}
	
}
