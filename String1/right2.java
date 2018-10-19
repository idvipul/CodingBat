public String right2(String str) {
  int len = str.length();
  
  if (len > 2) {
    return str.substring(len-2) + str.substring(0, len -2);
  }
  return str;
}

