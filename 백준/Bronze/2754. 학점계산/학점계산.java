import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, String> score = new HashMap<>();
		score.put("A", "4.0");
		score.put("B", "3.0");
		score.put("C", "2.0");
		score.put("D", "1.0");
		score.put("F", "0.0");
		score.put("+", "0.3");
		score.put("0", "0.0");
		score.put("-", "-0.3");
		
		float rst = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split("");
		br.close();
		
		for(int i=0;i<strs.length;i++) {
			rst += Float.parseFloat(score.get(strs[i]));
		}
		System.out.println(rst);
	}
}