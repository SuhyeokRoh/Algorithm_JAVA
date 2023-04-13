import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int rst = 1;
		int mid = word.length()/2;
		for(int i=0;i<mid;i++) {
			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
				rst =0;
				break;
			}
		}
		br.close();
		System.out.println(rst);
	}
}