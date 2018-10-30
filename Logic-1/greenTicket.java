public int greenTicket(int a, int b, int c) {
  if (a == b && b == c && c == a) 
    return 20;
   if ( a == b || a == c || c == b)  
    return 10;
  return 0;
}

