public int loneSum(int a, int b, int c) {
  int sum = 0;
  
  if (a == b) {
    sum = c;
  } else if (b == c) {
      return a;
  } else if (a == c ) {
      return b;
  } else if (a != b && b != c) {
      sum = a + b + c;
  }  
  if (a == b && a == c) {
      sum = 0;
  }
  return sum;
}
