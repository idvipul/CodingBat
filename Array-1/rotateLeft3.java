public int[] rotateLeft3(int[] nums) {
  int[] rotatedArray = new int[3];
  
  for (int i = 0; i < nums.length-1; i++) {
    rotatedArray[i] = nums[i+1];
  }
  rotatedArray[nums.length-1] = nums[0];
  return rotatedArray;
}

