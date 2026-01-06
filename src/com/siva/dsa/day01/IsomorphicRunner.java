package com.siva.dsa.day01;

import java.util.Scanner;

class IsomorphicSolver{
    public boolean isIsomorphic(String source, String target){
        if(source.length() != target.length()){
            return false;
        }

        int[] mapScourceToTarget = new int[256];
        int[] mapTargetToSource = new int[256];

        for(int i=0; i<source.length(); i++){
            char sourceChar = source.charAt(i);
            char targetChar = target.charAt(i);

            if(mapScourceToTarget[sourceChar] == 0 && mapTargetToSource[targetChar]==0){
                mapScourceToTarget[sourceChar] = targetChar;
                mapTargetToSource[targetChar] = sourceChar;
            }
            else{
                if(mapScourceToTarget[sourceChar] != targetChar || mapTargetToSource[targetChar] != sourceChar){
                    return false;
                }
            }
        }
        return true;
    }

}




public class IsomorphicRunner{
    public static void main(String[]megs){
        IsomorphicSolver obj = new IsomorphicSolver();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String source = sc.next();

        System.out.print("Enter the second string: ");
        String target = sc.next();

        Boolean result = obj.isIsomorphic(source, target);
        System.out.println(result);

    }
}

// Isomorphic string login is used to validate structure consistency
// Use Cases : Data Mapping, Masking, Pattern Validation, and Identity System while preventing ambiguity.
