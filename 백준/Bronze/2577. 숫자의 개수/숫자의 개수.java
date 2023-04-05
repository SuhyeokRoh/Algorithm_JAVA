import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> count = new HashMap<>();
		
		int A = Integer.parseInt(br.readLine());
		int B= Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		br.close();
		
		int rst = A*B*C;
		
		while(rst > 0) {
			if(count.containsKey(rst%10)) {
				count.put(rst%10, count.get(rst%10)+1);
			} else {
				count.put(rst%10, 1);
			}
			rst /= 10;
		}
		
		for(int i=0; i<10; i++) {
			if(count.containsKey(i)) {
				System.out.println(count.get(i));
			} else {
				System.out.println(0);
			}
		}
	}
}