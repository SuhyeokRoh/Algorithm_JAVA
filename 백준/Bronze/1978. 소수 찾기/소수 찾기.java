import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int tmp;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			tmp = 0;
			int num = Integer.parseInt(st.nextToken());
			if(num==1) {
				continue;
			}
//			System.out.println((int) Math.sqrt(num));
			for(int j=2; j<(int) Math.sqrt(num) + 1; j++) {
//				System.out.println(j+" "+num%j);
				if(num % j == 0) {
					tmp = 1;
					break;
				}
			}
			if(tmp==0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}