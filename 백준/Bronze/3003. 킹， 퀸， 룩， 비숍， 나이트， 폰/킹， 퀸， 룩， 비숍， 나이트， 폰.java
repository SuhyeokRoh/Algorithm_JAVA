import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<6; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(i<2) System.out.print(1-tmp+" ");
			else if(i<5) System.out.print(2-tmp+" ");
			else System.out.println(8- tmp);
		}
	}
}