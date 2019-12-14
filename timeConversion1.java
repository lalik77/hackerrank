static String timeConversion1(String s) {
        String str = s;
        String hour = str.substring(0,2);

        if (str.charAt(8) == 'P'){
            hour = (Integer.parseInt(hour) == 12) ? hour : (Integer.toString(12 + Integer.parseInt(hour)));
        } else {
            if (Integer.parseInt(hour) == 12){
                hour = "00";
            }
        }
        return hour + str.substring(2,8);
    }
