import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> dict = new HashMap<Integer, String>();
		dict.put(2, "ABC");
		dict.put(3, "DEF");
		dict.put(4, "GHI");
		dict.put(5, "JKL");
		dict.put(6, "MNO");
		dict.put(7, "PQRS");
		dict.put(8, "TUV");
		dict.put(9, "WXYZ");
		
		String[] word = br.readLine().split("");
		int total = word.length;
		
		br.close();
		
		for(int i=0; i<word.length; i++) {
			for(int x : dict.keySet()) {
				if (dict.get(x).contains(word[i])) {
					total += x;
					break;
				}
			}
		}
		System.out.println(total);
	}
}