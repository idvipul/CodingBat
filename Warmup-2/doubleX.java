boolean doubleX(String str) {
  int i = str.indexOf("x");
  
  if (i+1 >= str.length()) return false; // check i+1 in bounds
  
  for (int j = 0; j < str.length()-1; j++ ) {
    if (str.substring(i+1, i+2).equals("x") ) {
      return true;
    }
  }
  return false;
}
