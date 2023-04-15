import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		int[] rst = new int[N+1];
		int begin;
		int end;
		int start;
		
		for(int i=0; i<N+1; i++) {
			arr[i] = i;
		}
		
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			begin = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<begin; i++) {
				rst[i] = arr[i];
			}
			for(int k=0;k<end-begin+1;k++) {
				rst[begin+k] = arr[start];
				start += 1;
				if (start > end) start = begin;
			}
			
			for(int l=end+1; l<N+1; l++) {
				rst[l] = arr[l];
			}
			arr = rst.clone();
		}
		
		br.close();
		
		for (int i=1; i<N+1; i++) {
			System.out.print(rst[i]+" ");
		}
	}
}