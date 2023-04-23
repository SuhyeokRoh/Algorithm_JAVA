import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] token = {25, 10, 5, 1};
		
		int range = Integer.parseInt(br.readLine());
		for(int i=0; i<range; i++) {
			int price = Integer.parseInt(br.readLine());
			for(int x : token) {
				System.out.print(price / x+" ");
				price %= x;
			}
			System.out.println();
		}
		br.close();
	}
}