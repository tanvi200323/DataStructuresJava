package com.Strings;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int size = 5; //size 5 ki random string
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();
        for(int i=0;i<size;i++){
            int Randomchar = 97 + (int)(random.nextFloat()*26);
            char ch = (char)(Randomchar);
            sb.append(ch);
        }
        System.out.println(sb);

        //removing whitespaces
        String sentence = "    hi jsabdob sdc dcs    sf dv daf a fv  ";
        System.out.println(sentence);
        System.out.println(sentence.trim());//removes only leading and trailing whitespaces
        System.out.println(sentence.replaceAll("\\s",""));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
