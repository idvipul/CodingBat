public String withoutX(String str) {
  int len = str.length();
  
  if (len > 1) {
    String front = str.substring(0, 1);
    String back = str.substring(len - 1);
    
  if (front.equals("x") && back.equals("x") ) {
    return str.substring(1, len - 1);
  } 
  
  if (front.equals("x") ) {
    return str.substring(1);
  } else if (back.equals("x") ) {
    return str.substring(0, len - 1);
  }
  return str;
  }
  return "";
}

