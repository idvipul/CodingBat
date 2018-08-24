public String everyNth(String str, int n) {
  int len = str.length();
  String newString = "";

  for (int i = 0; i < len; i = i + n) {
    newString = newString  + str.charAt(i);
  }

  return newString;
}