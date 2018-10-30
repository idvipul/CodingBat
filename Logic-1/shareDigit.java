public boolean shareDigit(int a, int b) {
  int aMod = a % 10;
  int bMod = b % 10;
  int aDiv = a / 10;
  int bDiv = b / 10;
  
  if (aDiv == bDiv || aDiv == bMod || aMod == bDiv || aMod == bMod ) {
    return true;
  }
  return false;
}

