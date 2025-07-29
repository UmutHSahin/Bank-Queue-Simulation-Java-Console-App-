package Machine;

import java.util.Random;
import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Bank Queue App");
		System.out.print("Please Enter TCKN Number : ");

		String tckn = scanner.nextLine();
		
		Queue Userstckn = new Queue();  //Here we get the users tckn num and send new tckn number to private tckn value in Queue file 
		Userstckn.setTckn(tckn); 
		
		
		
		
		
		
	}

}
