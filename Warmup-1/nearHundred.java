public boolean nearHundred(int n) {
  // n = Math.abs(n);
  
  if ( (n >= (100 * 0.9) && n <= 100) || (n >= (200 * 0.95) && n <= 200) ) {
    return true;
  }
    if ( (n <= (100 * 1.1) && n > 100 ) || (n <= (200 * 1.05) && n > 200) ) {
    return true;
  }
  
  return false;
}
