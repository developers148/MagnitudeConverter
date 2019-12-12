package bd.com.rafi.magnitudeconverter;

public class TimeConversion {
    private String finalconverted;

    public String time(String value, String convertFrom, String converTo) {



        ////converted from minute
        if (convertFrom.toLowerCase().equals("minute")) {

            if (converTo.toLowerCase().equals("second")) {
                Double minute;
                minute = Double.parseDouble(value) * 60;
                finalconverted = String.valueOf(minute);

            }else  if (converTo.toLowerCase().equals("hour")){

                double hour;
                hour = Double.parseDouble(value) * 0.0166667;
                finalconverted = String.valueOf(hour);
            }

            else  if (converTo.toLowerCase().equals("day")){

                double day;
                day = Double.parseDouble(value) * 0.000694444;
                finalconverted = String.valueOf(day);
            }
            else  if (converTo.toLowerCase().equals("week")){

                double week;
                week = Double.parseDouble(value) * 9.9206e-5;
                finalconverted = String.valueOf(week);
            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 2.2831e-5;
                finalconverted = String.valueOf(month);

            }

            else  if (converTo.toLowerCase().equals("year")){

                double year;
                year = Double.parseDouble(value) * 1.9026e-6;
                finalconverted = String.valueOf(year);
            }


        }

        //converted from secend
        else if ( convertFrom.toLowerCase().equals("second")){
            if (converTo.toLowerCase().equals("minute")){
                double secend;
                secend = Double.parseDouble(value) * 0.0166667;
                finalconverted = String.valueOf(secend);

            }
            else if (converTo.toLowerCase().equals("hour")){
                double hour;
                hour = Double.parseDouble(value) * 0.000277778;
                finalconverted = String.valueOf(hour);

            }
            else  if (converTo.toLowerCase().equals("day")){

                double day;
                day = Double.parseDouble(value) * 1.1574e-5;
                finalconverted = String.valueOf(day);
            }

            else if (converTo.toLowerCase().equals("week")){
                double week;
                week = Double.parseDouble(value) * 1.6534e-6;
                finalconverted = String.valueOf(week);

            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 3.8052e-7;
                finalconverted = String.valueOf(month);

            }
            else  if (converTo.toLowerCase().equals("year")){
                double year;
                year = Double.parseDouble(value) * 3.171e-8;
                finalconverted = String.valueOf(year);
            }
        }


        ////converted from hour
        else if ( convertFrom.toLowerCase().equals("hour")){
            if (converTo.toLowerCase().equals("minute")){
                double minute;
                minute = Double.parseDouble(value) * 60;
                finalconverted = String.valueOf(minute);

            } else if (converTo.toLowerCase().equals("second")){
                double secend;
                secend = Double.parseDouble(value) * 3600;
                finalconverted = String.valueOf(secend);

            }
            else  if (converTo.toLowerCase().equals("day")){

                double day;
                day = Double.parseDouble(value) * 0.0416667;
                finalconverted = String.valueOf(day);
            }

            else if (converTo.toLowerCase().equals("week")){
                double week;
                week = Double.parseDouble(value) * 0.00595238;
                finalconverted = String.valueOf(week);

            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 0.00136986;
                finalconverted = String.valueOf(month);

            }
            else if (converTo.toLowerCase().equals("year")){
                double year;
                year = Double.parseDouble(value) * 0.000114155;
                finalconverted = String.valueOf(year);

            }

        }

        //converted from day
        else if ( convertFrom.toLowerCase().equals("day")){
            if (converTo.toLowerCase().equals("minute")){
                double minute;
                minute = Double.parseDouble(value) * 1440;
                finalconverted = String.valueOf(minute);

            } else if (converTo.toLowerCase().equals("second")){
                double secend;
                secend = Double.parseDouble(value) * 86400;
                finalconverted = String.valueOf(secend);

            }
            else if (converTo.toLowerCase().equals("hour")){
                double hour;
                hour = Double.parseDouble(value) * 24;
                finalconverted = String.valueOf(hour);

            }

            else if (converTo.toLowerCase().equals("week")){
                double week;
                week = Double.parseDouble(value) * 0.142857;
                finalconverted = String.valueOf(week);

            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 0.0328767;
                finalconverted = String.valueOf(month);

            }
            else if (converTo.toLowerCase().equals("year")){
                double year;
                year = Double.parseDouble(value) * 0.00273973;
                finalconverted = String.valueOf(year);

            }

        }

        //converted from week
        else if ( convertFrom.toLowerCase().equals("week")){
            if (converTo.toLowerCase().equals("hour")){
                double hour;
                hour = Double.parseDouble(value) * 168;
                finalconverted = String.valueOf(hour);

            } else if (converTo.toLowerCase().equals("minute")){
                double minute;
                minute = Double.parseDouble(value) * 10080;
                finalconverted = String.valueOf(minute);

            }
            else if (converTo.toLowerCase().equals("second")){
                double secend;
                secend = Double.parseDouble(value) * 604800;
                finalconverted = String.valueOf(secend);

            }
            else if (converTo.toLowerCase().equals("day")){
                double day;
                day = Double.parseDouble(value) * 7;
                finalconverted = String.valueOf(day);

            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 0.230137;
                finalconverted = String.valueOf(month);

            }
            else if (converTo.toLowerCase().equals("year")){
                double year;
                year = Double.parseDouble(value) * 0.0191781;
                finalconverted = String.valueOf(year);

            }
        }


        //converted from month
        else if ( convertFrom.toLowerCase().equals("month")){
            if (converTo.toLowerCase().equals("hour")){
                double hour;
                hour = Double.parseDouble(value) * 730.001;
                finalconverted = String.valueOf(hour);

            } else if (converTo.toLowerCase().equals("minute")){
                double minute;
                minute = Double.parseDouble(value) * 43800;
                finalconverted = String.valueOf(minute);

            }
            else if (converTo.toLowerCase().equals("second")){
                double secend;
                secend = Double.parseDouble(value) * 2.628e+6;
                finalconverted = String.valueOf(secend);

            }

            else if (converTo.toLowerCase().equals("day")){
                double day;
                day = Double.parseDouble(value) * 30;
                finalconverted = String.valueOf(day);

            }
            else if (converTo.toLowerCase().equals("week")){
                double week;
                week = Double.parseDouble(value) * 4.34524;
                finalconverted = String.valueOf(week);

            }

            else if (converTo.toLowerCase().equals("year")){
                double year;
                year = Double.parseDouble(value) * 0.0833334;
                finalconverted = String.valueOf(year);

            }
        }


        //converted from year
        else if ( convertFrom.toLowerCase().equals("year")){
            if (converTo.toLowerCase().equals("hour")){
                double hour;
                hour = Double.parseDouble(value) * 8760;
                finalconverted = String.valueOf(hour);

            } else if (converTo.toLowerCase().equals("minute")){
                double minute;
                minute = Double.parseDouble(value) * 525600;
                finalconverted = String.valueOf(minute);

            }
            else if (converTo.toLowerCase().equals("second")){
                double secend;
                secend = Double.parseDouble(value) * 3.154e+7;
                finalconverted = String.valueOf(secend);

            }
            else if (converTo.toLowerCase().equals("month")){
                double month;
                month = Double.parseDouble(value) * 12;
                finalconverted = String.valueOf(month);

            }

            else if (converTo.toLowerCase().equals("week")){
                double week;
                week = Double.parseDouble(value) * 52.1429;
                finalconverted = String.valueOf(week);

            }
            else if (converTo.toLowerCase().equals("day")){
                double day;
                day = Double.parseDouble(value) * 52.1429;
                finalconverted = String.valueOf(day);

            }
        }



        return finalconverted;

    }
}
