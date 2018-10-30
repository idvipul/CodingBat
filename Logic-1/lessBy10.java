public boolean lessBy10(int a, int b, int c) {
  int ab = Math.abs(a - b);
  int bc = Math.abs(b - c);
  int ac = Math.abs(a - c);
  
  if (ab >= 10 || bc >= 10 || ac >= 10) {
    return true;
  }
  return false;
}

