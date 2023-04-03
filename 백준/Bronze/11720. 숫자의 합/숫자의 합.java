import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int rst = 0;
		String[] word = br.readLine().split("");
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(word[i]);
			rst += tmp;
		}
		System.out.println(rst);
	}
}