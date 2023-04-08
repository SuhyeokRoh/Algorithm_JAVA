import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		String word = br.readLine();
		long rst = 0;
		
		for(int i=0; i<word.length(); i++) {
			char tmp = word.charAt(i);
			int var = (int) tmp - 96;
			rst += var * Math.pow(31, i);
		}
		System.out.println(rst);
		br.close();
	}
}