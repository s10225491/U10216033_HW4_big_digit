// U10216033
// BigNumber

import java.util.Scanner;

public class BigNumber {
   public static void main(String[] args) {
   
		Scanner input = new Scanner(System.in);
		
		// information for input number a
		System.out.println("�п�J�Ʀr a (�@����J�̦h4��ơA�̦h��J20���)");
		
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
		System.out.println("�п�J�Ʀr b (�@����J�̦h4��ơA�̦h��J20��ơA�B b > a)");
		
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
}