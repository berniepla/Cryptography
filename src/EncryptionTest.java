/**
 * Created by Bernardo Pla
 * Panther ID: 3885008
 * COP 3337
 * Assignment 2: Cryptography
 */

import javax.swing.JOptionPane;
public class EncryptionTest
{
    public static void main(String args[])
    {
        String code, output = "";

        String text = JOptionPane.showInputDialog("Enter message");

        output += "The original message says \n" + text + "\n";

        Cipher superCode = new Caeser(text);

        superCode.encrypt();

        code = superCode.getEncodedMessage();

        output += "\nCeasar Cipher\nThe encrypted message says \n" + code + "\n";

        superCode.decrypt();

        code = superCode.getDecodedMessage();

        output +="The decrypted message says \n" + code + "\n";

        superCode = new Transpose(text);

        superCode.encrypt();

        code = superCode.getEncodedMessage();

        output += "\nTranspose\nThe encrypted Transpose message says \n" + code + "\n";

        superCode.decode(text);

        code = superCode.getDecodedMessage();

        output +="The decripted Transpose message says \n" + code + "\n";

        Reverser r = new Reverser(text);

        r.encrypt();

        code = superCode.getEncodedMessage();

        code = r.reverseText(code);

        output += "\nReverser\nThe encrypted Reverse message says \n" + code + "\n";

        code = r.getDecodedMessage();

        output+="The decrypted Reverse message says \n" + code;

        display(output);
    }
    static void display(String str)
    {
        JOptionPane.showMessageDialog(null, str, "Encrypt/decrypt",
                JOptionPane.INFORMATION_MESSAGE);
    }
} //end of test class declaration