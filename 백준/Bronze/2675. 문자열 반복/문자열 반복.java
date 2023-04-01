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
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			String[] tmp = br.readLine().split(" ");
			int repeat = Integer.parseInt(tmp[0]);
			String wrd = String.valueOf(tmp[1]);
			String nw = "";
			for(int j=0; j<wrd.length();j++) {
				for(int k=0; k<repeat; k++) {
					nw = nw + wrd.charAt(j);
				}
			}
			bw.write(nw+"\n");
		}

		br.close();		
		bw.flush();
		bw.close();
	}
}