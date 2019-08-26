import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
      int n1 = Sc.nextInt();
      int n2 = Sc.nextInt();
      int n3 = Sc.nextInt();
      int avg = (n1+n2+n3)/3;
      System.out.println(avg);
	}
}