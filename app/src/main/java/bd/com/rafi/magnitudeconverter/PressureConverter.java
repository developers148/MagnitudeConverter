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
            }
        }else if(convertFrom.toLowerCase().equals("kilopascal")){
            if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*1000);
            }
        }else if(convertFrom.toLowerCase().equals("psi")){
            if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*(double) 6894.7572932);
            }
        }else if(convertFrom.toLowerCase().equals("atm")){
            if(convertTo.toLowerCase().equals("pascal")){
                finalresult = String.valueOf(i*(double) 101325);
            }
        }else if(convertFrom.toLowerCase().equals("pascal")){
            if(convertTo.toLowerCase().equals("atm")){
//                finalresult = String.valueOf(i*(double)0.0000098692);

                finalresult = String.format("%.16f",i*(double)0.0000098692);
            }
        }
        return finalresult;
    }


}
