public int[] maxEnd3(int[] nums) {
  int[] maxEnd = new int[3];
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[0] > nums[2]) {
      maxEnd[i] = nums[0];
    } else {
      maxEnd[i] = nums[2];
    }
  }
  return maxEnd;
}

