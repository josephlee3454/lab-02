package lab;

import java.util.Random;
import java.util.Arrays;




public class Library {
//    public static void main(String[] args) {
//        Library.Roll(4);
//        System.out.println();
//
//        System.out.println();
//
//    }
        public int [] Roll(int rolls){
            int[] RollArr = new int[rolls];
            for (int i = 0; i < RollArr.length; i++){
                RollArr[i] = (int) (Math.random() * 6);


            }
            return RollArr;
        }



        public boolean Doop( int[] arR) {
            int theVal;
            boolean doopHere = false;
            for (int i = 0; i < arR.length && !doopHere; i++) {
                theVal = arR[i];
                for (int j = i + 1; j < arR.length && !doopHere; j++) {
                    if (theVal == arR[j]) ;
                    doopHere = true;
                }
            }
                return doopHere;
            }

        public double avgMaker(int[] arR) {
            int total = 0;
            for (int i = 0; i < arR.length; i++){
                total += arR[i];

            }
            return total / arR.length;
        }

        public static int[] arrofArrs(int [][] inp){
            if(inp.length == 0 ){
                return new int[0];
            }

            int[] inpAvgs = new int[inp.length];
            for(int i = 0 ; i < inp.length; i++){
                inpAvgs[i] = avgMaker(inp[i]);
            }
    }



    }



