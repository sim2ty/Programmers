package programmers;

public class Fac_Per_Com {
	public static void main(String[] args) {
		System.out.println(combination(5, 2));

	}
	
	// 팩토리얼(Factorial)
	public static int factorial(int n) {
		int fac = 1;
		if(n==0) return 1;
		else{
			for (int i = 1; i <= n ; i++) {
				fac *= i;
			}
		}
		
	    return fac;	
	}
	
	// 순열(Permutation)
	public static int permutation(int n, int k) {
		int per = 1;
	    for(int i = 0 ; i < k ; i++) {
	        per *= (n-i);
	    }
	    return per;
		
	}
	
	// 조합(Combination)
	public static int combination(int n, int k) {
		return (permutation(n,k))/factorial(k);
	}
}
