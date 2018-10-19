public String extraEnd(String str) {
  int len = str.length();
  String end = str.substring(len - 2, len);
  return end + end + end;
}

