public boolean frontAgain(String str) {
  int len = str.length();
  
  if (len >= 2) {
    String front = str.substring(0, 2);
    String back = str.substring(len -2);
    
    if (front.equals(back) ) {
      return true;
    }
    return false;
  }
  return false;
}

