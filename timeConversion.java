static String timeConversion(String s) {

        //"07:05:45AM"

        StringBuffer str=null;
        int h1=(int)s.charAt(1)- '0'; // to be Western digits, you can just subtract '0'
        int h2=(int)s.charAt(0)-'0';
        int hh =  (h2*10 + h1%10);

        System.out.println("h1 " + h1 + "  h2 " + h2 + "  hh " + hh);

        // if time is in AM

        if(s.charAt(8)=='A') {

            if(hh==12) {

                System.out.print("00");

                for (int i=2;i<=7;i++)
                   System.out.print(s.charAt(i));


            }
            else {
                for (int i=0;i<=7;i++)

                    System.out.print(s.charAt(i));





            }
        }

        // if time is in PM

        if (s.charAt(8)=='P') {

            if (hh==12) {

                System.out.println("24");
                for (int i=2;i<=7;i++)
                    System.out.print(s.charAt(i));


            }
            else {

                hh=hh+12;
                System.out.print(hh);

                for(int i=2;i<=7;i++)
                    System.out.print(s.charAt(i));
            }

        }


        return s;
    }
