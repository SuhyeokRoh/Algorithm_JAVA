import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		// Scanner와 동일한 기능을 하는 함수, 이 함수의 생성자는 InputStreamReader를 파라미터로 가짐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 타입별로 파싱해주는 메소드가 제공되지 않기 때문에 숫자로 읽고 싶다면 Integer.parseInt() 메소드로 변환
		
		int maxV = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (maxV < tmp) {
				maxV = tmp;
				index = i+1;
			}
		}
		
		bw.write(String.valueOf(maxV)+"\n");
		bw.write(String.valueOf(index));
		
		br.close();		
		bw.flush();
		bw.close();
	}
}