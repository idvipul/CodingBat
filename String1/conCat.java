public String conCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen == 0) {
    return b;
  }
  if (bLen == 0) {
    return a;
  }
  
  if (a.charAt(aLen-1) == b.charAt(0) ) {
    return a.substring(0, aLen) + b.substring(1);
  } else {
    return a + b;
  }
}

