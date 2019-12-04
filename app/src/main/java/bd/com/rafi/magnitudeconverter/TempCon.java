package bd.com.rafi.magnitudeconverter;

public class TempCon {

    public String tempConversion(String value, String conFrom, String conTo) {

        String finalCon=null;

//        Celsius to Fahrenheit(c2f)

        if (conTo.toString().equals("c2f"))
        {

//            Fahrenheit to Celsius (f2c)
            if (conFrom.toString().equals("f2c"))
            {

                int c;
                c=Integer.parseInt(value);
                finalCon=String.valueOf((c * 9) / 5 + 32);

            }

            else
            {
                int f;
                f=Integer.parseInt(value);
                finalCon=String.valueOf((f-32)*5/9);
            }


        }
        else
        {
            int f;
            f=Integer.parseInt(value);
            finalCon=String.valueOf((f-32)*5/9);
        }

//        Kelvin to Fahrenheit (k2f)

        if (conTo.toString().equals("k2f"))
        {

//            Fahrenheit to Kelvin(f2k)
            if (conFrom.toString().equals("f2k"))
            {

                int f;
                f=Integer.parseInt(value);
                finalCon=String.valueOf(5/9*(f-32)+273);

            }

            else
            {
                int k;
                k=Integer.parseInt(value);
                finalCon=String.valueOf( 9/5 * (k - 273) + 32);
            }
        }

//        Kelvin to Celsius(k2c)

        if (conTo.toString().equals("k2c"))
        {

//            Celsius to Kelvin(c2k)
            if (conFrom.toString().equals("c2k"))
            {

                int c;
                c=Integer.parseInt(value);
                finalCon=String.valueOf( c + 273);

            }

            else
            {
                int k;
                k=Integer.parseInt(value);
                finalCon=String.valueOf(k - 273);
            }
        }




        return finalCon;
    }




}
