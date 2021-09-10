/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waytoolongwords;

import java.util.Scanner;

/**
 *
 * @author S2D_9
 */
public class WayTooLongWords {

       public static void main(String[] args) {
        
    
    
    Scanner sc = new Scanner(System.in);
    
    int words_number = sc.nextInt();
    String [] words = new String[words_number];
    
    for(int i = 0 ; i < words.length ; i++)
    {
        words[i] = sc.next();
        if( words[i].length() > 10)
        {
            System.out.println(words[i].charAt(0) +""+ (words[i].length()-2) +""+words[i].charAt(words[i].length()-1) );
        }
        else
        {
            System.out.println(words[i]);
        }
    }
}
    
}
