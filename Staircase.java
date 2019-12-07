 static void staircase(int n) {

         for (int i=0;i<n;i++) {
            //System.out.println( "i= " + i + " -1st cycle");


             for (int j=1;j<=n;j++) {

                // System.out.println( "j= " + j + " - 2nd cycle");


                System.out.print( j<(n-i) ? "" : "#");

             }

             System.out.println();




         }




        }

