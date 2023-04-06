import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int var = Integer.parseInt(br.readLine());
		while(var != 0) {
			boolean tmp = true;
			String v = Integer.toString(var);
			int length = v.length() / 2;

			for(int i=0; i<length; i++) {
				if(v.charAt(i) != v.charAt(v.length()-1-i)) {
					tmp = false;
					break;
				}
			}
			if(tmp) System.out.println("yes");
			else System.out.println("no");
			
			var = Integer.parseInt(br.readLine());
		}
		br.close();
	}
}