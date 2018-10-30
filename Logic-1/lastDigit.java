public boolean lastDigit(int a, int b, int c) {
  int aMod = a % 10;
  int bMod = b % 10;
  int cMod = c % 10;
  
  if (aMod == bMod || bMod == cMod || aMod == cMod) {
    return true;
  }
  return false;
}

