import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rst = 0;
		
		String[] strs = br.readLine().split(" ");
		
		br.close();
		
		for(int i=0; i<strs.length; i++) {
			int a = Integer.parseInt(strs[i]);
			rst += a*a;
		}
		rst = rst % 10;
		System.out.println(rst);
	}
}