import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int maxv = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a<=b) {
                if (b < maxv) maxv = b;
            }
        }
        if (maxv != Integer.MAX_VALUE) System.out.println(maxv);
        else System.out.println(-1);
	}
}