public String frontTimes(String str, int n) {
  String result = "";
  
    if ( str.length() <=3 ) {
    for (int i = 0; i < n; i++) {
      result = result + str.substring(0);
    }
  } else {
    for (int i = 0; i < n; i++) {
      result = result + str.substring(0, 3);
    }
  }
  
  return result;
}
