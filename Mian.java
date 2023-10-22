package Roughh;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String value");
		String s=scan.nextLine();
		Logic lo=new Logic();
		System.out.println("press 1 to perform reverseEntireString");
		System.out.println("press 2 to perform reverseEachWord");
		System.out.println("press 3 to perform alphabeticalOrder");
		System.out.println("press 4 to perform removeDuplicate");
		System.out.println("press 5 to perform CountingVowelsConsDigitsSpecialharacters");
		int num=scan.nextInt();
		
		switch(num) {
		case 1:
			lo.reverseEntireString(s);
			break;
		case 2:
			lo.reverseEachWord(s);
			break;
		case 3:
			lo.alphabeticalOrder(s);
			break;
		case 4:
			lo.removeDuplicate(s);
			break;
		case 5:
			lo.CountingVCDSC(s);
			break;
		default:
			System.out.println("no comments");
		}
	
		
		
		
	
		
		
	}

}
