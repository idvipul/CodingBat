public int diff21(int n) {
  int diff = 0;
  
  if (n > 21) {
    diff = (n - 21) * 2;
  } else {
    diff = 21 - n;
  }
  return diff;
}
