
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String conc = baseValue.concat(valueToBeAdded);
        return conc;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        int i = 0;
        int len = valueToBeReversed.length();
        StringBuilder reverseStr = new StringBuilder(len);
        for (i = len-1; i>=0; i--)
        {
            reverseStr.append(valueToBeReversed.charAt(i));
        }
        return reverseStr.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int position;
        if (word.length() % 2 == 0)
        {
            position = word.length()/ 2-1;
        }
        else
        {
            position = word.length() / 2;
        }
        return word.charAt(position);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder str = new StringBuilder();
        int index = 0;
        for (int i = 0; i<value.length(); i++)
        {
            if (value.charAt(i) != charToRemove)
            {
                str.append(value.charAt(i));
            }
        }

        return str.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String arr[] = sentence.split(" ");
        return arr[(arr.length)-1];
    }
}
