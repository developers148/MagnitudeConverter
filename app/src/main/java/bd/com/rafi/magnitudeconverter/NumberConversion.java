package bd.com.rafi.magnitudeconverter;

class NumberConversion {


    String numberSystemConversion(String value, String convertFrom, String convertTo){
        //input 5 , decimal,binary
        String finalconverted=null;
        switch (convertFrom) {
            case "Decimal":
                switch (convertTo) {
                    case "Binary": {
                        int decimal;
                        decimal = Integer.parseInt(value);
                        finalconverted = Integer.toBinaryString(decimal);
                        break;
                    }
                    case "Octal": {
                        int decimal;
                        decimal = Integer.parseInt(value);
                        finalconverted = Integer.toString(decimal, 8);
                        break;
                    }
                    case "Hexadecimal": {
                        int decimal;
                        decimal = Integer.parseInt(value);
                        finalconverted = Integer.toHexString(decimal);
                        break;
                    }
                }
                break;
            case "Binary":
                switch (convertTo) {
                    case "Decimal":
                        finalconverted = String.valueOf(Integer.parseInt(value, 2));
                        break;
                    case "Octal":
                        long l = Long.parseLong(value, 2);
                        finalconverted = Long.toOctalString(l);
                        break;
                    case "Hexadecimal":
                        int decimal = Integer.parseInt(value, 2);
                        finalconverted = Integer.toString(decimal, 16);
                        break;
                }
                break;
            case "Octal":
                switch (convertTo) {
                    case "decimal": {
                        int decimal = Integer.parseInt(value, 8);
                        finalconverted = String.valueOf(decimal);
                        break;
                    }
                    case "Binary": {
                        int decimal = Integer.parseInt(value, 8);
                        finalconverted = Integer.toBinaryString(decimal);
                        break;
                    }
                    case "Hexadecimal": {
                        int decimal = Integer.parseInt(value, 8);
                        finalconverted = Integer.toHexString(decimal);
                        break;
                    }
                }
                break;
            case "Hexadecimal":
                switch (convertTo) {
                    case "Decimal": {
                        int hexadecimal = Integer.parseInt(value, 16);
                        finalconverted = String.valueOf(hexadecimal);
                        break;
                    }
                    case "Binary": {
                        int hexadecimal = Integer.parseInt(value, 16);
                        finalconverted = Integer.toBinaryString(hexadecimal);
                        break;
                    }
                    case "Octal": {
                        int hexadecimal = Integer.parseInt(value, 16);
                        finalconverted = Long.toOctalString(hexadecimal);
                        break;
                    }
                }
                break;
        }
        return finalconverted;
    }
}
