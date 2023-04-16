import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		int tmp;
		float aver;
		
		for(int i=0;i<cases;i++) {
			String[] arr = br.readLine().split(" "); 
			int students = Integer.parseInt(arr[0]);
			int total = 0;
			float count = 0;
			
			for(int j=1; j<=students; j++) {
				tmp = Integer.parseInt(arr[j]);
				total += tmp;
			}
			
			aver = total/students;
			
			for(int j=1; j<=students; j++) {
				tmp = Integer.parseInt(arr[j]);
				if (tmp > aver) count += 1;
			}
			System.out.printf("%.3f%%%n", count/students * 100);
		}
	}
}