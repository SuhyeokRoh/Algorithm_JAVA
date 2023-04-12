import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()) + 1;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = i;
		}
		
		int tmp;
		int range = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<range; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j=0; j<(b-a)/2+1; j++) {
				tmp = arr[a+j];
				arr[a+j] = arr[b-j];
				arr[b-j] = tmp;
			}
		}
		
		for(int i=1; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}