static void miniMaxSum(int[] arr) {

        //Using Arrays.sort method to Find Maximum and Minimum Values in an Array

        Arrays.sort(arr);

        long  minsum=0;
        long maxsum=0;

        for (int i=0;i<arr.length-1;i++) {

            minsum+=arr[i];
        }

        for (int i=1;i<arr.length;i++) {

            maxsum+=arr[i];
        }


        System.out.println("Minimum = " + arr[0]);
        System.out.println("Minimum = " + arr[arr.length-1]);

        System.out.println( "MinSum = " + minsum + " MaxSum = " + maxsum );

    }
