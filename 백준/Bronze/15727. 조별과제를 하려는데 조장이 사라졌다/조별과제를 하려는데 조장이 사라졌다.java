import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int road = sc.nextInt();
		int rst = road/5;
		if(road%5 !=0) rst++;
		System.out.println(rst);
	}
}