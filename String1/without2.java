public String without2(String str) {
  int len = str.length();
  
  if (len < 2) {
    return str;
  }
  String front = str.substring(0, 2);
  String back = str.substring(len-2);

  if (front.equals(back) ) {
    return str.substring(2);
  }
  return str;
}

