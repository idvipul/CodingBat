public boolean hasBad(String str) {
  String first = "bad";
  
    if(str.length() == 3 && str.substring(0, 3).equals(first))
    return true;

  if (str.length() >= 4) {
    if (str.substring(0, 3).equals(first) || str.substring(1, 4).equals(first) ) {
    return true;
    } else 
    return false;
    }
    return false;
}
