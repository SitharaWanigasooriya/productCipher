/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 *
 * @author Sithara wanigasooriy
 */
public class CharacterClass {
    Map<String, Integer> evenAlphebat = new HashMap<String, Integer>();
    Map<String, Integer> oddAlphebat = new HashMap<String, Integer>();
    
    private void setEvenAlphabet(){
    evenAlphebat.put(" ",1);evenAlphebat.put("!",1);evenAlphebat.put("\"",1);evenAlphebat.put("#",1);evenAlphebat.put("$",1);
    evenAlphebat.put("%",1);evenAlphebat.put("&",1);evenAlphebat.put("'",1);evenAlphebat.put("(",1);evenAlphebat.put(")",1);
    evenAlphebat.put("*",1);evenAlphebat.put("+",1);evenAlphebat.put("`",1);evenAlphebat.put("-",1);evenAlphebat.put(".",1);
    evenAlphebat.put("/",1);evenAlphebat.put("0",1);evenAlphebat.put("1",1);evenAlphebat.put("2",1);evenAlphebat.put("3",1);
    evenAlphebat.put("4",1);evenAlphebat.put("5",1);evenAlphebat.put("6",1);evenAlphebat.put("7",1);evenAlphebat.put("8",1);
    evenAlphebat.put("9",1);evenAlphebat.put(":",1);evenAlphebat.put(";",1);evenAlphebat.put("<",1);evenAlphebat.put("=",1);
    evenAlphebat.put(">",1);evenAlphebat.put("?",1);evenAlphebat.put("@",1);evenAlphebat.put("A",1);evenAlphebat.put("B",1);
    evenAlphebat.put("C",1);evenAlphebat.put("D",1);evenAlphebat.put("E",1);evenAlphebat.put("F",1);evenAlphebat.put("G",1);
    evenAlphebat.put("H",1);evenAlphebat.put("I",1);evenAlphebat.put("J",1);evenAlphebat.put("K",1);evenAlphebat.put("L",1);
    evenAlphebat.put("M",1);evenAlphebat.put("N",1);evenAlphebat.put("O",1);evenAlphebat.put("P",1);evenAlphebat.put("Q",1);
    evenAlphebat.put("R",1);evenAlphebat.put("S",1);evenAlphebat.put("T",1);evenAlphebat.put("U",1);evenAlphebat.put("V",1);
    evenAlphebat.put("W",1);evenAlphebat.put("X",1);evenAlphebat.put("Y",1);evenAlphebat.put("Z",1);evenAlphebat.put("[",1);
    evenAlphebat.put("\\",1);evenAlphebat.put("]",1);evenAlphebat.put("^",1);evenAlphebat.put("_",1);evenAlphebat.put("",1);
    evenAlphebat.put("a",1);evenAlphebat.put("b",1);evenAlphebat.put("c",1);evenAlphebat.put("d",1);evenAlphebat.put("e",1);
    evenAlphebat.put("f",1);evenAlphebat.put("g",1);evenAlphebat.put("h",1);evenAlphebat.put("i",1);evenAlphebat.put("j",1);
    evenAlphebat.put("k",1);evenAlphebat.put("l",1);evenAlphebat.put("m",1);evenAlphebat.put("n",1);evenAlphebat.put("o",1);
    evenAlphebat.put("p",1);evenAlphebat.put("q",1);evenAlphebat.put("r",1);evenAlphebat.put("s",1);evenAlphebat.put("t",1);
    evenAlphebat.put("u",1);evenAlphebat.put("v",1);evenAlphebat.put("w",1);evenAlphebat.put("x",1);evenAlphebat.put("y",1);
    evenAlphebat.put("z",1);evenAlphebat.put("{",1);evenAlphebat.put("|",1);evenAlphebat.put("}",1);evenAlphebat.put("~",1);
    evenAlphebat.put("  ",1);//tab    
    }
    
    private void setOddAlphebat(){
    }
    
    //String value = dictionary.get("key");
    
    
}
