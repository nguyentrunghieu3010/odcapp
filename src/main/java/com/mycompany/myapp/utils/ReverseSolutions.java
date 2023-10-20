package com.mycompany.myapp.utils;

public class ReverseSolutions {

    private static String reverseOnlyLetters2(String str){
        StringBuilder sb = new StringBuilder(str);
       for(int i=0, j=str.length()-1; i<j;) {
           if(!Character.isLetter(sb.charAt(i))) {
               ++i;
           } else if(!Character.isLetter(sb.charAt(j))){
               --j;
           } else {
               sb.setCharAt(i, sb.charAt(j));
               sb.setCharAt(j--, str.charAt(i++));
           }
       }
        return sb.toString();
    }

    private static String reverseOnlyLetters1(String str){
        char temp[] = str.toCharArray();
        int leftPos = 0, rightPos = str.length() - 1;
        while (leftPos < rightPos) {
            if(Character.isLetter(temp[leftPos]) && Character.isLetter(temp[rightPos])) {
                char i = temp[leftPos];
                temp[leftPos] = temp[rightPos];
                temp[rightPos] = i;
                leftPos++;
                rightPos--;
            } else if(Character.isLetter(temp[rightPos])) rightPos++;
            else if(Character.isLetter(temp[leftPos])) leftPos--;
        }
        return String.valueOf(temp);
    }

    public static void main (String[] args) {
        String inputString1 = "ab-cd";
        String inputString2 = "a-bC-dEf-ghIj";

        if(reverseOnlyLetters1(inputString1).equalsIgnoreCase(reverseOnlyLetters2(inputString1))) {
            System.out.println("True");
        } else  if(reverseOnlyLetters1(inputString2).equalsIgnoreCase(reverseOnlyLetters2(inputString2))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
