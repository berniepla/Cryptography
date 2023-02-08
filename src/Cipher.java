/**
 * Created by Bernardo Pla
 * Panther ID: 3885008
 * COP 3337
 * Assignment 2: Cryptography
 */

import java.util.StringTokenizer;
public abstract class Cipher {

    private String message;
    StringBuffer encrypted_message, decrypted_message;

    public Cipher(String text)
    {
        this.message = text; //constructor
    }

    public void encrypt()
    {
        //creates the encryption
        encrypted_message = new StringBuffer(); //initializes encryption
        StringTokenizer words = new StringTokenizer(message);

        //algorithm to create the encoded message
        while(words.hasMoreTokens())
        {
            String str = words.nextToken();
            str = encode(str) + " ";
            encrypted_message.append(str);

        } //end of algorithm
    }

    public void decrypt()
    {
        //creates the decryption of the message
        decrypted_message = new StringBuffer(); //initializes decryption
        StringTokenizer words = new StringTokenizer(message);

        //algorithm similar to encoded message but opposite for decoding
        while(words.hasMoreTokens())
        {
            String str = words.nextToken();
            str = decode(str) + " ";
            decrypted_message.append(str);

        }//end of algorithm

    }

    public String getEncodedMessage()
    {
        return encrypted_message.toString(); //accessor method to return the encrypted message
    }

    public String getDecodedMessage()
    {
        return message.toString(); //accessor method to return the decoded message
    }

    public abstract String encode(String str);
    public abstract String decode(String str);

} //end of class declaration
