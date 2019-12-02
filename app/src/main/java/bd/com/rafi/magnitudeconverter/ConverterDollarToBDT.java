package bd.com.rafi.magnitudeconverter;

import android.util.Log;

public class ConverterDollarToBDT {

    float CurrencyConverter(float Dvalue, String convertFrom,String convertTo){
        Log.d("convertFrom2", convertFrom);
        Log.d("convertTo2", convertTo);
        if(convertFrom.equals("USA(Dollar)")){
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*84.71);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*71.72);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*0.77);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*3.67);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*7.03);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*1.0);
            }
        }//end dollar if


       else if(convertFrom.equals("Bangladesh(Bdt)")){
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*1.0);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*0.85);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*0.0091);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*0.043);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*0.083);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*0.012);
            }


        }//end bdt if

       else if(convertFrom.equals("India(Rupee)")){
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*1.18);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*1.0);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*0.011);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*0.051);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*0.098);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*0.012);
            }

        }//end India if

      else if(convertFrom.equals("Uk(Pound)")){
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*109.43);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*92.66);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*1.0);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*4.75);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*9.09);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*1.29);
            }

        }//end Pound if

      else if(convertFrom.equals("UAE(Dirham)")){
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*23.07);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*19.53);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*0.21);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*1.0);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*1.91);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*0.27);
            }

        }//end Dirham if

      else if(convertFrom.equals("China(Yuan)")){
        //else{
            if(convertTo.equals("Bangladesh(Bdt)")){
                return (float) (Dvalue*12.04);
            }else if (convertTo.equals("India(Rupee)")){
                return (float) (Dvalue*10.20);
            }else if (convertTo.equals("Uk(Pound)")){
                return (float) (Dvalue*0.11);
            }
            else if (convertTo.equals("UAE(Dirham)")){
                return (float) (Dvalue*0.52);
            }
            else if (convertTo.equals("China(Yuan)")){
                return (float) (Dvalue*1.0);
            }
            else if (convertTo.equals("USA(Dollar)")){
                return (float) (Dvalue*0.14);
            }

        }//end else if


        return 0;
    }
}
