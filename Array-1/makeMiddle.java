public int[] makeMiddle(int[] nums) {
  int[] midArray = new int[2];
  
  if (nums.length > 2) {
    for (int i = 0; i < nums.length; i++) {
      int mid = nums.length/2;
      midArray[0] = nums[mid-1];
      midArray[1] = nums[mid];
    }
  }else{
    midArray = nums;
  }
  return midArray;
}

