import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int rst = 0;
			int j = 0;
			String word = br.readLine();
			for(int k=0; k<word.length(); k++) {
				if(word.charAt(k) == 'O') {
					rst += ++j;
				} else {
					j = 0;
				}
			}
			bw.write(String.valueOf(rst)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}