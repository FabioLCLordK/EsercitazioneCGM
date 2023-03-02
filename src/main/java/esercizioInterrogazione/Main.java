package esercizioInterrogazione;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    
    public static int countMatches(String text, String str){
        //Spezza la stringa e la conta
       return text.split(str,-1).length-1;
    }
    public static String reverse(String sentence) {
          if (sentence.isEmpty())
            return sentence;

          return reverse(sentence.substring(1)) + sentence.charAt(0);
        }
    
    public static void proxEx(int cE){
        System.out.println("");
        String TITOLO="\n~~~~~~~~~~~~~ESERCIZIO "+cE+"~~~~~~~~~~~\n";
        System.out.println(TITOLO);
    }
    
    public static void main(String[] args) {
       int cE=1;
       
        
       //N° 1
        proxEx(cE); cE+=1;
      
       char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
        
        
        // s.matches("^[a-zA-Z]*$");
        
        //N° 2
        proxEx(cE); cE+=1;
        
        //in java i caratteri possono essere incrementati come i numeri
        for (char a='A'; a<='Z';a++){
            System.out.print(a );
        }
        System.out.println(" ");
        
        //N° 3
        proxEx(cE); cE+=1;
        String style = "Bold";
        String style2 = "Bold";
        
        if (style2.equals(style)){
          System.out.println("Sono uguali");
        }else{
           System.out.println("Non sono uguali");
        }
        
        
        //N° 4
        proxEx(cE); cE+=1;
        String line = "This website is aw3som3.";
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;
      
            line = line.toLowerCase();
            for (int i = 0; i < line.length(); ++i) {
              char ch = line.charAt(i);

              // check if character is any of a, e, i, o, u
              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
              }

              // check if character is in between a to z
              else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
              }

              // check if character is in between 0 to 9
              else if (ch >= '0' && ch <= '9') {
                ++digits;
              }

              // check if character is a white space
              else if (ch == ' ') {
                ++spaces;
              }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("White spaces: " + spaces);
            
        //N°5
        proxEx(cE); cE+=1;
        String text = "AABCCAAADCBBAADBBC";
        String str = "AA";

        int count = countMatches(text, str);
        System.out.println(count);

        //N°6
        proxEx(cE); cE+=1;

        String sentence = "Go work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
     

        


        //N°7
        proxEx(cE); cE+=1;
        
        int count2 = 0, num2 = 3452;
        System.out.println(contami(num2));
        
        //N°8
        proxEx(cE); cE+=1;  

        int num3= 60;
        for(int i=1; i<=num3; i++){
        if((num3 % i)==0) {
          System.out.println(i + " ");
        }
        }
        
        //N°9
        proxEx(cE); cE+=1; 
        
        int n1 = 81, n2 = 153, gcd = 1;

        for(int i=1; i<=n1; i++){
            if(((n2 % i)==0) && ((n1 % i)==0)) {
                   gcd=i;
               }
        }
        System.out.println("Il GCD è: "+gcd);
        
        //caso particolare
//        while(n1 != n2)
//        {
//            if(n1 > n2)
//                n1 -= n2;
//            else
//                n2 -= n1;
//        }
//
//        System.out.println("G.C.D = " + n1);
        


        //N°10
        
        proxEx(cE); cE+=1; 
        
         n1 = 72;
         n2 = 120;
  
      for(int i = 1; i <= n1 && i <= n2; ++i) {
        // Checks if i is factor of both integers
        if(n1 % i == 0 && n2 % i == 0)
          gcd = i;
      }
        System.out.println(gcd);
        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        
        // IL MINIMO COMUNE MULTIPLO è IL PRODOTTO DEI DUE NUMERI DIVISO
        // IL MASSIMO COMUNE DIVISORE

        //N°11
        
        proxEx(cE); cE+=1;
        
        int num = 127, reversedInteger = 0, remainder, originalInteger;
        int originallInteger=num;
             while(num!=0){
               remainder=num%10;
               reversedInteger=reversedInteger*10+remainder;
               num=num/10;
             }
            System.out.println(reversedInteger);
        if(originallInteger==reversedInteger){
            System.out.println("è palindromo");
        }else{
            System.out.println("non è palindromo");
        }
        
        
        //N°12
        
        proxEx(cE); cE+=1;
        
        num = 17;

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        
        System.out.println(num + " is " + evenOdd);
        
        num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
        }

        if (!flag)
          System.out.println(num + " is a prime number.");
        else
          System.out.println(num + " is not a prime number.");
      
         //N°13
        
        proxEx(cE); cE+=1;
        
        int low = 1, high = 50;

        ArrayList<Integer> aList = new ArrayList<Integer>();
        
        while (low < high) {
            boolean flag1 = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag1 = true;
                    break;
                }
            }

            if (!flag1 && low != 0 && low != 1){
                System.out.print(low + " ");
            } else {
                aList.add(low);
            }
            ++low;
        }
        Iterator<Integer> iterator = aList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
      
        
         //N°14
        
        proxEx(cE); cE+=1;
        
        /*

        A positive integer is called an Armstrong number of order n if

        abcd... = a^n + b^n + c^n + d^n + ...

        In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

        153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.

        */
        
        int number = 153, originalNumber, temp, result = 0, n = 0;

        originalNumber = number;
        //conto le cifre
        for (;originalNumber != 0; originalNumber /= 10, ++n);
        System.out.println("We have " +n + " digits");
        
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10){
            temp = originalNumber % 10;
            result += Math.pow(temp, n);
        }
        
        
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        
        //N°15 numeri complessi
        
        proxEx(cE); cE+=1;
        
        Complex nc1= new Complex(2.3, 4.5);
        Complex nc2= new Complex(3.4, 5.0);
        Complex tempC;
        
        tempC= add(nc1,nc2);
        //System.err.printf("The Sum is %1.f + %.1fi",tempC.real + tempC.imag);
        
        
        //N°16 scambio senza variabile d'appoggio
        
        proxEx(cE); cE+=1;
        int A= 5;
        int B= 3;
        
        A=A+B;
        B=A-B;
        A=A-B;
        
        System.out.println(A);
        System.out.println(B);
        
        
        // SOLUZIONE CON GLI XOR
        
        int a=5,b=3;
        System.out.println("a= "+a+" b= "+b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a= "+a+" b= "+b);
                
                
                
                
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
    
    public static int contami(int num2){
        int i=0;
        while (num2>1){
           num2= num2/10;
           i++;
           
        }
        return i;
    }
 }       
  
