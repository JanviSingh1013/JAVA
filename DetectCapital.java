class DetectCapital {

  public static void main(Stirng[] args){
      detectCapitalUse("FLAD");
  }

    public boolean detectCapitalUse(String word) {
        int capCount = 0;

        // USA
        // FlaG
        // FLAG

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                capCount++;
            }
        }

        if (capCount == 0) {
            return true;
        }

        if (capCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        if (capCount == word.length()) {
            return true;
        }

        return false;
    }
}
