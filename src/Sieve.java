import java.util.ArrayList;
import java.util.Collections;

public class Sieve {
	
//	private ArrayList<Integer> A;
//	
//	public Sieve() {
//		A = new ArrayList<Integer>();
//	}
	
	public static ArrayList<Integer> sieve(int n) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int p = 2; p <= n; p++) {
			A.add(p);
		}
		
		for(int p = 0; p < n - 1; p++) {
			if(A.get(p) != 2 && A.get(p) % 2 == 0) {
				A.set(p, 0);
			}
		}
		
		int j = 2;
		for(int p = 1; p < n - 2; p++) {
			if(A.get(p) > j) {
				j = A.get(p);
			}
			for(int k = 1; k < n - 2; k++) {
				if(A.get(k) % j == 0 && A.get(k) != j) {
					A.set(k, 0);
				}
			}
		}
		
		A.removeAll(Collections.singleton(0));
				
		return A;
	}
}
