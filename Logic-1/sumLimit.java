public int sumLimit(int a, int b) {
  int sum = a + b;
  int sumLen = String.valueOf(sum).length();
  int aLen = String.valueOf(a).length();
  
  if (sumLen > aLen )
    return a;
  else 
    return sum;
}

