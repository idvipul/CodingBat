public String deFront(String str) {
  int len = str.length();
  
  if (len >= 2) {
  String first = str.substring(0, 1);
  String second = str.substring(1, 2);
  
  if (first.equals("a") && second.equals("b") ) {
    return "a" + "b" + str.substring(2);
  } 
  
  if (first.equals("a") ) {
    return first + str.substring(2);
  } else if (second.equals("b") ) {
    return second + str.substring(2);
  }
  return str.substring(2);
  }
  return "";
}

