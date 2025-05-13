
public class PrintNumber {
	
	//1. WAP to print numbers from 1-50.
	public static void printNumberFrom1to50(int count) {
		if(count>50) {
			return;
		}
		System.out.println(count);
		printNumberFrom1to50(++count);
	}
	
	//2. WAP to print number from 1-n.
	public static void printNumberFrom1toN(int n) {
		if(n==0) {
			return;
		}
		
		printNumberFrom1toN(--n);
		System.out.println(n+1);
	}
	
	//3. WAP to print number from n-1.
		public static void printNumberFromNto1(int n) {
			if(n==0) {
				return;
			}
			System.out.println(n);
			printNumberFromNto1(--n);
			
		}
	
	
	public static void main(String[] args) {
//		printNumberFrom1to50(1);
//		printNumberFrom1toN(100);
		printNumberFromNto1(20);
	}

}
