import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strs = br.readLine().split(" ");
		
		int[][] A = new int[Integer.parseInt(strs[0])][Integer.parseInt(strs[1])];
		int[][] B = new int[Integer.parseInt(strs[0])][Integer.parseInt(strs[1])];
		int[][] rst = new int[Integer.parseInt(strs[0])][Integer.parseInt(strs[1])];
		
		for(int i=0;i<Integer.parseInt(strs[0]);i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(strs[1]);j++)
				A[i][j] = Integer.parseInt(temp[j]);
		}
		
		for(int i=0;i<Integer.parseInt(strs[0]);i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(strs[1]);j++)
				B[i][j] = Integer.parseInt(temp[j]);
		}
		br.close();
		
		for(int i=0;i<Integer.parseInt(strs[0]);i++) {
			for(int j=0;j<Integer.parseInt(strs[1]);j++) {
				rst[i][j] = A[i][j] + B[i][j];
				bw.write(rst[i][j]+" ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}