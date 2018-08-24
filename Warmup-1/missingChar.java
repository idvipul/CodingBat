public String missingChar(String str, int n) {
  StringBuilder sb = new StringBuilder(str);
  
  sb.deleteCharAt(n);
  String resultString = sb.toString();
  
  return resultString;
}
