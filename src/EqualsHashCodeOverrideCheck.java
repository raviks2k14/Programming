import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeOverrideCheck {

	public static void main(String[] args) {
		Students s = new Students("H234");
		Students s2 = new Students("H234");

		//System.out.println(s.equals(s2));

		Map<Students, ReportCard> map = new HashMap<Students, ReportCard>();
		map.put(s, new ReportCard());
		map.put(s2, new ReportCard());
		
		System.out.println(map.size());

	}

}
