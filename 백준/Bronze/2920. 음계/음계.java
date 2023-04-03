import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		
		if (first == 1) {
			for(int i=2; i<9; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp != i) {
					bw.write("mixed");
					break;
				}
				
			if(i==8) {
				bw.write("ascending");
			}
				
			}
		} else if(first == 8) {
			for(int i=7; i>0; i--) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp != i) {
					bw.write("mixed");
					break;
				}
				
			if(i==1) {
				bw.write("descending");
			}
				
			}
		} else {
			bw.write("mixed");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}