public String left2(String str) {
  if (str.length() >2) {
    String front = str.substring(0, 2);
    String back = str.substring(2);
    return back + front;
  }
  return str;
}

