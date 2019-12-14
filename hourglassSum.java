static int hourglassSum(int[][] arr) {

        int [][] SUM = new int[4][4];
       // int [] SUM1 = new int[16];
        int sum;
        int sum_max=Integer.MIN_VALUE;
        int counter=0;

        for (int i=0;i<4;i++) {

            for (int j=0;j<4;j++) {

                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                counter++;
                SUM[i][j]= sum;
                if (sum>sum_max) sum_max=sum;


            }

        }







        //sum=max;


        System.out.println("Counter= " + counter);

        return sum_max;

    }
