public String atFirst(String str) {
  int len = str.length();

 if (len >= 2) {
   return str.substring(0, 2);
 } else if (len == 1) {
   return str + "@";
 }
 return "@@";
}


