// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925
// Resources: Based on code example 8.1 from Data Structures & Algorithms in Java

import java.io.*;
/**
 * This class manages the data of the created Tree
 * @author mtwheeler
 */
public class TreeApp 
{
    public static void main(String[] args) throws IOException
    {
        int value;
        String toPass = "ABCDE";
        Tree theTree = new Tree(toPass);
        
        while(true)
        {
            System.out.print("Menu:\nPlease select by typing 's' for show or "
                    + "'t' for traverse: ");
            int choice = getChar();
            switch(choice)
            {
                case 's':
                    theTree.displayTree();
                    break;
                case 't':
                    System.out.print("Enter type 1, 2, or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.print("Invalid Entry\n");
            }
        }
    }
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static int getChar() throws IOException
    {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
}
