/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import GUI.First;
import java.util.ArrayList;

/**
 *
 * @author Sithara wanigasooriy
 */
public class Encryption {
    ArrayList<ArrayList<Character>> collection = new ArrayList();//Collection of small blocks
    private char characterTemp;
    
    //this method is use to convert prime places in to another character
    public String primePlacesEncrypt(String string){
        //generate the prime number list that regarding to the string length
        PrimeNumber primeNu = new PrimeNumber();
        char character1;
        StringBuilder newString = new StringBuilder(string);
        String newNewString;
        primeNu.calcPrime(string.length());
        System.out.println(primeNu.primeSet+"prime set");
        
        for (int j:primeNu.primeSet){
            //change the characters which are stated in the prime palces
            char character = string.charAt(j);
            int ascii = (int) character;
            if (ascii!=126){
                //shift the character in 1 ascii value if not 126.Because it is the last visible charcter
                character1 = (char) (ascii+1);
                newString.setCharAt(j, character1);
                System.out.println(character+"  "+ascii+"  "+ character1);
                //System.out.println(newString);
                character1 = (char)(0);
            }
            else {
                //if the character has 126 ascii value replace it with the ETX character
                character1 = (char) (3);
                newString.setCharAt(j, character1);
                System.out.println(character+"  "+ascii+"  "+ character1+"Special");
                //System.out.println(newString);
                character1 = (char)(0);
            }
        }
        newNewString=newString.toString();
        System.out.println(newNewString); 
        return newNewString;
        }
    public String encryptUsingKey(int keyyy,String string){
        //System.out.println(string+"begin9");
        ArrayList<Character> keyDigits = new ArrayList();
        String keystring=String.valueOf(keyyy);
        char character1 ;
        StringBuilder newString = new StringBuilder(string);
        System.out.println(newString+"===builder");
        System.out.println(keystring);
        for(int i = 0;i<(keystring).length();i++){
            System.out.println(keystring.charAt(i)+" in keyUsing Encrypt");
            keyDigits.add(keystring.charAt(i));
        }
        System.out.println(keyDigits+"Digits");
        for (int j=0;j<keyDigits.size();j++){
        
            System.out.print("in");
            int x= Character.getNumericValue(keyDigits.get(j));
            System.out.println(x+" te");
            
            //change the characters which are stated in the keyvalue palces
            if (x<string.length()&& x!=0){
                System.out.println(x+" 44");
                char character = newString.charAt(x);
                System.out.println(character+"char");
                int asciii = (int) character;
                if (asciii!=126){
                    //shift the character in 1 ascii value if not 126.Because it is the last visible charcter
                    character1 = (char) (asciii+1);
                    System.out.println(character1+"  ------char1");
                    newString.replace(x,x+1, Character.toString( character1));
                    System.out.println(newString+"  ------strng");
                    //System.out.println(character+"  "+ascii+"  "+ character1);
                    //System.out.println(newString);
                    character1 = (char)(0);
                }
                else {
                    //if the character has 126 ascii value replace it with the ETX character
                    character1 = (char) (3);
                    newString.replace(j,j+1, Character.toString( character1));
                    //System.out.println(character+"  "+ascii+"  "+ character1);
                    //System.out.println(newString);
                    character1 = (char)(0);
                }
            }
            System.out.println(newString.toString()+"keyusing6");
        }
        
        //System.out.println(newString.toString()); 
        return newString.toString();
    
    }
    
    
    public String breakTheStringEncryption(String string){
        String output="";
        //if ((string.length())%2==0){
            //second half of the string will come to first
            for(int i=string.length()/2;i<string.length();i++){
                System.out.println(string.charAt(i)+"ssss");
                System.out.println(string.length()+" lenth");
                output+=string.charAt(i);
            }
            //first half will be read end to home
            for(int i=(string.length()/2)-1;i>=0;i--){
                output+=string.charAt(i);
            }
            System.out.println(output+"out");
        return output; 
            
        //}
        /*else{
            for(int i=string.length()+1/2;i<string.length();i++){
                output+=string.charAt(i);
            }
            //first half will be read end to home
            for(int i=(string.length()+1/2)-1;i>=0;i--){
                output+=string.charAt(i);       
            }
        return output;
        }*/
        
    }
    
    
    public ArrayList<ArrayList<Character>> permutationWithinBlocksEncryption(String string){
        ArrayList<Character> temporary = new ArrayList();
        ArrayList<Character> temporary1 = new ArrayList();
        for(int i=1;i<string.length()+1;i++){
            temporary.add(string.charAt(i-1));
            if (i%5==0 && i!=0){   
                System.out.println(temporary+"tempary");
                
                //Swaping 0->1,2->0,1->4,4->2
                temporary1.add(temporary.get(2));
                temporary1.add(temporary.get(0));
                temporary1.add(temporary.get(4));
                temporary1.add(temporary.get(3));
                temporary1.add(temporary.get(1));
                
                //add blocks which has 5 block size are added
                
                collection.add(temporary1);
                temporary1 = new ArrayList();
                temporary = new ArrayList();                
            }            
        }
        System.out.println(temporary+"temp");
        if (temporary.size()<5 && temporary.size()!=0){
            for(int i=temporary.size();i<5;i++){
                //add null char for the vacant blocks
                temporary.add((char) (1));             
            }
            //Swaping 0->1,2->0,1->4,4->2
            temporary1.add(temporary.get(2));
            temporary1.add(temporary.get(0));
            temporary1.add(temporary.get(4));
            temporary1.add(temporary.get(3));
            temporary1.add(temporary.get(1));
            //add blocks which has 5 block size are added
            
            collection.add(temporary1);            
        }
        System.out.println(collection+"Aaaa");     
        return collection;
    }
    
    public ArrayList<ArrayList<Character>> permutationOutsideBlockEncryption(ArrayList<ArrayList<Character>> setOfBlocks){
        ArrayList<ArrayList<Character>> tempary = new ArrayList();
        if(setOfBlocks.size()%2==0){
            //swap last one and first one
            for(int i=0;i<setOfBlocks.size();i++){
                tempary.add(setOfBlocks.get(setOfBlocks.size()-1-i));
            }
            System.out.println(tempary);
            return tempary;
        }
        else{
            for(int i=0;i<setOfBlocks.size();i++){
                tempary.add(setOfBlocks.get(setOfBlocks.size()-1-i));
            }
            return tempary;
        }
    }
    
    
    
    
}
