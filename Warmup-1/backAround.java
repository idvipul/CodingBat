public String backAround(String str) {
 String back, middle;
 int len = str.length();
 
 if (len == 0) {
   return str;
 } else {
   back = str.substring(len - 1);
   middle = str.substring(0, len);
   
   return back + middle + back;
 }
 
}
