
package easy;
import java.util.*;

public class PlusOne {
	
	//[1,2,3]
	/*
	 a = 3, 5
	 i = 0, 1,2
	 
	 
[0] = [1]
[1] = [2]
[1,1] = [1,2]
[9] = [1, 0]
[2, 9] = [3, 0]
[9, 9] = [1, 0, 0]
	 
	 
	 * 
	 * */
	
    public static int[] plusOne(int[] digits) {
		int n=digits.length;
		
		for (int i=n-1; i>=0; i--) {
			if (digits[i] != 9) {
				digits[i] += 1;
//				digits[i] = digits[i] + 1;
//				digits[i]++;

				return digits;
			}
			digits[i] = 0; 
		}

		int[] d = new int[n+1];
		d[0] = 1;
		return d;
    }

	public static void main(String[] args) {
		int[] digits = {1,2,3};
		int[] a = plusOne(digits);
		int[] b = plusOne(new int[] {4, 5, 6});
		int[] c = plusOne(new int[] {1, 0});
		int[] d = plusOne(new int[] {1});
		int[] e = plusOne(new int[] {9});
		int[] f = plusOne(new int[] {2,9});
		slove(new int[] {6,7});
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));

	}
	public static void slove(int[] digits) {
	int m=digits.length;
	if(digits[m-1]!=9) {
		int c=digits[m-1];
		digits[m-1]=c+1;
	}
	else
	{
		digits[m-1]=0;
		int d=digits[m-2];
		digits[m-2]=d+1;
	}
	System.out.println(Arrays.toString(digits));
	}

}
