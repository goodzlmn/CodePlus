
package InputOutput;
import java.util.*;
public class boj10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
			
		}
	}
}
