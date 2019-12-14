static int birthdayCakeCandles(int[] ar) {

        int c=0;
        int max=0;
        Arrays.sort(ar);

        max = ar[ar.length-1];

        for (int i=(ar.length-1);i>=0;i--) {

            if (max==ar[i]) c++;



        }

        return c;

    }
