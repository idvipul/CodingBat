public int close10(int a, int b) {
  
  int diff1 = Math.abs(10 - a);
  int diff2 = Math.abs(10 - b);
  
  if (diff1 == diff2 ) {
    return 0;
  }if (diff1 < diff2 ) {
    return a;
  } else {
    return b;
  }
}
