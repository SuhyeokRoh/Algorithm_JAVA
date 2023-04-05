import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] n1 = st.nextToken().split("");
		String[] n2 = st.nextToken().split("");
		
		br.close();
		
		int rn1 = 0;
		int rn2 = 0;
		
		for(int i=2; i>=0; i--) {
			rn1 = rn1 * 10 + Integer.parseInt(n1[i]);
			rn2 = rn2 * 10 + Integer.parseInt(n2[i]);
		}
		
		if (rn1 > rn2) System.out.println(rn1);
		else System.out.println(rn2);
	}
}