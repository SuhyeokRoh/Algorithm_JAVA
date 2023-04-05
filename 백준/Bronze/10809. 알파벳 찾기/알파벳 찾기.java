import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Character, Integer> s = new HashMap<>();
		String spell = br.readLine();
		
		for(int i=0; i<spell.length();i++) {
			if (s.containsKey(spell.charAt(i))) {
				continue;
			} else {
				s.put(spell.charAt(i), i);
			}
		}
		
		for(int j=97;j<123;j++) {
			char x = (char) j;
			if(s.containsKey(x)) System.out.print(s.get(x)+" ");
			else System.out.print(-1+" ");
		}
	}
}