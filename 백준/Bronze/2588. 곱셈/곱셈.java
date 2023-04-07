import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int first = Integer.parseInt(br.readLine());
		String second = br.readLine();
		int tmp;
		
		for(int i=2; i>=0; i--) {
			tmp = second.charAt(i) - '0';
			System.out.println(first*tmp);
		}
		System.out.println(first * Integer.parseInt(second));
		br.close();
	}
}