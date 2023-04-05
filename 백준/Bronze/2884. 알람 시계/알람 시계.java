import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int idx = 0;
		br.close();
		
		if(minute < 45) {
			idx += 1;
			minute = 60 + (minute - 45);
		} else minute -= 45;
		
		if(idx != 0) {
			if(hour == 0) {
				hour = 23;
			} else hour -= idx;
		}

		System.out.println(hour+" "+minute);	
	}
}