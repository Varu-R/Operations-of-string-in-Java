package Roughh;

public class Logic {
		public static void reverseEntireString(String s){
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
		public static void reverseEachWord(String s) {
			String arr[]= s.split(" ");
			StringBuffer sb=new StringBuffer(s);
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
				sb.append(arr[i]);
			}
			System.out.println();
		}
		public static void alphabeticalOrder(String s) {
			char ch2[]=s.toCharArray();
			char temp;
			
		
			for(int i=0;i<=ch2.length-1;i++) {
				for(int j=i+1;j<=ch2.length-1;j++) {
					if(ch2[i]>ch2[j]) {
						temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
				System.out.print(ch2[i]);
			}
			System.out.println();
			
		}
		public static void removeDuplicate(String s) {
			char ch3[]=s.toCharArray();
			for(int i=0;i<=ch3.length-1;i++) {
				boolean repeated=false;
				for(int j=i+1;j<=ch3.length-1;j++) {
					if(ch3[i]==ch3[j]) {
						repeated=true;
						break;
					}
				}
				if(!repeated) {
					System.out.print(ch3[i]);
					}
			}
			System.out.println();
		}
		public static void CountingVCDSC(String s) {
			int vc=0;
			int cc=0;
			int dc=0;
			int sc=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(!Character.isDigit(s.charAt(i))) {
					int a=s.charAt(i);
					if(!(a>=91 && a<=96)) {
						if(a>65 &&a<122) {
							if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ) {
								vc++;
							}
							else {
								cc++;
							}
						}
						else {
							sc++;
						}
					}
					else {
						dc++;
					}
				}
			
				
			}
			System.out.print(" vowel count= "+vc);
			System.out.println();
			System.out.print("consonent count= "+cc);
			System.out.println();
			System.out.print("digit count= "+dc);
			System.out.println();
			System.out.print("special character count= "+sc);
		}
	}
