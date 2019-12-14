 static int[] rotLeft(int[] a, int d) {

        int len=a.length;
        int [] a_r = new int[len];
        int [] a_t = new  int[d];



            for (int i = 0; i<len-d;i++) {
                a_r[i]=a[i+d];
            }

            for (int j=0 ; j<a_t.length ; j++) {

                a_t[j]=a[j];
            }

            for (int i=len-d,j=0;i<len;i++,j++) {

                a_r[i]=a_t[j];

            }





            /*for (int i=len-1; i>=len-d ;i--){
                a_r[i]=a[i-d-1];

            }*/



        for (int i= 0 ; i<a_r.length ; i++) {

            System.out.println(a_r[i]);
                    }

       System.out.println("*************");

        for (int i= 0 ; i<a_t.length ; i++) {

            System.out.println(a_t[i]);
        }

        return a_r;
    }
