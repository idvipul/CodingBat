public String minCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen > bLen) {
    int aCount = aLen - bLen;
    return a.substring(aCount) + b;
  } else if (bLen > aLen) {
    int bCount = bLen - aLen;
    return a + b.substring(bCount);
  } 
  return "";
}

