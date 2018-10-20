public int[] reverse3(int[] nums) {
  int[] reversedArray = new int[3];
  
  for (int i = nums.length-1, j = 0; i >= 0; i--, j++) {
    reversedArray[j] = nums[i];
  }
  return reversedArray;
}
