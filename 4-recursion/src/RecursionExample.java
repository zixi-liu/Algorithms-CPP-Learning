
import java.util.ArrayList;

public class RecursionExample {

  public static long[] rewards = {1, 2, 5, 10};  // 4 types of par value

  /**
    * @Description:  Find all the combinations of total rewards using recursion
    * @param totalReward, result
    * @return void
    */

    public static void get(long totalReward, ArrayList<Long> result) {

      // When totalReward = 0, result is valid.
      if (totalReward == 0) {
        System.out.println(result);
       return;
     }
      // When totalReward < 0, result is invalid. Don't output.
      else if (totalReward < 0) {
        return;
      } else {
        for (int i = 0; i < rewards.length; i++) {
          ArrayList<Long> newResult = (ArrayList<Long>)(result.clone());  
          newResult.add(rewards[i]);            
          get(totalReward - rewards[i], newResult);   
        }
      }

    }

}
