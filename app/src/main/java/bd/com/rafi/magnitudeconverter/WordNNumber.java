package bd.com.rafi.magnitudeconverter;

import android.util.ArrayMap;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class WordNNumber {

    static HashMap<String, Integer> numbers= new HashMap<String, Integer>();

    static HashMap<String, Integer> onumbers= new HashMap<String, Integer>();
    static HashMap<String, Integer> tnumbers= new HashMap<String, Integer>();
    static HashMap<String,Integer> valuenumber=new HashMap<>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);


        tnumbers.put("twenty", 20);
        tnumbers.put("thirty", 30);
        tnumbers.put("fourty", 40);
        tnumbers.put("fifty", 50);
        tnumbers.put("sixty", 60);
        tnumbers.put("seventy", 70);
        tnumbers.put("eighty", 80);
        tnumbers.put("ninety", 90);

        onumbers.put("hundred", 100);
        onumbers.put("thousand", 1000);
        onumbers.put("million", 1000000);
        onumbers.put("billion", 1000000000);

        //numbers.put("", );


        valuenumber.put("ten",1);
        valuenumber.put("twenty",2);
        valuenumber.put("thirty",3);
        valuenumber.put("fourty",4);
        valuenumber.put("fifty",5);
        valuenumber.put("sixty",6);
        valuenumber.put("seventy",7);
        valuenumber.put("eighty",8);
        valuenumber.put("ninety",9);
        valuenumber.put("hundred",10);
        valuenumber.put("thousand",11);
        valuenumber.put("million",12);
        valuenumber.put("billion",13);

    }



    public static long wordToNumber(String input) {
        System.out.println("===========\nInput string = "+input);
        long sum=0;
        long temp=0;
        long previous=0;
        String [] splitted= input.toLowerCase().split(" ");


        for (String s:splitted
             ) {
            Log.e("spilited",s);

        }
        for(String split:splitted){

            if( numbers.get(split)!=null){
                temp= numbers.get(split);

                sum=sum+temp;

                previous=previous+temp;


                Log.e("sum",String.valueOf(sum));
                Log.e("previous",String.valueOf(previous));
            }
            else if(onumbers.get(split)!=null){


                Log.e("value before num",String.valueOf(sum));
                Log.e("sum",String.valueOf(sum));
                Log.e("previous",String.valueOf(previous));
                Log.e("temp",String.valueOf(temp));

                if(sum!=0){
                    sum=sum-previous;
                }
                sum=sum+((long)previous)*(long)onumbers.get(split);

                temp=0;
                previous=0;



                Log.e("value before num",String.valueOf(sum));
                Log.e("sum",String.valueOf(sum));
                Log.e("previous",String.valueOf(previous));
                Log.e("temp",String.valueOf(temp));


            }
            else if(tnumbers.get(split)!=null){
                temp=tnumbers.get(split);
                sum=sum+temp;

                previous=temp;
            }

        }

        return sum;
    }



}
