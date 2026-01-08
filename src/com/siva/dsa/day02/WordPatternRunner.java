package com.siva.dsa.day02;

import java.util.*;
import java.util.regex.Pattern;


class WordPatternSolver{
    public boolean wordPattern(String pattern, String sentence){
        String[] words = sentence.split(" ");

        if(pattern.length() != words.length) return false;

        Map<Character,String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }else{
                if(usedWords.contains(word)) return false;

                map.put(ch,word);
                usedWords.add(word);
            }
        }
        return true;
    }
}

public class WordPatternRunner {
    public static void main(String[]megs){

        WordPatternSolver obj = new WordPatternSolver();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pattern: ");

        String pattern = sc.next();
        sc.nextLine();
        String sentence = sc.nextLine();

        Boolean result = obj.wordPattern(pattern,sentence);

        System.out.println(result);


    }
}

// output

// Enter the pattern: sodf
// sep oct dec feb
// true

// Enter the pattern: sodf
// sep sep oct dec
// false


// This code checks whether the pattern is always matches to the same word in the sentence
// Make sure no two letters point to the same word.
// Use Cases: Template,message system, Forms & Input Validation, Configuration & Rule Engineering and Data Mapping, NLP, etc
