package _JavaCoding;

import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
public static void main(String[] args) {
	  String s1 = "ABcCnmklL";
      String s2 = "AbCCMnkL";

      Set<Character> set2 = s2.chars()
              .mapToObj(c -> (char) c)
              .collect(Collectors.toSet());
      String result = s1.chars()
              .mapToObj(c -> (char) c)
              .filter(set2::contains)
              .distinct()
              .map(String::valueOf)
              .collect(Collectors.joining());

      System.out.println(result); 
  }
}
