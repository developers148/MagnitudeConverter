package bd.com.rafi.magnitudeconverter;

public class TempCon {


    private String finalresult = null;


    public String tempConversion(String value, String convertFrom, String convertTo) {
        double i = 0;


        try {
            i = Double.parseDouble(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (convertFrom.toLowerCase().equals("celsius")) {
            if (convertTo.toLowerCase().equals("celsius")) {
                finalresult = String.valueOf(i * 1);
            } else if (convertTo.toLowerCase().equals("fahrenheit")) {


                finalresult = String.valueOf((i * (9 / 5)) + 32);

            } else if (convertTo.toLowerCase().equals("kelvin")) {
                finalresult = String.valueOf(i + 273.15);
            }


        } else if (convertFrom.toLowerCase().equals("fahrenheit")) {
            if (convertTo.toLowerCase().equals("celsius")) {
                finalresult = String.valueOf((i - 32) * (5 / 9));
            } else if (convertTo.toLowerCase().equals("kelvin")) {

                finalresult = String.valueOf((i - 32) * (5 / 9) + 273.15);
            }

            } else if (convertFrom.toLowerCase().equals("kelvin")) {


                if (convertTo.toLowerCase().equals("celsius")) {
                    finalresult = String.valueOf(i - 273.15);

                } else if (convertTo.toLowerCase().equals("fahrenheit")) {


                    finalresult = String.valueOf((i - 273.15) * (9 / 5) + 32);
                }
            }

      
            return finalresult;

        }

    }

