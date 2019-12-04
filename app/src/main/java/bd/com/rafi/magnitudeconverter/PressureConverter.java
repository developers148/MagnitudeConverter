package bd.com.rafi.magnitudeconverter;

import android.annotation.SuppressLint;

public class PressureConverter {
    private String finalresult = null;

    @SuppressLint("DefaultLocale")
    public String BarToPascal(String value, String convertFrom, String convertTo){
        double i = 0;


//        if(Double.parseDouble(value)== )
        try{
           i = Double.parseDouble(value);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(convertFrom.toLowerCase().equals("bar")){
            if(convertTo.toLowerCase().equals("pascal")){
                finalresult= String.valueOf(i*100000);
            }else if(convertTo.toLowerCase().equals("kilopascal")){
                finalresult = String.valueOf(i*1000);
            }else if(convertTo.toLowerCase().equals("bar")){
                finalresult = String.valueOf(i*1);
            }else if(convertTo.toLowerCase().equals("psi")){
                finalresult = String.valueOf(i*14.503773773);
            }else if(convertTo.toLowerCase().equals("atm")){
                finalresult = String.format("%.12",i*0.9869232667);
            }
        }else if(convertFrom.toLowerCase().equals("pascal")){

            if(convertTo.toLowerCase().equals("atm")){
                finalresult = String.format("%.12",i*0.0000098692);
            }else if(convertTo.toLowerCase().equals("kilopascal")){
                finalresult = String.format("%.12",i*0.001);
            }else if(convertTo.toLowerCase().equals("bar")){
                finalresult = String.format("%.12",i*0.00001);
            }else if(convertTo.toLowerCase().equals("psi")){
                finalresult = String.format("%.12",i*0.0001450377);
            }else if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*1);
            }


        }
        else if(convertFrom.toLowerCase().equals("kilopascal")){
            if(convertTo.toLowerCase().equals("kilopascal")){
                finalresult = String.valueOf(i*1);
            }else  if(convertTo.toLowerCase().equals("bar")){
                finalresult = String.valueOf(i*0.01);
            }else if(convertTo.toLowerCase().equals("psi")){
                finalresult = String.valueOf(i*0.1450377377);
            }else if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*1000);
            }else  if(convertTo.toLowerCase().equals("atm")){
                finalresult = String.format("%.12",i*0.0098692327);
            }
        }else if(convertFrom.toLowerCase().equals("psi")){
            if(convertTo.toLowerCase().equals("psi")){
                finalresult = String.valueOf(i*1);
            }else if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*6894.7572932);
            }else if(convertTo.toLowerCase().equals("kilopascal")){
                finalresult = String.valueOf(i*6.8947572932);
            }else if(convertTo.toLowerCase().equals("bar")){
                finalresult = String.valueOf(i*0.0689475729);
            }else if(convertTo.toLowerCase().equals("atm")){
                finalresult = String.valueOf(i*0.0680459639);
            }
        }else if(convertFrom.toLowerCase().equals("atm")){


            if(convertTo.toLowerCase().equals("psi")){
                finalresult = String.valueOf(i*14.695948775);
            }else if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*101325);
            }else if(convertTo.toLowerCase().equals("kilopascal")){
                finalresult = String.valueOf(i*101.325);
            }else if(convertTo.toLowerCase().equals("bar")){
                finalresult = String.valueOf(i*1.01325);
            }else if(convertTo.toLowerCase().equals("atm")){
                finalresult = String.valueOf(i*1);
            }
        }


        return finalresult;
    }


}
