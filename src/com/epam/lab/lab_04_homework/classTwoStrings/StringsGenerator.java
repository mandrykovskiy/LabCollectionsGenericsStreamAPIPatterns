package com.epam.lab.lab_04_homework.classTwoStrings;

import java.util.Random;

public class StringsGenerator {
    public String stringGenerator(){
        Random random = new Random();
        char min=97;
        char max=122;
        int lengtHMin=3;
        int lengthMax=10;
        String string="";
        for(int i=lengtHMin;i<=random.nextInt(lengthMax-lengtHMin)+lengtHMin;i++){
            string+=(char)(random.nextInt(max-min)+min);
        }
        return string;
    }
}
