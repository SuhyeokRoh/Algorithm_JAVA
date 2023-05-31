import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int chicken = Integer.parseInt(br.readLine());
		String[] lst = br.readLine().split(" ");
		int rst = 0;
		int tmp;
		
		for(String x : lst) {
			tmp = Integer.parseInt(x);
			if (chicken >= tmp) rst += tmp;
			else rst += chicken;
		}
		
		System.out.println(rst);
	}
}