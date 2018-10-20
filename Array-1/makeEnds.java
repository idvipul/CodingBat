public int[] makeEnds(int[] nums) {
  int[] newArray = new int[2];
  
    newArray[0] = nums[0];
    newArray[1] = nums[nums.length-1];
    
    return newArray;
}

