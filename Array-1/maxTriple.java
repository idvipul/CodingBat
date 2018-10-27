public int maxTriple(int[] nums) {
  
  int length = nums.length;
  int mid = nums.length/2;
  
  if (nums[0] > nums[length-1] && nums[0] > nums[mid]) 
    return nums[0];
  else if (nums[length-1] > nums[0] && nums[length-1] > nums[mid]) 
    return nums[length-1];
  else 
  return nums[mid];
}

