public String endUp(String str) {
  int len = str.length();
  String front, back;
  
  if (len <= 3) {
    return  str.toUpperCase();
  } else {
    front = str.substring(0, len - 3);
    back = str.substring(len -3, len);
    return front + back.toUpperCase();
  }
}
