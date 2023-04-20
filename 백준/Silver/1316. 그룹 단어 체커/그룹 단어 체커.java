import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Character, Integer> alphabet = new HashMap<>();
		String word;
	
		
		int n = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int k=97; k<123; k++) {
				alphabet.put((char)k, 0);
			}
			char tmp = ' ';
			int tf = 1;
			st = new StringTokenizer(br.readLine());
			word = st.nextToken();
			for(int j=0; j<word.length(); j++) {
				if(tmp != word.charAt(j) && alphabet.get(word.charAt(j)) != 0) {
					tf = 0;
					continue;
				}
				else {
					tmp = word.charAt(j);
					alphabet.put(tmp, 1);
				}
			}
			if (tf == 1) count++;
		}
		br.close();
		
		System.out.println(count);
	}
}