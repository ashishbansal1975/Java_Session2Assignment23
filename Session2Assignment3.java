/*
   Write a program to print the following pattern:
             a
           a b a
         a b c b a
           a b a
             a
*/

public class Session2Assignment3
{
    public static void main(String [] args)
    {
         char ch='a';  
         int i,j,k,m;  
  
   
    for(i=1;i<=3;i++)  
    {  
        for(j=3;j>=i;j--)  
            System.out.print(" ");  
        for(k=1;k<=i;k++)  
            System.out.print(ch++);  
            ch--;  
        for(m=1;m<i;m++)  
            System.out.print(--ch);  
        System.out.println();
        ch='a';  
    }  


    for(i=2;i>=1;i--)  
    {  
        for(j=3;j>=i;j--)  
            System.out.print(" ");            
        
           for(k=1;k<=i;k++)  
            System.out.print(ch++);  
             ch--;
          for(m=1;m<i;m++)  
            System.out.print(--ch);  

        System.out.println();
        ch='a';  
    }  

  }
}


