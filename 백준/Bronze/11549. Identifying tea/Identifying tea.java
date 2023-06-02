import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tea = Integer.parseInt(br.readLine());
		String[] lst = br.readLine().split(" ");
		int rst = 0;
		
		for(String x : lst) {
			int tmp = Integer.parseInt(x);
			if (tmp == tea) {
				rst ++;
			}
		}
		
		System.out.println(rst);
	}
}