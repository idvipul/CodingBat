public String front22(String str) {
  int len = str.length();
  String str1;
  
  if (len < 1) {
    return str;
  } else if (len == 1) {
    return str + str + str;
  } else {
    str1 = str.substring(0, 2);
    return str1 + str + str1;
  }
}
