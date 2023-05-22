import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[1]);
		int b = Integer.parseInt(tmp[2]);
		
		if (a==b) {
			System.out.println("Anything");
		} else if (a > b) {
			System.out.println("Subway");
		} else {
			System.out.println("Bus");
		}
	}
}