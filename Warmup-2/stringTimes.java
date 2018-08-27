public String stringTimes(String str, int n) {
  String result = "";

  if (str.length() >= 0 ) {
    for (int i = 1; i <= n; i++) {
      result = result + str;
    }
  }
  return result;
}
