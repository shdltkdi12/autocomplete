import java.util.*;
public class Test {
   public static void main(String[] args)  {
      String[] instrings = {"ape", "app", "ban", "bat", "bee", "car", "cat"};
      double[] indoubles = {6.0, 4.0, 2.0, 3.0, 5.0, 7.0, 1.0};
      Autocomplete.Autocompletor auto = new Autocomplete.TrieAutocomplete(instrings, indoubles);
      System.out.println(auto.topMatch(""));
      System.out.println(auto.topMatch("a"));
      System.out.println(auto.topMatch("ap"));
      System.out.println(auto.topMatch("b"));
      System.out.println(auto.topMatch("ba"));
      System.out.println(auto.topMatch("c"));
      System.out.println(auto.topMatch("ca"));
      System.out.println(auto.topMatch("cat"));
      System.out.println(auto.topMatch("d"));
      System.out.println(auto.topMatch(" "));
      System.out.println(auto.topMatches("", 8));      
      System.out.println(auto.topMatches("", 1));      
      System.out.println(auto.topMatches("", 2));      
      System.out.println(auto.topMatches("", 3));      
      System.out.println(auto.topMatches("a", 1));      
      System.out.println(auto.topMatches("ap", 1));      
      System.out.println(auto.topMatches("b",2));      
      System.out.println(auto.topMatches("ba", 2));
      System.out.println(auto.topMatches("d", 100));            
   }

}