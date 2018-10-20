public String lastTwo(String str) {
  int len = str.length();
  
  if (len >= 2) {
    String secondLast = str.substring(len-2, len-1);
    String last = str.substring(len-1, len);
    
    return str.substring(0, len-2) + last + secondLast;
  }
  return str;
}

