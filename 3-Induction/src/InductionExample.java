class Result {
 public long wheatNum = 0;  // Current number of wheats
 public long wheatTotalNum = 0;  // Current total number of wheats
}

public class InductionExample {

 /**
    * @Description: Mathematical induction proof with iterations.
    * @param k-# of grid，result-saving current number of wheats and total number of wheats.
    * @return boolean-T or F when at kth grid.
    */

    public static boolean prove(int k, Result result) {

     // n = 1
     if (k == 1) {
      if ((Math.pow(2, 1) - 1) == 1) {
       result.wheatNum = 1;
       result.wheatTotalNum = 1;
       return true;
      } else return false;
     }
     // if n = (k-1) -> n = k
     else {

      boolean proveOfPreviousOne = prove(k - 1, result);
      result.wheatNum *= 2;
      result.wheatTotalNum += result.wheatNum;
      boolean proveOfCurrentOne = false;
      if (result.wheatTotalNum == (Math.pow(2, k) - 1)) proveOfCurrentOne = true;

      if (proveOfPreviousOne && proveOfCurrentOne) return true;
      else return false;

     }

    }

}
