package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;

import static com.padmaja.stringreplace.EqualityMethod.stringCompare;
import static org.junit.Assert.assertEquals;

//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class EqualityMethodTest {

     @Test
     public  void  stringCompare1() {
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");

         // Comparing for String 1 < String 2
         System.out.println("Comparing " + string1 + " and " + string2
                 + " : " + stringCompare(string1, string2));

         // Comparing for String 3 = String 4
         System.out.println("Comparing " + string3 + " and " + string4
                 + " : " + stringCompare(string3, string4));

         // Comparing for String 1 > String 4
         System.out.println("Comparing " + string1 + " and " + string4
                 + " : " + stringCompare(string1, string4));

     }
 }




