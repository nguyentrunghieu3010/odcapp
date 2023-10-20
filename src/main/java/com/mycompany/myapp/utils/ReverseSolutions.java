package com.mycompany.myapp.utils;

public class ReverseSolutions {


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
        String output1 = reverseOnlyLetters1(inputString1);
        System.out.println("Output is dc-ba = " + output1);

        String inputString2 = "a-bC-dEf-ghIj";
        String output2 = reverseOnlyLetters1(inputString2);
        System.out.println("Output is: " + output2);
    }


}
