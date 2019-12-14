// Minimum Swaps 2 hacckerrank - https://www.includehelp.com/java-programs/minimum-swaps-required-to-sort-an-array.aspx
    static int minimumSwaps(int[] arr) {

        int swap=0;
        boolean visited[]=new boolean[arr.length];

        for (int i=0;i<arr.length;i++) {

            int j=i;
            int cycle=0;
            while(!visited[j]) {

                visited[j]=true;
                j=arr[j]-1;
                cycle++;
            }

            if(cycle!=0) swap+=cycle-1;
            //System.out.println(visite[i]);

        }

        return swap;
    }
