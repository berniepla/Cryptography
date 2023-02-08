/**
 * Created by Bernardo Pla
 * Panther ID: 3885008
 * COP 3337
 * Assignment 2: Cryptography
 */

public class Reverser extends Transpose
{
    public Reverser(String str)
    {
        super(str); //constructor
    }
    public String reverseText(String word)
    {
        StringBuffer result = new StringBuffer(word); //returns the message in reverse
        result.reverse().toString();
        return result.toString();

    }
    public String decode(String word)
    {
        StringBuffer result  = new StringBuffer(word); // returns message to original state
        result.reverse().reverse().toString();
        return result.toString();
    }
} //end of class declaration
