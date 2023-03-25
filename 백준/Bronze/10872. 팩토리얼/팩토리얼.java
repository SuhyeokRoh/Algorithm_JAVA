import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// Scanner와 동일한 기능을 하는 함수, 이 함수의 생성자는 InputStreamReader를 파라미터로 가짐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 타입별로 파싱해주는 메소드가 제공되지 않기 때문에 숫자로 읽고 싶다면 Integer.parseInt() 메소드로 변환
		int n = Integer.parseInt(br.readLine());
		
		int rst = 1;
		
		for(int i=1; i<n+1; i++) {
			rst *= i;
		}
		System.out.println(rst);
		br.close();		
	}
}