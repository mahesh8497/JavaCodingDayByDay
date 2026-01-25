package _JavaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		  Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,5,6));
	        Set<Integer> setB = new HashSet<>(Arrays.asList(1,5,6,7,8));
	        
	        Set<Integer> collect = setA.stream().filter(element->!setB.contains(element)).collect(Collectors.toSet());
	        
	        System.out.println(collect);

	}

}
