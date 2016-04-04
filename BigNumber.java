// U10216033
// BigNumber

import java.util.Scanner;

public class BigNumber {
   public static void main(String[] args) {
   
		Scanner input = new Scanner(System.in);
		
		// information for input number a
		System.out.println("叫块计 a (Ω块程4计程块20计)");
		
		// input number a
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++){
			a[i] = input.nextInt();
		}
		
		// print number a
		System.out.print("Number a = ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
		
		// information for input number b
		System.out.println("叫块计 b (Ω块程4计程块20计 b > a)");
		
		// input number b
		int b[] = new int[5];
		for(int i = 0; i < b.length; i++){
			b[i] = input.nextInt();
		}
		
		// print number b
		System.out.print("Number b = ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i]);
		}
		System.out.println();
		
		
		// add numbers and print answer
        int[] c = BigNumber.add(a, b);
		System.out.print("a + b = ");
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
		
		
		// sub numbers and print answer
		int[] d = BigNumber.sub(a, b);
		System.out.print("a - b = ");
		for(int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }
    }
	
	// method for add
    public static int[] add(int[] a, int[] b) { 
        int carry = 0;
        int[] c = new int[a.length];

        for(int i = a.length - 1; i >= 0; i--) { 
            c[i] = a[i] + b[i] + carry; 
            if(c[i] < 10000) 
                carry = 0; 
            else {
                c[i] = c[i] - 10000; 
                carry = 1; 
            } 
        }
        return c;
    } 

	// method for sub
    public static int[] sub(int[] a, int[] b) { 
        int borrow = 0; 
        int[] c = new int[a.length];
        
        for(int i = a.length - 1; i >= 0; i--) { 
            c[i] = a[i] - b[i] - borrow; 
            if(c[i] >= 0) 
                borrow = 0; 
            else { 
                c[i] = c[i] + 10000; 
                borrow = 1; 
            } 
        }
        return c;
    } 
}