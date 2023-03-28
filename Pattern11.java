/* 
1 1 1 2 1 3 
2 1 2 2 2 3 
3 1 3 2 3 3 
4 1 4 2 4 3
5 1 5 2 5 3 
             */


class Pattern11{   
    public static void main(String[] args) {
      
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=3;j++)
          {
             System.out.printf(i+" "+j+" ");  // i and j values are printed at a time. that perpose we are 
                                               // taking j<=3.
               
          }
          System.out.println("");      
      }
    }
}
