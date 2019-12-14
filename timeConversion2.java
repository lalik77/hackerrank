static String timeConversion2(String s) {

        String hour=s.substring(0,2);

        if(s.charAt(8)=='P') {

            if (Integer.parseInt(hour) == 12) {
                hour = "12";

            } else {

                hour = Integer.toString(12 + Integer.parseInt(hour));
            }

        }
            else {

                if (Integer.parseInt(hour)==12) {

                    hour="00";
                }
            }
    return hour + s.substring(2,8);


}
