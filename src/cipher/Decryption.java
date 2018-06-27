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
public class Decryption {
    
    public String decrptPrimePlaces(String string){
    //generate the prime number list that regarding to the string length
        PrimeNumber primeDecrypt = new PrimeNumber();
        char character1;
        StringBuilder newString = new StringBuilder(string);
        String newNewString;
        primeDecrypt.calcPrime(string.length());
        //System.out.println(primeDecrypt.primeSet);
        
        for (int j:primeDecrypt.primeSet){
            //change the characters which are stated in the prime palces
            char character = string.charAt(j);
            int ascii = (int) character;
            if (ascii!=126){
                //shift the character in 1 ascii value if not 126.Because it is the last visible charcter
                character1 = (char) (ascii-1);
                newString.setCharAt(j, character1);
                //System.out.println(character+"  "+ascii+"  "+ character1);
                //System.out.println(newString);
            }
            else {
                //if the character has 126 ascii value replace it with the ETX character
                character1 = (char) (126);
                newString.setCharAt(j, character1);
                //System.out.println(character+"  "+ascii+"  "+ character1);
                //System.out.println(newString);
            }
        }
         
        newNewString=newString.toString();
        //System.out.println(newNewString);
        return newNewString;
    }
    
    public String keyUsingDecrypt(int keyyy,String string){
        ArrayList<Character> keyDigits = new ArrayList();
        String keystring=keyyy+"";
        char character1 ;
        StringBuilder newString = new StringBuilder(string);
        for(int i = 0;i<(keystring).length();i++){
            keyDigits.add(keystring.charAt(i));
        }
        //System.out.println(keyDigits);
        for (int j=0;j<keyDigits.size();j++){  
            
            int x= Character.getNumericValue(keyDigits.get(j));
            //change the characters which are stated in the prime palces
            if (x<string.length()&& x!=0){
            char character = newString.charAt(x);
                int ascii = (int) character;
                if (ascii!=126){
                    //shift the character in 1 ascii value if not 126.Because it is the last visible charcter
                    character1 = (char) (ascii-1);
                    newString.replace(x,x+1, Character.toString( character1));
                    //System.out.println(character+"  "+ascii+"  "+ character1);
                    System.out.println(newString+"keyusing");
                    character1 = (char)(0);
                }
                else {
                    //if the character has 126 ascii value replace it with the ETX character
                    character1 = (char) (126);
                    newString.setCharAt(j, character1);
                    //System.out.println(character+"  "+ascii+"  "+ character1);
                    //System.out.println(newString);
                    character1 = (char)(0);
                }
            }
        }
        //System.out.println(newString.toString()); 
        return newString.toString();
    }
    
    public ArrayList<ArrayList<Character>> permutationOutsideBlockDecryption(String string){
        ArrayList<Character> temporary = new ArrayList();
        ArrayList<ArrayList<Character>> decryptingList = new ArrayList();
        ArrayList<ArrayList<Character>> decryptingListpermutated = new ArrayList();
        for(int i=1;i<string.length()+1;i++){
            System.out.println(string.charAt(i-1));
            temporary.add(string.charAt(i-1));
            if (i%5==0 && i!=0){
                //System.out.println("add");
                decryptingList.add(temporary);
                temporary = new ArrayList();
            }
        }
        System.out.println(decryptingList);
        
        if(decryptingList.size()%2==0){
            for(int i=0;i<decryptingList.size();i++){
                decryptingListpermutated.add(decryptingList.get(decryptingList.size()-1-i));
            }
        }
        else{
            for(int i=0;i<decryptingList.size();i++){
                decryptingListpermutated.add(decryptingList.get(decryptingList.size()-1-i));
            }
        }
        System.out.println(decryptingListpermutated);
        //permutationOutsideBlockDecryption(decryptingListpermutated);
        return decryptingListpermutated ;
            
        
    }
    public String permutationInsideBlockDecryption(ArrayList<ArrayList<Character>> decr){
        ArrayList<ArrayList<Character>> temporary = new ArrayList();
        ArrayList<Character> temporary1 = new ArrayList();
        ArrayList<Character> temporary2 = new ArrayList();
        for(int i=0;i<decr.size();i++){
           
            //Swaping 0->1,2->0,1->4,4->2
            temporary1.add(decr.get(i).get(1));
            temporary1.add(decr.get(i).get(4));
            temporary1.add(decr.get(i).get(0));
            temporary1.add(decr.get(i).get(3));
            temporary1.add(decr.get(i).get(2));
            //remove all the added char by default
            if (temporary1.contains((char)(1))&& temporary1.size()>1){
                for(int j=0;j<temporary1.size();j++){
                    if(temporary1.get(j)!=(char)(1)){
                        temporary2.add(temporary1.get(j));
                    }        
                }
                temporary.add(temporary2);
                temporary2 = new ArrayList();
            }
            else{
                temporary.add(temporary1);
                temporary1 = new ArrayList();
            }            
        }
        System.out.println(temporary);       
        String val=First.concatinateArray(temporary);
        System.out.println(val+"val");
        return val;
    }
    
    public String fixedTheBreakedString(String string){
        System.out.println(string);
        String output="";
        if ((string.length())%2!=0){
            //first half will be read end to home
            for(int i=(string.length())-1;i>(string.length()/2);i--){
                output+=string.charAt(i);
            }
            System.out.println(output);
            //first half of the string should go to the come to secon
            for(int i=0;i<=(string.length()/2);i++){
                
                output+=string.charAt(i);
            }
            System.out.println(output+"decr");
        }
        else{
            for(int i=(string.length())-1;i>(string.length()/2)-1;i=i-1){
                System.out.println(i+"i");
                System.out.println(string.length()/2+"lrn");
                output+=string.charAt(i);
            }
            System.out.println(output);
            //first half of the string should go to the come to secon
            for(int i=0;i<(string.length()/2);i++){
                
                output+=string.charAt(i);
            }
            System.out.println(output+"decr");
                
        }
        return output;
        }
         
       // }
        
    
}
 
    