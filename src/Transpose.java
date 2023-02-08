/**
 * Created by Bernardo Pla
 * Panther ID: 3885008
 * COP 3337
 * Assignment 2: Cryptography
 */

public class Transpose extends Cipher
{
    Transpose(String str)
    {
        super(str);
    }
    public String encode(String word)
    {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
    public String decode(String word)
    {
        //takes result and reverses it to get original word
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();

    }
} //end of class declaration
