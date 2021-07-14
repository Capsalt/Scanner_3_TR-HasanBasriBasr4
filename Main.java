import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
		
		int kisaKenar = scan.nextInt();
		int uzunKenar = scan.nextInt();
		
		int cevre = (kisaKenar + uzunKenar) * 2;
		int alan = kisaKenar* uzunKenar;
		
		System.out.println("Alan: " + alan + "\nCevre: " + cevre);
  }
}