public String delDel(String str) {
  
  if (str.length() <=3 ) {
    return str;
  }
  
  String del = str.substring(1, 4);
  String front = str.substring(0, 1);
  String back = str.substring(4); 
  
  if ( str.length() >= 4 && del.equals("del") ) {
    return front + back;
  } 
  return str;
}
