public String withoutX2(String str) {
  int len = str.length();
  
  if (len > 1) {
    String first = str.substring(0, 1);
    String second = str.substring(1, 2);
    
    if (len >= 2 && first.equals("x") && second.equals("x") ) {
      return str.substring(2);
    } 
    
    if (first.equals("x") ) {
      return second + str.substring(2);
    } else if (second.equals("x") ) {
      return first + str.substring(2);
    } else {
      return str;
    }
  }
  return "";
}

