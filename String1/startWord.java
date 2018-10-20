public String startWord(String str, String word) {
  int wordLength = word.length();
  int strLength = str.length();
  
  if (strLength >= 1 && wordLength <= strLength ) {
      String first = str.substring(0, 1);
      String allCorrect = str.substring(0, wordLength);
      String firstIncorrect = str.substring(1, wordLength);
      String wordIncorrect = word.substring(1);
      
      if (allCorrect.equals(word) ) {
        return word;
      }
      if (firstIncorrect.equals(wordIncorrect) ) {
        return first + firstIncorrect;
      }
      return "";
  }
  return "";
}

