package bd.com.rafi.magnitudeconverter;

import android.util.Log;

public class WeightMassConverter {



    public String weightToMass(String value,String ConvertFrom,String ConvertTo){

         String finalresult =null;
        double i =0;

        try{
            i = Double.parseDouble(value);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(ConvertFrom.toLowerCase().equals("kilogram")){
            Log.e("bb1","nnn");
            if(ConvertTo.toLowerCase().equals("gram")){
                finalresult = String.valueOf(i*1000);
                Log.e("bb2","nnn");
            }else if(ConvertTo.toLowerCase().equals("pound")){

                Log.e("bb4","nnn");
                finalresult = String.valueOf(i*2.2046226218);
            }else if(ConvertTo.toLowerCase().equals("ton")){
                finalresult = String.valueOf(i*0.001);
            }else if(ConvertTo.toLowerCase().equals("ounce")){
                finalresult = String.valueOf(i*35.27396195);
            }else if(ConvertTo.toLowerCase().equals("kilogram")){
                finalresult = String.valueOf(i*1);
            }
        }else if(ConvertFrom.toLowerCase().equals("pound")){
            if(ConvertTo.toLowerCase().equals("kilogram")){
                finalresult = String.format("%.12f",i*0.45359237);
            }else if(ConvertTo.toLowerCase().equals("gram")){
                finalresult = String.valueOf(i*453.59237);
            }else if(ConvertTo.toLowerCase().equals("ton")){
                finalresult = String.format("%.12f",i*0.0004535924);
            }else if(ConvertTo.toLowerCase().equals("ounce")){
                finalresult = String.valueOf(i*16);
            }else if(ConvertTo.toLowerCase().equals("pound")){
                finalresult = String.valueOf(i*1);
            }
        }else if(ConvertFrom.toLowerCase().equals("ounce")){
            if(ConvertTo.toLowerCase().equals("kilogram")){
                finalresult = String.format("%.12f",i*0.0283495231);
            }else if(ConvertTo.toLowerCase().equals("gram")){
                finalresult = String.format("%.12f",i*28.349523125);
            }else if(ConvertTo.toLowerCase().equals("ton")){
                finalresult = String.format("%.12f",i*0.0000283495);
            }else if(ConvertTo.toLowerCase().equals("pound")){
                finalresult = String.valueOf(i*0.0625);
            }else if(ConvertTo.toLowerCase().equals("ounce")){
                finalresult = String.valueOf(i*1);
            }
        }else if(ConvertFrom.toLowerCase().equals("ton")){
            if(ConvertTo.toLowerCase().equals("kilogram")){
                finalresult = String.valueOf(i*1000);
            }else if(ConvertTo.toLowerCase().equals("gram")){
                finalresult = String.valueOf(i*1000000);
            }else if(ConvertTo.toLowerCase().equals("ton")){
                finalresult =String.valueOf(i*1);

            }else if(ConvertTo.toLowerCase().equals("pound")){
                finalresult =String.valueOf(i*2204.6226218);
            }else if(ConvertTo.toLowerCase().equals("ounce")){
                finalresult =String.valueOf(i*35273.96195);
            }
        }else if(ConvertFrom.toLowerCase().equals("gram")){
            if(ConvertTo.toLowerCase().equals("kilogram")){
                finalresult = String.format("%.12f",i*0.001);

            }else if(ConvertTo.toLowerCase().equals("gram")){
                finalresult = String.valueOf(i*1);
            }else if(ConvertTo.toLowerCase().equals("ton")){
                finalresult = String.format("%.12f",i*0.000001);
            }else  if(ConvertTo.toLowerCase().equals("pound")){
                finalresult = String.format("%.12f",i*0.0022046226);
            }else  if(ConvertTo.toLowerCase().equals("ounce")){
                finalresult = String.format("%.12f",i*0.0352739619);
            }
        }

        return  finalresult;


    }
}
