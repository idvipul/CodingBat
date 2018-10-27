public int[] front11(int[] a, int[] b) {
  int[] frontArray;
  
  if (a.length == 0 && b.length >= 1) {
    frontArray= new int[1];
    frontArray[0] = b[0];    
  } else if (b.length == 0 && a.length >= 1) {
    frontArray= new int[1];
    frontArray[0] = a[0];
  } else if (a.length == 0 && b.length == 0) {
    frontArray= new int[0];
  } else {
    frontArray= new int[2];
    frontArray[0] = a[0];
    frontArray[1] = b[0];
  }
  return frontArray;
}

