/**
 * Created by Bernardo Pla
 * Panther ID: 3885008
 * COP 3337
 * Assignment 2: Cryptography
 */


public class Caeser extends Cipher
{
    public Caeser (String str)
    {
        super(str); //constructor for Caeser class
    }

    public String encode(String word)
    {
        return code(word, Constants.ENCODE_SHIFT);
    }

    public String decode(String word)
    {
        return code(word, Constants.DECODE_SHIFT);
    }

    String code(String word, int SHIFT)
    {
      StringBuffer result = new StringBuffer();

        for(int i = 0; i < word.length(); i++)
        {
            char chr = word.charAt(i);
            chr = determineCharacter(chr, SHIFT);
            result.append(chr);
        }
        return result.toString(); //formula for the Caeser code
    }

    public char determineCharacter(char chr, final int shift)
    {
        if(Character.isUpperCase(chr))
            chr = (char)('A' + (chr - 'A' + shift) % Constants.WRAP_AROUND);
        if (Character.isLowerCase(chr))
                chr = (char)('a' + (chr - 'a' + shift) % Constants.WRAP_AROUND);

        return chr;
    }
}
