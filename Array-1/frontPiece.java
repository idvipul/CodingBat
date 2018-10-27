public int[] frontPiece(int[] nums) {
  int length = nums.length;
  int[] newArr = new int[2];
  
  if (length > 2) {
    newArr[0] = nums[0];
    newArr[1] = nums[1];
  } else {
    newArr = nums;
  }
  return newArr;
}

