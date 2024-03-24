package org.java.algorithms;

public class RepeatedString {
    /** Repeated String
     * Problem: find and print the numbers of letter a's in the first n
     * letter of infinite String,
     * for example, if the String s="abcac"and n=10 the substring is abcacabcac
     * the first 10 characters of the infinite string. There are four occurrences
     * Function Description:
     * s: a String to repeat
     * n:the amount of character to consider
     * */
    public static void main(String[] args) {
    repeatedString("abac",10);

    }

    /**
     * The First Function
     * [1]:we will create empty string then we
     * will add the s in this string sens the length
     * of the new string small or equal n
     * [2]:and we will count the amount of the first char in the new String
     * [3]:and we will create variable count that is the number of repetition of the first char in the string
     * */

    public static long repeatedString(String s , long n){
        long count=0;
        StringBuffer str =new StringBuffer(s);
        StringBuffer stringBuffer=new StringBuffer();
        int strLength=str.length();

                while (strLength<=n){
                    str.append(s);
                    strLength=str.length();
                }
                if(strLength >= n) stringBuffer.append(str.substring(0,(int) n));
                for (int i=0 ; i<stringBuffer.length() ; i++){
                    if(stringBuffer.charAt(i)==stringBuffer.charAt(i+1))count++;
                }

        return count;
    }
    /**
     * Second Solution more optimal than the first one
     * [1]:we should calculate the amounts of char that we want to clack in all the string s
     * [2]:we have to know the amount of substring in n by dividing the n in string length
     * [3]:after that we will collect the number of char waned in all string
     * */
    public double repeatedStringTwo(String s,long n ){
         int strLength=s.length();
         long q=0, r=0;
         q=n/strLength; /* to know how the substring we have in n string */
         r=n%strLength;
         long partialString= r; 
         long aCount=q*getLetterCount(s,s.length())+getLetterCount(s,partialString);
        return 0;
    }
    public static long getLetterCount(String s,long strLength){
        long count=0;
        for (int i=0 ; i<strLength ;i++)
            if (s.charAt(i)=='a')count++;
        return count;
    }
}

