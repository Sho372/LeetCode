package Array;

public class ShortestUnsortedContinuousSubarray_581 {

    // 120/307
    public int findUnsortedSubarray(int[] nums) {

        int left = 0;
        int right = 0;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] <= nums[i+1]) {
                left++;
            } else {
                break;
            }
        }

        for(int i = nums.length-1; i > 0 ; i--) {
            if(nums[i-1] <= nums[i]) {
                right++;
            } else {
                break;
            }
        }


        // System.out.println(left);
        // System.out.println(right);
        return nums.length == left + 1 ? 0 : nums.length - right - left;
    }

    // 117/307
    public int findUnsortedSubarray2(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                start = i + 1;
            } else if(nums[i] == nums[i+1]) {
                start = start;
            } else {
                break;
            }
        }

        for(int i = nums.length-1; i > 0 ; i--) {
            if(nums[i-1] < nums[i]) {
                end = i - 1;
            } else if(nums[i-1] == nums[i]) {
                end = end;
            }
            else {
                break;
            }
        }


        // System.out.println(left);
        // System.out.println(right);

        if (end - start + 1 < 0) return 0;
        if (end - start + 1 == nums.length && nums[start] <= nums[end]) return 0;
        if (end - start + 1 == nums.length && nums[start] > nums[end]) return nums.length;
        return end - start + 1;
    }

    // Accepted
    public int findUnsortedSubarray3(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        //Step.1 find out start position of unsorted candidate.
        for(start = 0; start < nums.length -1 ; start++) {
            if(nums[start] > nums[start+1]) {
                break;
            }
        }

        //If start is nums.length -1, the array has already sorted.
        if(start == nums.length -1) return 0;

        //Step.1 find out end position of unsorted candidate.
        for(end = nums.length-1; end > 0 ; end--) {
            if(nums[end-1] > nums[end]) {
                break;
            }
        }

        //Step.2 find out the max and min within unsorted array
        int min = nums[start];
        int max = nums[end];
        for(int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        //Step.3 check if the min is larger than left side elements.
        for(int i = 0; i < start; i++) {
            if(nums[i] > min) start = i;
        }
        //Step.3 check if the max is smaller than right side elements.
        for(int i = end + 1; i < nums.length; i++) {
            if(nums[i] < max) end = i;
        }

        return end - start + 1;
    }
}
