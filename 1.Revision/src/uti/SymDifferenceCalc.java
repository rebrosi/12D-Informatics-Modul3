package uti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymDifferenceCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setA = new HashSet(Arrays.asList("a", "b", "c", "d"));
		Set<String> setB = new HashSet(Arrays.asList("e", "f", "c"));
		System.out.println(symmetricDifference(setA, setB));
		
		
		
	}
	
	public static <T> Set<T> symmetricDifference( Set<T> setA, Set<T> setB ){
		Set<T> copyA = new HashSet(setA);
		Set<T> copyB = new HashSet(setB);
		
		Set<T> result = new HashSet();
		copyA.removeAll(setB);
		copyB.removeAll(setA);
		result.addAll(copyA);
		result.addAll(copyB);
		return result;
	}

}
