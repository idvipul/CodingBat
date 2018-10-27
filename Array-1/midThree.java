public int[] midThree(int[] nums) {
  int[] midArray = new int[3];
  
  if (nums.length > 3) {
    int mid = nums.length/2;
    midArray[0] = nums[mid-1];
    midArray[1] = nums[mid];
    midArray[2] = nums[mid+1];
  } else {
    midArray = nums;
  }
  return midArray;
}

