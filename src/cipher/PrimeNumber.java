/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.ArrayList;

/**
 *
 * @author Sithara wanigasooriy
 */
public class PrimeNumber {
//this class will use for calculate the prime numbers   
public ArrayList<Integer> primeSet = new ArrayList<Integer>();    
    
    
public void calcPrime(int number){
    boolean prime[] = new boolean[number+1];
    
    for(int i=0;i<number;i++) prime[i] = true;

    for(int p = 2; p*p <=number; p++){
        // If prime[p] is not changed, then it is a prime
        if(prime[p] == true){
        // Update all multiples of p
        for(int i = p*2; i <= number; i += p)
            prime[i] = false;
        }
    }

    // Print all prime numbers
    for(int i = 2; i <= number; i++){
        if(prime[i] == true){
          primeSet.add(i);  
        }
    }
}


}
