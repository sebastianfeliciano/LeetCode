/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n <= 1) {
          return n;  
        } else {
            return n-1;  
        }
        
    }
}