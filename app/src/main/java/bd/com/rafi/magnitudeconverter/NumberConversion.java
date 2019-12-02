package bd.com.rafi.magnitudeconverter;

public class NumberConversion {


    public String numberSystemConversion(String value,String convertFrom,String convertTo){
        //input 5 , decimal,binary
        String finalconverted=null;

        if (convertFrom.toLowerCase().equals("decimal")){
            if(convertTo.toLowerCase().equals("binary")){
                int decimal;
                decimal = Integer.parseInt(value);

                finalconverted=Integer.toBinaryString(decimal);

            }
            else if(convertTo.toLowerCase().equals("octal")){
                int decimal;
                decimal = Integer.parseInt(value);
                finalconverted = Integer.toString(decimal,8);

            }
            else if (convertTo.toLowerCase().equals("hexadecimal")){
                int decimal;
                decimal = Integer.parseInt(value);
                finalconverted = Integer.toHexString(decimal);
            }
        }
        else  if(convertFrom.toLowerCase().equals("binary")){
            if(convertTo.toLowerCase().equals("decimal")){

                finalconverted = String.valueOf(Integer.parseInt(value, 2));

            }
            else if(convertTo.toLowerCase().equals("octal")){

                long l = Long.parseLong(value, 2);
                finalconverted = Long.toOctalString(l);

            }

            else if(convertTo.toLowerCase().equals("hexadecimal")){
                int decimal = Integer.parseInt(value,2);
                finalconverted= Integer.toString(decimal,16);
            }
        }
        else if(convertFrom.toLowerCase().equals("octal")){
            if(convertTo.toLowerCase().equals("decimal")){


                int decimal=Integer.parseInt(value,8);

                finalconverted=String.valueOf(decimal);
            }
            else if(convertTo.toLowerCase().equals("binary")){

                int decimal=Integer.parseInt(value,8);
                finalconverted=Integer.toBinaryString(decimal);

            }
            else if(convertTo.toLowerCase().equals("hexadecimal")){
                int decimal=Integer.parseInt(value,8);
                finalconverted = Integer.toHexString(decimal);

            }

        }
        else if(convertFrom.toLowerCase().equals("hexadecimal")){
            if(convertTo.toLowerCase().equals("decimal")){
                int hexadecimal =Integer.parseInt(value,16);
                finalconverted = String.valueOf(hexadecimal);
            }
            else if(convertTo.toLowerCase().equals("binary")){
                int hexadecimal=Integer.parseInt(value,16);
                finalconverted=Integer.toBinaryString(hexadecimal);
            }
            else if(convertTo.toLowerCase().equals("octal")){
                int hexadecimal=Integer.parseInt(value,16);

                finalconverted = Long.toOctalString(hexadecimal);

            }

        }


        return finalconverted;




    }



}
