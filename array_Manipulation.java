 static long arrayManipulation(int n, int[][] queries) {

        long l;

        long [] A = new long[n];


        for (int m=0 ; m<queries.length;m++) {

            for (int i= queries[m][0]-1 ; i<n && i<queries[m][1] ; i++) {

                A[i] = A[i]+queries[m][2];
            }

        }


        /*for (int i= queries[0][0]-1 ; i<n && i<queries[0][1] ; i++) {

            A[i] = A[i]+queries[0][2];


            //for (int j=queries[0][0];j<queries[0][1];j++) {

             //    A[i] = A[i]+queries[0][2];

            //}
        }

        for (int i=queries[1][0]-1;i<n && i<queries[1][1];i++) {

            A[i] = A[i]+queries[1][2];


        }

        for (int i=queries[2][0]-1;i<n && i<queries[2][1];i++) {

            A[i] = A[i]+queries[2][2];


        }*/



        for (int i=0;i<n;i++) {

            System.out.println(A[i]);

        }


        // k queries[0][3] queries[1][3] queries[2][3]
        Arrays.sort(A);

        l= (long) A[A.length-1];

        System.out.println("Max value = " + l);


        return l;


    }
