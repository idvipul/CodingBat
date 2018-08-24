public String frontBack(String str) {
  int len = str.length();
  String front, middle, back;
  
  if (len <= 1) {
    return str;
  }
  else if (len == 2) {
    front = str.substring(0,1);
    back = str.substring(1);
    
    return back+front;
  }
  
  front = str.substring(0,1);
  middle = str.substring(1, len-1);
  back = str.substring(len-1);
  
  return back+middle+front;
}