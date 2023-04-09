import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int rst = Integer.MAX_VALUE;
		int tmp;
		for(int i=54; i>=0; i--) {
			if (N <= i) continue;
			else {
				tmp = N-i;
				int var = 0;
				while(tmp>0) {
					var += tmp % 10;
					tmp /= 10;
				}
				if(var == i) rst = Math.min(rst, N-i);
			}
		}
		if (rst == Integer.MAX_VALUE) rst = 0;
		System.out.println(rst);
		br.close();
	}
}