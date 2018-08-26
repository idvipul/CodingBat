public boolean startHi(String str) {

  if (str.length() < 2)
    return false;

  String front = str.substring(0, 2);
  
  if (front.equals("hi")) {
    return true;
  } 
  return false;
}