import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
        }

        int majorityCount = 1;  // Stores the highest count found         
        int majorityElement = 0;  // Stores the element with the highest count   
        
        // Find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {             
            if (entry.getValue() != null) {  // Safeguard for potential nulls
                int value = entry.getValue();             
                if (value > majorityCount) {                 
                    majorityCount = value;  // Update majority count                 
                    majorityElement = entry.getKey();  // Update the majority element             
                } 
            }
        }         
        return majorityElement;     
    } 
}


//         int majorityElement = 0;         
//         int number = 0;          
        
//         // Find the majority element
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {             
//             int value = entry.getValue();             
//             if(value > majorityElement){                 
//                 majorityElement = value;  // Update majority count                 
//                 number = entry.getKey();  // Update the majority element             
//             }         
//         }         
//         return number;   
//     }
// }