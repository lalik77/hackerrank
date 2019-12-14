static void minimumBribes(int[] q) {

        int swapcount=0;

        for (int i=q.length-1;i>=0;i-- ) {

            if (q[i]!=i+1) { // filter cases, when you do not bribe, be at the ith position wherever you are

                if( ( (i-1)>=0 ) && q[i-1]==(i+1)    ) {// 1) Being at initial ith position, valid current
                                                               // position after given bribe can be (i-1)th position
                    swapcount++;
                    swap(q,i,i-1);

                }
                else  if ( ( (i-2)>=0 ) && q[i-2]==(i+1)  )

                          { // 2) Being at initial ith position, valid current
                                                              // position after given bribes can be (i-2)th position
                            swapcount+=2;
                             swap(q,i-2,i-1);
                             swap(q,i-1,i);

                   }  else  { // 3)Too chaotic (trying to bribe more than 2 people which is ahead of you)

                            System.out.println("Too chaotic");

                            return ;

                            }
            }



        }
        System.out.println(swapcount);

    }
