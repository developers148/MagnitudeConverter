/*
package bd.com.rafi.magnitudeconverter;

import java.util.HashMap;

public class wordtonumber2 {
    boolean debug=true;
    //String word1="";

    // All words below and others should work
    //word="One thousand two hundred thirty four"; //1234
    //word="Twenty-one hundred thirty one"; //2131
    //word="Forty-three thousand seven hundred fifty one"; //43751
    //word="Nineteen thousand eighty"; // 19080
    //word="five-hundred-forty-three thousand two hundred ten"; //543210
    //word="ninety-eight-hundred-seventy-six thousand"; // 9876000

    // Max:



    String word="five-hundred-forty-three thousand two hundred ten";
    //word1.toLowerCase().trim();

    String oldWord="";
    while(word!=oldWord) {
        oldWord=word;
        word=word.replace("  "," ");
    }

    String[] data=word.split(" ");

    HashMap<String, Long> database=new HashMap<String, Long>();
    database.put("zero", 0L);
    database.put("one", 1L);
    database.put("two", 2L);
    database.put("three", 3L);
    database.put("four", 4L);
    database.put("five", 5L);
    database.put("six", 6L);
    database.put("seven", 7L);
    database.put("eight", 8L);
    database.put("nine", 9L);

    database.put("ten", 10L);
    database.put("hundred", 100L);
    database.put("thousand", 1000L);
    database.put("million", 1000000L);
    database.put("billion", 1000000000L);
    database.put("trillion", 1000000000000L);

    // Exceptional prefixes
    database.put("twen", 2L);
    database.put("thir", 3L);
    database.put("for", 4L);
    database.put("fif", 5L);
    database.put("eigh", 8L);

    // Other exceptions
    database.put("eleven", 11L);
    database.put("twelve", 12L);


    boolean negative=false;
    long sum=0;
    for(int i=0; i<data.length; i+=2) {

        long first=0;
        long second=1;

        try {
            if(data[i].equals("minus")) {
                if(debug) System.out.println("negative=true");
                negative=true;
                i--;
            } else if(data[i].endsWith("ty")) {
                first=database.get(data[i].split("ty")[0])*10;
                i--;
            } else if(data[i].endsWith("teen")) {
                first=database.get(data[i].split("teen")[0])+10;
                if(data.length>i+1)
                    if(database.get(data[i+1])%10!=0)
                        i--;
                    else
                        second=database.get(data[i+1]);
            } else if(data[i].contains("-")){
                String[] moreData=data[i].split("-");

                long a=0;
                long b=0;

                if(moreData[0].endsWith("ty")) {
                    a=database.get(moreData[0].split("ty")[0])*10;
                } else {
                    a=database.get(moreData[0]);
                }

                if(debug) System.out.println("a="+a);

                b=database.get(moreData[1]);
                if(b%10==0)
                    first=a*b;
                else
                    first=a+b;

                if(debug) System.out.println("b="+b);

                if(moreData.length>2) {
                    for(int z=2; z<moreData.length; z+=2) {
                        long d=0;
                        long e=0;

                        if(moreData[z].endsWith("ty")) {
                            d=database.get(moreData[z].split("ty")[0])*10;
                        } else {
                            d=database.get(moreData[z]);
                        }

                        if(debug) System.out.println("d="+d);

                        if(d%100==0) {
                            first*=d;
                            z--;
                        } else {
                            e=database.get(moreData[z+1]);
                            if(e%10==0)
                                first+=d*e;
                            else
                                first+=d+e;
                            if(debug) System.out.println("e="+e);
                        }
                    }
                }

                second=database.get(data[i+1]);

            } else if(word.length()>0){
                first=database.get(data[i]);
                if(data.length>i+1)
                    second=database.get(data[i+1]);
            } else {
                System.err.println("You didn't even enter a word :/");
            }

            if(debug) System.out.println("first="+first);
            if(debug) System.out.println("second="+second);

        } catch(Exception e) {
            System.out.println("[Debug Info, Ignore] Couldn't parse "+i+"["+data[i]+"]");
            e.printStackTrace(System.out);
        }

        sum+=first*second;
    }
    if(negative)
    sum*=-1;

    System.out.println("Result: "+sum);



}
*/
