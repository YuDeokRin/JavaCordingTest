package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/*
    49. Group Anagrams
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 */
public class Group_Anagrams {
    public static void main(String[] args) {
        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        Map<int[], List<String>> anagrams = words.stream()
                .collect(Collectors.toMap(
                        // key - a sorted array of character code points
                        word -> word.codePoints().sorted().toArray(),
                        // value - a list of anagrams
                        word -> new ArrayList<>(List.of(word)),
                        // merge elements of two lists
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        },
                        // comparator that compares two int[] arrays
                        () -> new TreeMap<>(Arrays::compare)));

        anagrams.forEach((k, v) -> System.out.println(v));
    }
}
