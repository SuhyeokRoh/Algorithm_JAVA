import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] paper = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken())-1;
			int col = Integer.parseInt(st.nextToken())-1;
			for(int r=row; r<row+10; r++) {
				for(int c=col; c<col+10; c++) {
					paper[r][c] = 1;
				}
			}
		}
		
		br.close();
		
		for(int row=0; row<100; row++) {
			for(int col=0; col<100; col++) {
				if(paper[row][col] == 1) count ++;
			}
		}
		System.out.println(count);
	}
}