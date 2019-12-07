static void plusMinus(int[] arr) {

        int l= arr.length;
        int a=0,b=0,c=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]<0) a++;
            else if (arr[i]==0) b++ ;
            else if (arr[i]>0) c++;

        }


        double d1 = new Double(c) / new Double(l) ;
        double d2= new Double(a) / new Double(l) ;
        double d3= new Double(b) / new Double(l);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(a + " " + b + " " + c);




    }
