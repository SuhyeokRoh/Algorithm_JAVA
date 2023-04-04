import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[43];
		int tmp;
		int rst = 0;
		
		for(int i=0; i<10; i++) {
			tmp = Integer.parseInt(br.readLine()) % 42;
			arr[tmp] += 1;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > 0) rst += 1;
		}
		
		System.out.println(rst);
	}
}
