/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kripto;

/**
 *
 * @author mbah
 */
public class algoritma {
    public static char[] myList = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private int key;
    private char[] plaintext;
    private char[] chipertext;
        
    public void setKey(int key) {
        this.key = key;
    }

    public void setPlaintext(char[] plaintext) {
        this.plaintext = plaintext;
    }    
    
    public char[] getchipertext(){
        char[] chipertext = new char[plaintext.length];
        int[] pt = new int[plaintext.length];
        int k = 0;
        
        for(int x = 0; x < plaintext.length; x++){
            for(int y = 0; y < myList.length; y++){
                if(plaintext[x] == myList[y]){
                    pt[k] = y;
                    break;
                }       
            }            
            chipertext[x] = myList[(pt[k] + key) % 26];
            k++;
        }
        
        return chipertext;
    }
}
