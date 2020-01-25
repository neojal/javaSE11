package com.neojal.javaSE11.liveCoding;

import java.util.Arrays;

public class Exercises {

    /**
     *
     * @param arr
     * @return
     */
    public int magicIndex(int[] arr) {

        int l = 0;
        int r = arr.length-1;

        while(l<=r) {

            int m = l + (r-l)/2;

            if(arr[m]==m)
                return m;

            if(m<arr[m])
                r = m - 1;

            else
                l = m + 1;
        }

        return -1;
    }

    /**
     *
     * @param s
     * @return reversed s
     */
    public String reverseSingleString(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    /**
     *
     * @param s, string with special characters
     * @return reversed s but ignoring special characters
     *
     *  Input:  abc,d,f
     *  Output: fdc,b,a
     */
    public String reverseSpecialString(String s) {

        char[] str = s.toCharArray();

        //setup index pointers
        int l = 0;
        int r = str.length-1;

        while(l<r) {

            if(!Character.isAlphabetic(str[l])) {
                l++;
            }
            else if(!Character.isAlphabetic(str[r])) {
                r--;
            }
            else {
                char tmp = str[l];
                str[l++] = str[r];
                str[r--] = tmp;
            }
        }
        return String.valueOf(str);
    }

    /**
     *
     * @params s1, s2
     * @return true if s2 is an anagram of s1
     */
    public boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length())
            return false;

        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<str1.length; i++) {

            if(str1[i]!=str2[i])
                return false;
        }

        return true;
    }


    /**
     *
     * @param arr
     * @param x,
     * @return x if found, -1 otherwise
     */
    public int binarySearch(int[] arr, int x) {

        int l = 0;
        int r = arr.length-1;

        while(l<=r) {

            int m = l+(r-l)/2;

            if(arr[m]==x)
                return m;

            if(arr[m]<x)
                l = m+1;

            else
                r = m-1;
        }

        return -1;
    }
}
