

public class IterationCom {
    /**
    * @Description: Calculating how many wheat we can get
    * @param grid
    * @return long 
    */

    public static long getNumberOfWheat(int grid) {

     long sum = 0;      // Total number of wheat
     long numberOfWheatInGrid = 0;  // Current number of wheat

     numberOfWheatInGrid = 1;  // Number of wheat in 1st grid
     sum += numberOfWheatInGrid; 

     for (int i = 2; i <= grid; i ++) {
      numberOfWheatInGrid *= 2;   // Number of wheat x2
      sum += numberOfWheatInGrid;   // Cumulative number of wheat
     }

     return sum;

    }
}
