1.      Remove 10's

Write a program to read an integer array and remove all 10s from the array, shift the other elements towards left and fill the trailing empty positions by 0 so that the modified array is of the same length of the given array.

Include a class UserMainCode with a static method removeTens which accepts the number of elements and an integer array. The return type (Integer array) should return the final array.
Create a Class Main which would be used to read the number of elements and the input array, and call the static method present in UserMainCode.

Input and Output Format:
Input consists of n+1 integers, where n corresponds to size of the array followed by n elements of the array.
Output consists of an integer array (the final array).
Refer sample output for formatting specifications.

Sample Input :
5
1
10
20
10
2
Sample Output :
1
20
2
o
o

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []sr=new int[n];
        Integer []sr1=new Integer[n]; 
        for(int i=0;i<n;i++)
        {
        sr[i]=sc.nextInt();
        }
        
        sr1=UserMainCode.remove(sr);
        for(int i=0;i<n;i++){
            System.out.println(sr1[i]);
        }       
    }  

}



import java.util.ArrayList;
import java.util.Iterator;
public class UserMainCode {
    public static Integer[] remove(int s[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<s.length;i++)
        {
        a.add(s[i]);
        }
       Iterator <Integer> it=a.iterator();
       while(it.hasNext())
       {
       int x=it.next();
       if(x!=10)
       {
           b.add(x);
       }
       }
       if(b.size()<s.length)
       {
       int len=s.length-b.size();
            for(int i=0;i<len;i++)
            {
            b.add(0);
            }
       }
           
       Integer m[]=new Integer[b.size()];
       b.toArray(m);
       return m;
           }
}


2.      Programming Logic

Write a Program that accepts three integer values (a,b,c) and returns their sum. However, if one of the values is 13 then it does not count towards the sum and the next number also does not count. So for example, if b is 13, then both b and c do not count.

Include a class UserMainCode with a static method getLuckySum which accepts three integers. The return type is integer representing the sum.

Create a Class Main which would be used to accept the input integers and call the static method present in UserMainCode.

Input and Output Format:

Input consists of three integers.

Output consists of a single integer.

Refer sample output for formatting specifications.

Sample Input 1:
1
2
3

Sample Output 1:
6


Sample Input 2:
1
2
13

Sample Output 2:
3


Sample Input 3:
13
3
8

Sample Output 3:
8

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
       int res=UserMainCode.sum(n,n1,n2);
        System.out.println(res);
    }
    }


public class UserMainCode {
    public static int sum(int n,int n1,int n2){
        int m=0;
        if(n==13)
        {
        m=n2;}
        else if(n1==13)
        {
            m=n;
        }
        else
            if(n2==13)
            {
            m=n+n1;
            }
        else
                m=n+n1+n2;
       return m;
           }
}

3.      Simple String Manipulation

Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 chars except when
1.   keep the first char if it is 'j'
2.   keep the second char if it is 'b'.
Include a class UserMainCode with a static method getString which accepts a string. The return type (string) should be the modified string based on the above rules. Consider all letters in the input to be small case.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
hello
Sample Output 1:
llo
Sample Input 2:
java
Sample Output 2:
jva

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String res=UserMainCode.stringManipulation(n);
        System.out.println(res);
      
    }
    }


public class UserMainCode {
public static String stringManipulation(String s){
char c[]=s.toCharArray();
String d="";
if(c[0]!='j' && c[1]!='b')
{
d=d+s.substring(2,c.length);
}
else if(c[0]=='j' && c[1]=='b')
{
d=d+s;
}
else if(s.charAt(0)=='j'&&s.charAt(1)!='b')
{
d=d+(s.substring(0,1)+ s.substring(2));
}
else if(s.charAt(0)!='j'&&s.charAt(1)=='b')
{
d=d+s.substring(1);
}
return d;
}

}}4. Color Code
Write a program to read a string and validate whether the given string is a valid color code based on the following rules:
- Must start with "#" symbol
- Must contain six characters after #
- It may contain alphabets from A-F or digits from 0-9
Include a class UserMainCode with a static method validateColorCode which accepts a string. The return type (integer) should return 1 if the color is as per the rules else return -1.
Create a Class Main which would be used to accept a String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string (Valid or Invalid).
Refer sample output for formatting specifications.
Sample Input 1:
#FF9922
Sample Output 1:
Valid
Sample Input 2:
#FF9(22
Sample Output 2:
Invalid


import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
boolean s=UserMainCode.colorCode(n);
             if(s==true){
        System.out.println("valid");
       }
       else
           System.out.println("invalid");
    }
    }


public class UserMainCode {
    public static boolean colorCode(String s){
        boolean f=false;
        if(s.matches("[#]{1}[A-F0-9]{6}"))
        {
        f=true;}
        else
            f=false;
       return f;
           }
}
5.       Digits - II

Write a program to read a non-negative integer n, compute the sum of its digits. If sum is greater than 9 repeat the process and calculate the sum once again until the final sum comes to single digit.Return the single digit.
Include a class UserMainCode with a static method getDigitSum which accepts the integer value. The return type is integer.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a integer.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
9999
Sample Output 1:
9

Sample Input 2:
698
Sample Output 2:
5
import java.io.*;
import java.util.*;
public class Main {

public static void main(String[] args) {
int rem,sum=0,dsum=0,rem1;
Scanner sc=new Scanner(System.in);
int digit=sc.nextInt();
while(digit!=0)
{
rem=digit%10;
sum=sum+rem;
digit/=10;
}
if(sum<9)
{
System.out.println(sum);
}
else
{

while(sum!=0)
{
rem1=sum%10;
dsum+=rem1;
sum/=10;
}
System.out.println(dsum);
}
}
}



6. Add and Reverse
Given an int array and a number as input, write a program to add all the elements in the array greater than the given number. Finally reverse the digits of the obtained sum and print it.
Include a class UserMainCode with a static method “addAndReverse” that accepts 2 arguments and returns an integer.The first argument corresponds to the integer array and the second argument corresponds to the number.
Create a class Main which would get the required input and call the static method addAndReverse present in the UserMainCode.

Example:
Input Array = {10,15,20,25,30,100}
Number = 15
sum = 20 + 25 + 30 + 100 = 175
output = 571
Input and Output Format:
The first line of the input consists of an integer that corresponds to the number of elements in the array.
The next n lines of the input consists of integers that correspond to the elements in the array.
The last line of the input consists of an integer that corresponds to the number.
Output consists of a single integer.
Sample Input
6
10
15
20
25
30
100
15
Sample Output
571


import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
         int res=UserMainCode.digits(a,num);
        System.out.println(res);
      
    }
    }


public class UserMainCode {
    public static int digits(int s[],int n){
       int rev=0,sum=0,index=0;
       for(int i=0;i<s.length;i++)
       {
       if(s[i]==n)
       {
           index=i+1;}
       }
       System.out.println(index);
       for(int j=index;j<s.length;j++)
       {
       sum=sum+s[j];
       } 
       int temp=sum;
       System.out.println(temp);
       while(temp!=0)
       {
       int rem=temp%10;
       rev=rev*10+rem;
       temp=temp/10;
       }          
       return rev;
           }
}
7.       String Processing - VII

Write a program to read a two strings and one int value(N). check if Nth character of first String from start and Nth character of second String from end are same or not. If both are same return true else return false.
Check need not be Case sensitive
Include a class UserMainCode with a static method isEqual which accepts the two strings and a integer n. The return type is the TRUE / FALSE.
Create a Class Main which would be used to read the strings and integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two strings and an integer.
Output consists of TRUE / FALSE .
Refer sample output for formatting specifications.

Sample Input 1:
AAAA
abab
2

Sample Output 1:
TRUE

Sample Input 2:
MNOP
QRST
3

Sample Output 2:
FALSE


import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=sc.nextInt();
        
         boolean s=UserMainCode.digits(s1,s2,n);
       
      if(s==true){
        System.out.println("TRUE");
       }
       else
           System.out.println("FALSE");
    }
    }


public class UserMainCode {
    public static boolean digits(String s1,String s2,int n){
       boolean f=false;
       StringBuffer sb=new StringBuffer(s2);
       String s=sb.reverse().toString();
       String st1=String.valueOf(s1.charAt(n-1));
       String st2=String.valueOf(s.charAt(n-1));
       if(st1.equalsIgnoreCase(st2))
               {
               f=true;}
       else
           f=false;
       return f;
           }
}


8.       Month : Number of Days

Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a program to find out total number of days in the given month for the given year.

Include a class UserMainCode with a static method “getNumberOfDays” that accepts 2 integers as arguments and returns an integer. The first argument corresponds to the year and the second argument corresponds to the month code. The method returns an integer corresponding to the number of days in the month.

Create a class Main which would get 2 integers as input and call the static method getNumberOfDays present in the UserMainCode.

Input and Output Format:
Input consists of 2 integers that correspond to the year and month code.
Output consists of an integer that correspond to the number of days in the month in the given year.

Sample Input:
2000
1

Sample Output:
29

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       
        int y=sc.nextInt();
        int m=sc.nextInt();
         int d=UserMainCode.month(y,m);
       System.out.println(d);
    }
    }


import java.util.GregorianCalendar;



public class UserMainCode {
    public static int month(int s1,int s2){
       int f=0;
       if(s2==0||s2==2||s2==4||s2==6||s2==7||s2==9||s2==11)
       {
       f=31;}
       else
           if(s2==3||s2==5||s2==8||s2==10)
           {
               f=30;
           }
           else if(s2==1)
           {
               GregorianCalendar g=new GregorianCalendar();
               boolean b=g.isLeapYear(s1);
               if(b==true){f=29;}
               else f=28;
           }
        
       return f;
           }
}

9.       SumOdd

Write a program to read an integer and find the sum of all odd numbers from 1 to the given number. [inclusive of the given number]

if N = 9 [ 1,3,5,7,9]. Sum = 25

Include a class UserMainCode with a static method addOddNumbers which accepts the number n. The return type is the integer based on the problem statement.

Create a Class Main which would be used to accept the integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a integer.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
6

Sample Output 1:
9

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        
         int d=UserMainCode.sumOdd(n);
       System.out.println(d);
     
    }
    }
public class UserMainCode {
    public static int sumOdd(int s1){
       int sum=0;
       for(int i=0;i<=s1;i++)
       {
       if(i%2!=0)
       {
       sum=sum+i;
       }
       }
       return sum;
           }
}
10.       Even Sum & Duplicate Elements

Write a program to read a integer array, Remove the duplicate elements and display sum of even numbers in the output. If input array contain only odd number then return -1.
Include a class UserMainCode with a static method sumElements which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
2
3
54
1
6
7
7
Sample Output 1:
62

Sample Input 2:
6
3
7
9
13
17
21
Sample Output 2:
-1

import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
       int d=UserMainCode.sumEven(a);
       System.out.println(d);
    }
    }

import java.util.HashSet;
import java.util.Iterator;


public class UserMainCode {
    public static int sumEven(int s1[]){
       int sum=0;
       HashSet <Integer> hs=new HashSet<Integer>();
       for(int i=0;i<=s1.length-1;i++)
       {
          hs.add(s1[i]);
       }
       Iterator<Integer>it=hs.iterator();
       while(it.hasNext())
       {
       int x=(int)it.next();
       if(x%2==0)
       {
       sum=sum+x;
       }
       }
       if(sum==0)
    	   return -1;
       return sum;
           }
}

11.   ArrayList to String Array

Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them into a string array.
    Return the array.
Include a class UserMainCode with the static method convertToStringArray which accepts an arraylist and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer denotes the size of the arraylist, the next n strings are values to the arraylist.
Output consists of an arrayas per step 4.
Refer sample output for formatting specifications.

Sample Input 1:
4
a
d
c
b
Sample Output 1:
a
b
c
d

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>al=new ArrayList<String>();
        int n=sc.nextInt();
      
        for(int i=0;i<n;i++)
        {
        al.add(sc.next());
        }
       String a[]=UserMainCode.listToArray(al);
       for(int i=0;i<a.length;i++){
       System.out.println(a[i]);}
    }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class UserMainCode {
    public static String[] listToArray(ArrayList<String>al){
        Collections.sort(al);
        String s[]=new String[al.size()];
        al.toArray(s);
       return s;
           } }
12.   Flush Characters
Write a program to read a string from the user and remove all the alphabets and spaces from the String, andonly store special characters and digit in the output String. Print the output string.

Include a class UserMainCode with a static method getSpecialChar which accepts a string. The return type (String) should return the character removed string.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a strings.
Output consists of an String (character removed string).
Refer sample output for formatting specifications.

Sample Input :
cogniz$#45Ant
Sample Output :
$#45

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String a=UserMainCode.flushChar(s);
       System.out.println(a);
    }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class UserMainCode {
    public static String flushChar(String s){
        String s1=s.replaceAll("[a-zA-Z]", "");
        
       return s1;
           }}
13.   Find Distance

Write a Program that accepts four int inputs(x1,y1,x2,y2) as the coordinates of two points. Calculate the distance between the two points using the below formula.
Formula : square root of((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
Then, Round the result to return an int
Include a class UserMainCode with a static method findDistance which accepts four integers. The return type is integer representing the formula.
Create a Class Main which would be used to accept the input integers and call the static method present in UserMainCode.

Input and Output Format:
Input consists of four integers.
Output consists of a single integer.
Refer sample output for formatting specifications.

Sample Input 1:
3
4
5
2
Sample Output 1:
3

Sample Input 2:
3
1
5
2
Sample Output 2:
2

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       int n4=sc.nextInt();
       
       int a=UserMainCode.distance(n1,n2,n3,n4);
       
       System.out.println(a);
    }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class UserMainCode {
    public static int distance(int n1,int n2,int n3,int n4){
        int dis=0;
        int x=Math.abs(n1-n3);
        int y=Math.abs(n2-n4);
        dis=(int)Math.round(Math.sqrt((x*x)+(y*y)));
        return dis;
}}
14.   Find common characters and unique characters in string
Given a method with two strings as input. Write code to count the common and unique letters in the two strings.
Note:
- Space should not be counted as a letter.
- Consider letters to be case sensitive. ie, "a" is not equal to "A".
Include a class UserMainCode with a static method commonChars which accepts two strings as input.
The return type of the output is the count of all common and unique characters in the two strings.
Create a class Main which would get the inputs and call the static method commonChars present in the UserMainCode.

Input and Output Format:
Input consists of two strings.
Output is an integer.
Refer sample output for formatting specifications.

Sample Input 1:
a black cow
battle ship
Sample Output 1:
2

[Explanation : b, l and a are the common letters between the 2 input strings. But 'a' appears more than once in the 1st string. So 'a' should not be considered while computing the count value.]


Sample Input 2:
australia
sri lanka
Sample Output 2:
4

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       String n1=sc.nextLine();
       String n2=sc.nextLine();
       
       
       int a=UserMainCode.common(n1,n2);
       
       System.out.println(a);
    }
    }


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class UserMainCode {
    
    public static int common(String n1,String n2){
        StringBuffer sb1=new StringBuffer(n1);
       StringBuffer sb2=new StringBuffer(n2);  
for(int i=0;i<sb1.length();i++){
int c=0;
for(int j=i+1;j<sb1.length();j++){
if(sb1.charAt(i)==sb1.charAt(j)){
sb1.deleteCharAt(j);
c++;
}
}
if(c>=1){
sb1.deleteCharAt(i);
}
}
System.out.println(sb1);
for(int i=0;i<sb2.length();i++){
int c=0;
for(int j=i+1;j<sb2.length();j++){
if(sb2.charAt(i)==sb2.charAt(j)){
sb2.deleteCharAt(j);
c++;
}
}
if(c>=1){
sb2.deleteCharAt(i);
}
}
System.out.println(sb2);
int count=0;
for(int i=0;i<sb1.length();i++){
for(int j=0;j<sb2.length();j++){
if(sb1.charAt(i)==sb2.charAt(j)){
count++;
}
}
}
return count;
}
        }

   
15.   Concatenate Characters

Given an array of Strings, write a program to take the last character of each string and make a new String by concatenating it.
Include a class UserMainCode with a static method “concatCharacter” that accepts a String array as input and returns the new String.
Create a class Main which would get the String array as input and call the static method concatCharacterpresent in the UserMainCode.
Input and Output Format:
The first line of the input consists of an integer n that corresponds to the number of strings in the input string array.
The next n lines of the input consist of the strings in the input string array.
Output consists of a string.
Sample Input:
3
ab
a
abcd
Sample Output:
bad

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String a[]=new String[n];
       for(int i=0;i<n;i++)
       {
       a[i]=sc.next();
       }
String res=UserMainCode.common(a);
System.out.println(res);
    }
    }


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class UserMainCode {
public static String common(String n1[]){
        String s ="";
        for(int i=0;i<n1.length;i++)
        {
        int x=n1[i].length()-1;
        s=s+n1[i].charAt(x);
        }
        return s;}}
16.   ArrayList to String Array

Write a program that performs the following actions:

1.Read m strings as input (fruit names).
2.Create an arraylist to store the above m strings in this arraylist.
3.Read n strings as input (fruit names).
4.Create an arraylist to store the above n strings in this arraylist.
5.Write a function fruitSelector which accepts the arraylists as input.
6.Remove all fruits whose name ends with 'a' or 'e' from first arrayList and remove all fruits whose name begins  with 'm' or 'a' from second arrayList then combine the two lists and return the final output as a String array.
7.If the array is empty the program will print as “No fruit found”
Include a class UserMainCode with the static method fruitSelector which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array as per step 6. Refer sample output for formatting specifications.

Sample Input 1:
3
Apple
Cherry
Grapes
4
Orange
Mango
Melon
Apple
Sample Output 1:
Cherry
Grapes
Orange

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<String>al=new ArrayList<String>();
       for(int i=0;i<n;i++)
       {
       al.add(sc.next());
       }
        int n1=sc.nextInt();
       ArrayList<String>al1=new ArrayList<String>();
       for(int i=0;i<n1;i++)
       {
       al1.add(sc.next());
       }
       
       String res[]=UserMainCode.common(al,al1);
       for(int i=0;i<res.length;i++){
       System.out.println(res[i]);}
  }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class UserMainCode {
    
    public static String[] common(ArrayList<String>al,ArrayList<String>al1){
        ArrayList<String>a=new ArrayList<String>();
        ArrayList<String>b=new ArrayList<String>();
        ArrayList<String>c=new ArrayList<String>();
        Iterator <String>it=al.iterator();
        while(it.hasNext())
        {
        String s=it.next();
        int x=s.length()-1;
        
        if(s.charAt(x)!='a'&&s.charAt(x)!='e')
        {
        a.add(s);
        }
        }
        
        Iterator <String>itr=al1.iterator();
        while(itr.hasNext())
        {
        String s=itr.next();
        if(s.charAt(0)!='m'&&s.charAt(0)!='a')
        {
        b.add(s);
        }
        }
        
        int len=a.size()+b.size();
        for(int i=0;i<a.size();i++)
        {
        c.add(a.get(i));
        }
        
        for(int i=0;i<b.size();i++)
        {
        c.add(b.get(i));
        }
        
        String arr[]=new String[c.size()];
          c.toArray(arr);
        return arr;}}

   
17. Elements in ArrayList
Use Collection Methods.
Write a program that takes two ArrayLists as input and  finds out all elements present either in A or B, but not in both.
Include a class UserMainCode with the static method arrayListSubtractor which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read the inputs and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array. The elements in the output array need to be printed in sorted order.

Refer sample output for formatting specifications.

Sample Input 1:
4
1
8
3 
5
2
3
5
Sample Output 1:
1
8

Sample Input 2:
4
9
1
3
5
4
1
3
5
6
Sample Output 2:
6
9

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<Integer>al=new ArrayList<Integer>();
       for(int i=0;i<n;i++)
       {
       al.add(sc.nextInt());
       }
        int n1=sc.nextInt();
       ArrayList<Integer>al1=new ArrayList<Integer>();
       for(int i=0;i<n1;i++)
       {
       al1.add(sc.nextInt());
       }
       
       Integer res[]=UserMainCode.common(al,al1);
       for(int i=0;i<res.length;i++){
       System.out.println(res[i]);}
    }
    }
import java.util.ArrayList;
import java.util.Collections;
public class UserMainCode {
    public static Integer[] common(ArrayList<Integer>al,ArrayList<Integer>al1){
        ArrayList<Integer>a=new ArrayList<Integer>();
        a.addAll(al);
        a.removeAll(al1);
       al1.removeAll(al);
       a.addAll(al1);
       Collections.sort(a);
       Integer arr[]=new Integer[a.size()];
       a.toArray(arr);
        
        return arr;
}
        }

   
18.  Sum of Digits in a String
Write code to get the sum of all the digits present in the given string.
Include a class UserMainCode with a static method sumOfDigits which accepts string input.
Return the sum as output. If there is no digit in the given string return -1 as output.
Create a class Main which would get the input and call the static method sumOfDigits present in the UserMainCode.
Input and Output Format:
Input consists of a string.
Output is a single integer which is the sum of digits in a given string.
Refer sample output for formatting specifications.
Sample Input 1:
good23bad4
Sample Output 1:
9
Sample Input 2:
good
Sample Output 2:
-1

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
Scanner sc=new Scanner(System.in);
       String n=sc.next();
       int res=UserMainCode.common(n);
       System.out.println(res);
    }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class UserMainCode {
    
    public static int common(String s){
        char arr[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                String str=String.valueOf(arr[i]);
                int n=Integer.parseInt(str);
                sum=sum+n;
             }
        }
       
       if(s.replaceAll("[a-zA-Z]", "").isEmpty()){
       
       sum=-1;}
        
        return sum;
}
        }
19.  Word Count

Given a string array (s) and non negative integer (n) and return the number of elements in the array which have same number of characters as the givent int N.
Include a class UserMainCode with a static method countWord which accepts the string array and integer. The return type is the string formed based on rules.
Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a an integer indicating the number of elements in the string array followed the elements and ended by the non-negative integer (N).
Output consists of a integer .
Refer sample output for formatting specifications.

Sample Input 1:
4
a
bb
b
ccc
1
Sample Output 1:
2

Sample Input 2:
5
dog
cat
monkey
bear
fox
3
Sample Output 2:
3

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String a[]=new String[n];
       for(int i=0;i<n;i++)
       {
       a[i]=sc.next();
         }
       int num=sc.nextInt();
       int res=UserMainCode.common(a,num);
System.out.println(res);
    }
    }

20.  IP Validator
Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”.

Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1 if it is a valid IP address else return 2.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string that corresponds to an IP.
Output consists of a string(“Valid” or “Invalid”).
Refer sample output for formatting specifications.
Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255.
Sample Input 1:
132.145.184.210
Sample Output 1:
Valid
Sample Input 2:
132.145.184.290
Sample Output 2:
Invalid

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();    
         boolean s=UserMainCode.common(n);
      if(s==true){
        System.out.println("Valid");
       }
       else
           System.out.println("Invalid");
    }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static boolean common(String s){
        boolean c=false;
        int cnt=0;
        StringTokenizer st=new StringTokenizer(s,".");
        while(st.hasMoreTokens())
        {
        String s1=st.nextToken();
        int num=Integer.parseInt(s1);
        if(num>=0&&num<=255)
        {
            cnt++;
        }
               }
        if(cnt==4)
        {
        c=true;
        }
        else
         c=false;
        return c;
        }
        }
21.  Anagram
Write a program to check whether the two given strings are anagrams.
Note: Rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once is called Anagram."
Include a class UserMainCode with a static method “getAnagram” that accepts 2 strings as arguments and returns an int. The method returns 1 if the 2 strings are anagrams. Else it returns -1.
Create a class Main which would get 2 Strings as input and call the static method getAnagram present in the UserMainCode.
Input and Output Format:
Input consists of 2 strings. Assume that all characters in the string are lower case letters.
Output consists of a string that is either “Anagrams” or “Not Anagrams”.
Sample Input 1:
eleven plus two
twelve plus one

Sample Output 1:
Anagrams
Sample Input 2:
orchestra
carthorse
Sample Output 2:
Anagrams
Sample Input 3:
cognizant
technologies
Sample Output 3:
Not Anagrams

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
         String n1=sc.nextLine();
         boolean s=UserMainCode.common(n,n1);
      if(s==true){
        System.out.println("Anagrams");
       }
       else
           System.out.println("Not Anagrams");
    }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static boolean common(String s,String s1){
        boolean c=false;
        try{
        ArrayList<Character> a=new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
        char ch=s.charAt(i);
        a.add(ch);
        }
        ArrayList<Character> b=new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
        {
        char ch=s.charAt(i);
        b.add(ch);
        }
        Collections.sort(a);
        Collections.sort(b);
        if(a.containsAll(b)||b.containsAll(a))
        {
        c=true;
        }
        }
        catch(Exception e){
        
            c=false;
        }
        return c;
        }
        }
22.  String processing – Long + Short + Long
Obtain two strings S1,S2 from user as input. Your program should form a string of  “long+short+long”, with the shorter string inside of the longer String.
Include a class UserMainCode with a static method getCombo which accepts two string variables. The return type is the string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of two strings with maximum size of 100 characters.
Output consists of an string.
Refer sample output for formatting specifications.
Sample Input 1:
Hello
Hi
Sample Output 1:
HelloHiHello
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
         String n1=sc.nextLine();
       String res=UserMainCode.common(n,n1);
System.out.println(res);
         }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static String common(String s,String s1){
        int x=s.length();
        String str="";
        int y=s1.length();
        if(x>y)
        {
        str=s+s1+s;
        }
        else
            str=s1+s+s1;
        return str;
       }}
23.  Odd Digit Sum
Write a program to input a String array. The input may contain digits and alphabets (“de5g4G7R”). Extract odd digits from each string and find the sum and print the output.
For example, if the string is "AKj375A" then take 3+7+5=15 and not as 375 as digit.
Include a class UserMainCode with a static method oddDigitSum which accepts a string array and the size of the array. The return type (Integer) should return the sum.
Create a Class Main which would be used to accept Input Strings and call the static method present in UserMainCode.
Assume maximum length of array is 20.
Input and Output Format:
Input consists of an integer n, corresponds to the number of strings, followed by n Strings.
Output consists of an Integer.
Refer sample output for formatting specifications.
Sample Input :
3
cog2nizant1
al33k
d2t4H3r5
Sample Output :
15
(1+3+3+3+5)

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String n1[]=new String[n];
         for(int i=0;i<n;i++)
         {
         n1[i]=sc.next();
         }
               int res=UserMainCode.common(n1);
              System.out.println(res);    }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static int common(String s[]){
        int sum=0;
        for(int i=0;i<s.length;i++)
        {
        String str=s[i];
        int len=str.length();
        char a[]=str.toCharArray();
        for(int j=0;j<len;j++)
        {
            if(Character.isDigit(a[j]))
            {
            String num=String.valueOf(a[j]);
            int no=Integer.parseInt(num);
            if(no%2!=0)
            {
                System.out.println(no);
            sum=sum+no;
            }
            }
        
        }
        }
        return sum;
        }
        }

24.  Forming New Word from a String
Write a program to read a string and a positive integer n as input and construct a string with first n and last n characters in the given string.
Include a class UserMainCode with a static method formNewWord which accepts a string and positive integer .
The return type of the output should be a string (value) of first n character and last n character.
Create a class Main which would get the input as a string and integer n and call the static methodformNewWord present in the UserMainCode.
Input and Output Format:
Input consists of a string of even length.
Output is a string .
Note: The given string length must be >=2n.
Refer sample output for formatting specifications.
Sample Input 1:
California
3
Sample Output 1:
Calnia

Sample Input2:
this
1
Sample Output 2:
Ts

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
                 String n1=sc.next();
         int n=sc.nextInt();
      String res=UserMainCode.common(n1,n);
              System.out.println(res);
    }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
        public static String common(String s,int n){
        String str=s.substring(0,n);
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String st=sb.substring(0,n);
        StringBuffer sb1=new StringBuffer(st);
        sb1.reverse();
        str=str+sb1.toString();
        return str;
        }
        }
   			25.  Decimal to Binary Conversion
Write a Program that accepts a decimal number n, and converts the number to binary.

Include a class UserMainCode with a static method convertDecimalToBinary which accepts an integer. The return type is long representing the binary number.

Create a Class Main which would be used to accept the input integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of single integer.
Output consists of a single long.
Refer sample output for formatting specifications.

Sample Input 1:
5
Sample Output 1:
101

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
               long res=UserMainCode.common(n);
            System.out.println(res);
         }
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
        public static long common(int n){
        int rem=0,base=1,decimal_val=0;
        while(n>0)
        {
        rem=n%2;
        decimal_val=decimal_val+rem*base;
                n=n/2;
                base=base*10;
        }
        return decimal_val;
        }
        }

   
26.  Palindrome & Vowels
Write a program to check if a given string is palindrome and contains at least two different vowels.
Include a class UserMainCode with a static method checkPalindrome which accepts a string. The return type (integer) should be 1 if the above condition is satisfied, otherwise return -1.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Note – Case Insensitive while considering vowel, i.e a & A are same vowel, But Case sensitive while considering palindrome i.e abc CbA are not palindromes.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single Integer.
Refer sample output for formatting specifications.
Sample Input 1:
abceecba
Sample Output 1:
valid
Sample Input 2:
abcd
Sample Output 2:
Invalid

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        boolean s=UserMainCode.common(n);
      if(s==true){
        System.out.println("Valid");
       }
       else
           System.out.println("Invalid"); }}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static boolean common(String n){
        boolean f=false;
        int fg=0,fg1=0;
        String temp=n;
        String str="";
        HashSet<String>hs=new HashSet<String>();
        StringBuffer sb=new StringBuffer(n);
        if(temp.equals(sb.reverse().toString()))
        {
        fg=1;
        }
        char ar[]=n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            if((ar[i]=='a')||(ar[i]=='e')||(ar[i]=='i')||(ar[i]=='o')||(ar[i]=='u'))
            {
                
                str=String.valueOf(ar[i]);
                hs.add(str);
                
            }
        }
        String st[]=new String[hs.size()];
        hs.toArray(st);
        if(st.length>=2)
        {
        fg1=1;}
        
        if(fg==1&&fg1==1)
        {
        f=true;}
        
        else
            f=false;
        
        return f;
        } }

   
Or

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		System.out.println(UserMainCode.empdis(n));
	}
}


public class UserMainCode {
	public static String empdis(String s) 
	
	{
		int r=0;
		String rs;
		if(s.contains("a") || s.contains("A"))
			r++;
		if( s.contains("e") || s.contains("E"))
			r++;
		if( s.contains("i") || s.contains("I"))
			r++;
		if (s.contains("o") || s.contains("O"))
			r++;
		if(s.contains("u") || s.contains("U"))
			r++;

		StringBuffer sb=new StringBuffer();
		sb.append(s);
		if(sb.equals(sb.reverse()) && r>=2)
			rs="valid";
		else
			rs="Invalid";
		
		return rs;
			
		
		
}
}	

26.  States and Capitals
Write a program that construts a hashmap with “state” as key and “capital” as its value. If the next input is a state, then it should return capital$state in lowercase.
Include a class UserMainCode with a static method getCapital which accepts a hashmap. The return type is the string as given in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+2 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the state and capital. The last value consists of the “state” input.
Output consists of a string as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
3
Karnataka
Bangaluru
Punjab
Chandigarh
Gujarat
Gandhinagar
Punjab
Sample Output 1:
chandigarh$punjab

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         HashMap<String,String>hm=new HashMap<String,String>();
         for(int i=0;i<n;i++)
         {
         hm.put(sc.next(),sc.next());
         }
         String st=sc.next();
     String s=UserMainCode.common(hm,st);
              System.out.println(s);
    }
    }
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static String common(HashMap<String,String>hm,String state){
        Iterator<String>it=hm.keySet().iterator();
        String st="";
        String s="";
        String val="";
        while(it.hasNext())
        {
        s=it.next();
        if(s.equalsIgnoreCase(state))
        {
         val=hm.get(s);
        }
        }
        st=val.toLowerCase()+"$"+s.toLowerCase();
        return st;
        }
        }
Or
   
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
Map<String, String> hm = new HashMap<String, String>();
for (int i = 0; i < a; i++) {
hm.put(sc.next(), sc.next());
}
System.out.println(hm);
String s1 = sc.next();
Iterator <String> i =hm.keySet().iterator();  
while(i.hasNext())
{
String s=i.next();
if(s.equalsIgnoreCase(s1))
System.out.println(hm.get(s)+"$"+s1);
}
}
}


27.  States and Capitals
Write a program that construts a hashmap with “state” as key and “capital” as its value. If the next input is a state, then it should return capital$state in lowercase.
Include a class UserMainCode with a static method getCapital which accepts a hashmap. The return type is the string as given in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+2 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the state and capital. The last value consists of the “state” input.
Output consists of a string as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
3
Karnataka
Bangaluru
Punjab
Chandigarh
Gujarat
Gandhinagar
Punjab
Sample Output 1:
chandigarh$punjab
Same asQue26.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String, String> mp=new HashMap<String, String>();
		for(int i=0;i<n;i++)
		{
			mp.put(sc.next(), sc.next());
		}
		
		String s=sc.next();
		
		System.out.println(UserMainCode.empdis(mp,s));
	}
}
import java.util.Map;
import java.util.Set;


public class UserMainCode {
	public static String empdis(Map<String, String> mp,String s) 
	
	{	String rs="";
		Set<String> k=mp.keySet();
		for(String key:k)
		{
			if(key.equals(s))
			{
				rs=(mp.get(key)).toLowerCase()+"$"+key.toLowerCase();
			}
		}
		return rs;		
}
}	


28.  Leap Year

Write a program to read a string containing date in DD/MM/YYYY format and check if its a leap year. If so, return true else return false.

Include a class UserMainCode with a static method isLeapYear which accepts the string. The return type is the boolean indicating TRUE / FALSE.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output consists of TRUE / FALSE.

Refer sample output for formatting specifications.

Sample Input 1:

23/02/2012

Sample Output 1:

TRUE

Sample Input 2:

12/12/2011

Sample Output 2:

FALSE
import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s = sc.next();
boolean b = false;
StringTokenizer st = new StringTokenizer(s, "/");
while (st.hasMoreTokens()) {
int day = Integer.parseInt(st.nextToken());
int month = Integer.parseInt(st.nextToken());
int year = Integer.parseInt(st.nextToken());
GregorianCalendar gc = new GregorianCalendar();
b = gc.isLeapYear(year);
System.out.println(b);
}
}
}
Or
import java.text.ParseException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws ParseException 
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
			System.out.println(UserMainCode.empdis(s));
	}
}
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserMainCode {
	public static String empdis(String s) throws ParseException 
	
	{	
			String r="";
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date d=sdf.parse(s);
			GregorianCalendar gc=new GregorianCalendar();
			gc.setTime(d);
			if(gc.isLeapYear(gc.get(Calendar.YEAR)))
				r="TRUE";
			else
				r="FALSE";
					return r;		
	
		 		
}
}	

29.  Vowel Check
Write a program to read a String and check if that String contains all the vowels. Print “yes” if the string contains all vowels else print “no”.
Include a class UserMainCode with a static method getVowels which accepts a string. The return type (integer) should return 1 if the String contains all vowels else return -1.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string(“yes” or “no”).
Refer sample output for formatting specifications.
Sample Input 1:
abceiduosp
Sample Output 1:
yes
Sample Input 2:
bceiduosp
Sample Output 2:
no
import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s = sc.next();
String s2 = s.replaceAll("[^aeiouAEIOU]", "");
System.out.println(s2);
HashSet<Character> hs = new HashSet<Character>();
for (int i = 0; i < s2.length(); i++) {
hs.add(s2.charAt(i));
}
if (hs.size() == 5) {
System.out.println("yes");
} else {
System.out.println("No");
}
}
}
0r
import java.text.ParseException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
String v="aeiou";
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=0;j<v.length();j++)
{
if(v.charAt(j)==s.charAt(i))
{
count=1;
}
}
}
if(count==1)
{
System.out.println("Valid");
}
else
{
System.out.println("Not valid");
}
}
}

Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int r=UserMainCode.empdis(n);
		String s;
		if(r==1)
			s="yes";
		else
			s="no";
		
			System.out.println(s);
	}
}


public class UserMainCode {
	public static int empdis(String s) 
	
	{
		int r;
		if(s.contains("a") || s.contains("A") && s.contains("e") || s.contains("E") && s.contains("i") || s.contains("I") && s.contains("o") || s.contains("O") && s.contains("u") || s.contains("U") )
			r=1;
		else
			r=-1;
		
		return r;	 		
}
}	
Or

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
          boolean s=UserMainCode.common(st);
      if(s==true){
        System.out.println("yes");
       }
       else
           System.out.println("no");
    }
    }

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class UserMainCode {
    
    public static boolean common(String sd){
        char arr[]=sd.toCharArray();
        boolean f=false;
        HashSet<Character>hs=new HashSet<Character>();
        for(int i=0;i<sd.length();i++){
        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
        {
        hs.add(arr[i]);
        }
        }
        if(hs.size()==5)
        {
        f=true;
        }
        else
            f=false;
        
        return f;
        }
        }

   

30.  Removing vowels from String
Given a method with string input. Write code to remove vowels from even position in the string.
Include a class UserMainCode with a static method removeEvenVowels which accepts a string as input.
The return type of the output is string after removing all the vowels.
Create a Main class which gets string as an input and call the static method removeEvenVowels present in the UserMainCode.
Input and Output Format:
Input is a string .
Output is a string .
Assume the first character is at position 1 in the given string.
Sample Input 1:
commitment
Sample Output 1:
cmmitmnt
Sample Input 2:
capacity
Sample Output 2:
cpcty

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
                 String st=sc.next();
    String s=UserMainCode.common(st);
              System.out.println(s);
          }
    }
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;


public class UserMainCode {
    
    public static String common(String sd){
        char arr[]=sd.toCharArray();
        boolean f=false;
        String st="";
                for(int i=0;i<sd.length();i++){
        if(arr[i]!='a'&&arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u')
        {
            String s=String.valueOf(arr[i]);
            st=st+s;
        }
        }
        return st;
        }
        }
or

import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
StringBuffer sb1 = new StringBuffer();
for (int i = 0; i < s1.length(); i++) {
if ((i % 2) == 0) {
sb1.append(s1.charAt(i));
} else if ((i % 2) != 0) 
{
if (s1.charAt(i) != 'a' && s1.charAt(i) != 'e'
&& s1.charAt(i) != 'i' && s1.charAt(i) != 'o'
&& s1.charAt(i) != 'u') 
{
if (s1.charAt(i) != 'A' && s1.charAt(i) != 'E'
&& s1.charAt(i) != 'I' && s1.charAt(i) != 'O'
&& s1.charAt(i) != 'U') {
sb1.append(s1.charAt(i));
}
}
}
}
System.out.println(sb1.toString());
}
}
Or
import java.text.ParseException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws ParseException 
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
			System.out.println(UserMainCode.empdis(s));
	}
}
import java.text.ParseException;

public class UserMainCode {
	public static String empdis(String s) 
	
	{	
			String r="";
			int l=s.length();
			StringBuffer sb=new StringBuffer();
			
			for(int i=0;i<l;i++)
			{ 
				if(i%2==0)
				sb.append(s.charAt(i));
				
				else if(i%2!=0)
				{
			
					if( s.charAt(i)!='a' &&s.charAt(i)!='e' &&s.charAt(i)!='i' &&s.charAt(i)!='o' &&s.charAt(i)!='u' &&s.charAt(i)!='A' &&s.charAt(i)!='E' &&s.charAt(i)!='I' &&s.charAt(i)!='O' &&s.charAt(i)!='U' )
					{
					sb.append(s.charAt(i));
					System.out.println(sb);
					
					}
				}
			}

			r=sb.toString();
					return r;		
	
		 		
}
}	

31.  Largest Element
Write a program to read an int array of odd length, compare the first, middle and the last elements in the array and return the largest. If there is only one element in the array return the same element.
Include a class UserMainCode with a static method checkLargestAmongCorner which accepts an int arrayThe return type (integer) should return the largest element among the first, middle and the last elements.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Assume maximum length of array is 20.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Integer.
Refer sample output for formatting specifications.
Sample Input 1:
5
2
3
8
4
5
Sample Output 1:
8
import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int first = 0, mid = 0, last = 0;
int s = sc.nextInt();
int a[] = new int[s];
for (int i = 0; i < s; i++) {
a[i] = sc.nextInt();
}
for (int i = 0; i < a.length; i++) {
first = a[0];
mid = a[(s - 1) / 2];
last = a[s - 1];
}
if (first > mid) {
System.out.println(first);
} else if (mid > last) {
System.out.println(mid);
} else if (last > first) {
System.out.println(last);
}
}
}
Or

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println(UserMainCode.empdis(a));
	}
}
import java.util.Arrays;

public class UserMainCode {
	public static int empdis(Integer a[]) 
	
	{	
		Arrays.sort(a);
		return a[a.length-1];		 		
}
}	


32.  Employee Bonus

A Company wants to give away bonus to its employees. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1.   Read Employee details from the User. The details would include id, DOB (date of birth) and salary in the given order. The datatype for id is integer, DOB is string and salary is integer.
2.   You decide to build two hashmaps. The first hashmap contains employee id as key and DOB as value, and the second hashmap contains same employee ids as key and salary as value.
3.   If the age of the employee in the range of 25 to 30 years (inclusive), the employee should get bonus of 20% of his salary and in the range of 31 to 60 years (inclusive) should get 30% of his salary. store the result in TreeMap in which Employee ID as key and revised salary as value. Assume the age is caculated based on the date 01-09-2014. (Typecast the bonus to integer).
4.   Other Rules:
a. If Salary is less than 5000 store -100.
b. If the age is less than 25 or greater than 60 store -200.
c. a takes more priority than b i.e both if a and b are true then store -100.
5.   You decide to write a function calculateRevisedSalary which takes the above hashmaps as input and returns the treemap as output. Include this function in class UserMainCode.


Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next three values indicate the employee id, employee DOB and employee salary. The Employee DOB format is “dd-mm-yyyy”
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
2
1010
20-12-1987
10000
2020
01-01-1985
14400


Sample Output 1:
1010
12000
2020
17280

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Sum {
public static void main(String[] args) throws ParseException {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s[]=new String[n];
String ss="01-09-2014";
StringTokenizer st=new StringTokenizer(ss,"-");
int ds=0,ms=0,ys=0;
while(st.hasMoreTokens()){
ds=Integer.parseInt(st.nextToken());
ms=Integer.parseInt(st.nextToken());
ys=Integer.parseInt(st.nextToken());
}
int ids[]=new int[n];
HashMap<Integer,String> h1=new HashMap<Integer, String>();
HashMap<Integer,Integer> h2=new HashMap<Integer, Integer>();
TreeMap<Integer,Integer> t1=new TreeMap<Integer, Integer>();
for(int i=0;i<n;i++){
int id=sc.nextInt();
ids[i]=id;
s[i]=sc.next();
int sal=sc.nextInt();
h1.put(id,s[i]);
h2.put(id,sal);
}
int d=0,y=0,m=0,sals=0;
for(int i=0;i<s.length;i++){
StringTokenizer st1=new StringTokenizer(s[i],"-");
while(st1.hasMoreTokens()){
d=Integer.parseInt(st1.nextToken());
m=Integer.parseInt(st1.nextToken());
y=Integer.parseInt(st1.nextToken());
}
int age=0;
if((d<ds || m<ms) && y==ys){
age=(ys-y)-1;
}
else{
age=ys-y;
}
System.out.println(age);
if(age>25 && age<=30){
sals=h2.get(ids[i]);
sals=sals+sals/5;
}
else if(age>30 && age<=60){
sals=h2.get(ids[i]);
sals=sals+((sals*3)/10);
}
t1.put(ids[i],sals);
}
for(Map.Entry<Integer,Integer> e:t1.entrySet()){
System.out.println(e.getKey()+"\n"+e.getValue());
}
}
}






33.  Password

Given a String , write a program to find whether it is a valid password or not.

Validation Rule:
Atleast 8 characters
Atleast 1 number(1,2,3...)
Atleast 1 special character(@,#,%...)
Atleast 1 alphabet(a,B...)

Include a class UserMainCode with a static method “validatePassword” that accepts a String argument and returns a boolean value. The method returns true if the password is acceptable. Else the method returns false.
Create a class Main which would get a String as input and call the static method validatePassword present in the UserMainCode.

Input and Output Format:
Input consists of a String.
Output consists of a String that is either “Valid” or “Invalid”.

Sample Input 1:
cts@1010

Sample Output 1:
Valid

Sample Input 2:
punitha3

Sample Output 2:
Invalid

public class Main {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
           String sr=sc.next();
boolean s=UserMainCode.remove(sr);
       if(s==true)
        System.out.println("valid");
       else
           System.out.println("invalid");
}
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class UserMainCode {
    public static boolean remove(String s){
        String sn="aeiou";
        boolean f;
        if(s.length()>=8){
        if(s.matches(".*[a-z].*")&&s.matches(".*[A-Z].*")&&s.matches(".*[0-9].*")&&s.matches(".*[$#@!&].*"))
        f=true;
        else
            f=false;
        }
        else
            f=false;
        return f;    
    }
}

or

import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s = sc.next();
if (s.matches("((?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$!]).{8,})")) {
System.out.println("valid");
} else {
System.out.println("Not Valid");
}
}
}


34.  Length of same word

Write a program to read a string containing multiple words find the first and last words, if they are same, return the length and if not return the sum of length of the two words.

Include a class UserMainCode with a static method compareLastWords which accepts the string. The return type is the length as per problem.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
This is Cognizant Academy

Sample Output 1:
11

Sample Input 2:
Hello World Hello

Sample Output 2:
5

import java.text.ParseException;
import java.util.*;

public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
StringTokenizer st = new StringTokenizer(s1, " ");
String s2 = st.nextToken();
StringBuffer sb = new StringBuffer(s1);
sb.reverse();
String s3 = sb.toString();
StringTokenizer st11 = new StringTokenizer(s3, " ");
String x = st11.nextToken();
StringBuffer sb1 = new StringBuffer(x);
sb1.reverse();
String s4 = sb1.toString();
if (s2.equalsIgnoreCase(s4))
System.out.println(s2.length());
else
System.out.println(s2.length() + x.length());
}
}
Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
			System.out.println(UserMainCode.empdis(s));

	}
}

import java.util.StringTokenizer;

public class UserMainCode {
	public static int empdis(String s) 
	{
		int r;
		String s1="";
		StringTokenizer st=new StringTokenizer(s," ");
		s=st.nextToken();
		while(st.hasMoreTokens())
		{s1=st.nextToken();
		}
		if(s1.equals(s))
			r=s1.length();
		else
			r=s1.length()+s.length();
		return r;
		
}
}	

35.  Median Calculation

Write a program to accept an int array as input, and calculate the median of the same.

Median Calculation Procedure:
1.       Sort the sequence of numbers.
2.       The total number count is odd, Median will be the middle number.

    The total number count is even, Median will be the average of two middle numbers, After calculating the average, round the number to nearest integer.

Include a class UserMainCode with a static method calculateMedian which accepts the int array. The return type is the integer which would be the median.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of integers.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
1
2
1
4
7
1
2

Sample Output 1:
2

Sample Input 2:
6
52
51
81
84
60
88

Sample Output 2:
71

import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int a[] = new int[s];
int mid;
for (int i = 0; i < s; i++) {
a[i] = sc.nextInt();
}
Arrays.sort(a);
if (s % 2 != 0) {
mid = a[(s - 1) / 2];
} else {
mid = Math.round((a[s / 2] + a[(s / 2) - 1]) / 2);
}
System.out.println(mid);
}
}
Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			System.out.println(UserMainCode.empdis(a));
	}
}

import java.util.Arrays;

public class UserMainCode {
	public static int empdis(Integer a[]) 
	
	{
		int n,r,n1,l;
		
		Arrays.sort(a);
		
		if(a.length%2!=0)
		{ 
			 r=a[a.length/2];
		}
		else
		{
		 l=a.length;
		 n=a[l/2];
		 n1=a[(l/2)-1];
		
		 r=(int)Math.ceil(((n+n1)/2.00));
			
		}
		return r;	 		
}
}	

36.  Occurance Count

Write a program to read a string that contains a sentence and read a word. Check the number of occurances of that word in the sentence.

Include a class UserMainCode with a static method countWords which accepts the two strings. The return type is the integer giving the count.

Note: The check is case-sensitive.

Create a Class Main which would be used to accept the two strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of two strings.
Output consists of count indicating the number of occurances.
Refer sample output for formatting specifications.

Sample Input 1:
Hello world Java is best programming language in the world
world

Sample Output 1:
2

Sample Input 2:
hello world
World

Sample Output 2:
0
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s3 = sc.next();
int count = 0;
StringTokenizer st = new StringTokenizer(s1, " ");
while (st.hasMoreElements()) {
String s2 = st.nextToken();
if (s2.equals(s3)) {
count++;
}
}
System.out.println(count);
}
}
 import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String f=sc.next();
		
			System.out.println(UserMainCode.empdis(s,f));
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class UserMainCode {
	public static int empdis(String s,String f) 
	
	{
		ArrayList<String> r=new ArrayList<String>();
		int n;
		
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
			{
			r.add(st.nextToken());
			}
		n=Collections.frequency(r, f);
		

		return n;
	 		
}
}	

37.  Reverse SubString

Given a string, startIndex and length, write a program to extract the substring from right to left. Assume the last character has index 0.

Include a class UserMainCode with a static method “reverseSubstring” that accepts 3 arguments and returns a string. The 1st argument corresponds to the string, the second argument corresponds to the startIndex and the third argument corresponds to the length.

Create a class Main which would get a String and 2 integers as input and call the static method reverseSubstring present in the UserMainCode.

Input and Output Format:
The first line of the input consists of a string.
The second line of the input consists of an integer that corresponds to the startIndex.
The third line of the input consists of an integer that corresponds to the length of the substring.

Sample Input:
rajasthan
2
3

Sample Output:
hts


import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
          String st=sc.next();
         int n1=sc.nextInt();
         int n2=sc.nextInt();
}
    }

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;


public class UserMainCode {
    
    public static String common(String sd,int n1,int n2){
        
        String st="";
        String st1="";
        StringBuffer sb=new StringBuffer(sd);
         StringBuffer sb1=new StringBuffer();
        sb.reverse();
        System.out.println(sb);
                  sb1.append(sb.substring(n1,n1+n2));
                  return sb1.toString();
        }
        }

   
or

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
int a = sc.nextInt();
int b = sc.nextInt();
StringBuffer sb = new StringBuffer(s1);
sb.reverse();
StringBuffer sb1 = new StringBuffer();
String ss = sb1.append(sb.substring(a, a + b)).toString();
System.out.println(ss);
}
}
38.  Month Name

Given a date as a string input in the format dd-mm-yy, write a program to extract the month and to print the month name in upper case.

Include a class UserMainCode with a static method “getMonthName” that accepts a String argument and returns a String that corresponds to the month name.

Create a class Main which would get the String as input and call the static method getMonthName present in the UserMainCode.

The month names are {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

Input and Output Format:
Input consists of a String.
Output consists of a String.

Sample Input:
01-06-82

Sample Output:
JUNE


import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String arg[]) throws ParseException 
    {
        Scanner sc=new Scanner(System.in);
                 String st=sc.next();
    String s=UserMainCode.common(st);
              System.out.println(s);
        }
    }

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;


public class UserMainCode {
    
    public static String common(String sd) throws ParseException{
        
        String st="";
        SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy");
        Date d=sf.parse(sd);
        SimpleDateFormat sf1=new SimpleDateFormat("MMMM");
        st=sf1.format(d);
        return st.toUpperCase();
        }
        }

or

package gokul.javarevsi.dates;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class gkdate {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
sdf.setLenient(false);
Date d1 = sdf.parse(s1);
SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
String s2 = sdf1.format(d1);
System.out.println(s2.toUpperCase());
}
}

39.  Array List Sorting and Merging
Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList.

Include a class UserMainCode with a static method sortMergedArrayList which accepts 2 ArrayLists.

The return type is an ArrayList with elements from 2,6 and 8th index position .Array index starts from position 0.

Create a Main class which gets two array list of size 5 as input and call the static methodsortMergedArrayList present in the UserMainCode.


Input and Output Format:
Input consists of two array lists of size 5.
Output is an array list .
Note - The first element is at index 0.

Refer sample output for formatting specifications.


Sample Input 1:
3
1
17
11
19
5
2
7
6
20
Sample Output 1:
3
11
19
Sample Input 2:
1
2
3
4
5
6
7
8
9
10
Sample Output 2:
3
7
9
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
ArrayList<Integer> al1 = new ArrayList<Integer>();
ArrayList<Integer> al2 = new ArrayList<Integer>();
ArrayList<Integer> al3 = new ArrayList<Integer>();
for (int i = 0; i < a; i++) {
al1.add(sc.nextInt());
}
for (int i = 0; i < a; i++) {
al2.add(sc.nextInt());
}
al1.addAll(al2);
System.out.println(al1);
Collections.sort(al1);
System.out.println(al1);
for (int i = 0; i < al1.size(); i++) {
if (i == 2 || i == 6 || i == 8) {
al3.add(al1.get(i));
}
}
System.out.println(al3);
}
}
Or
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			a.add(sc.nextInt());
		for(int i=0;i<5;i++)
			b.add(sc.nextInt());
		ArrayList<Integer> r=new ArrayList<Integer>();
		r.addAll(UserMainCode.empdis(a,b));
		for(int i=0;i<r.size();i++)
			System.out.println(r.get(i));
		
	
	}
}

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static ArrayList<Integer> empdis(ArrayList<Integer >a,ArrayList<Integer> b) 
	
	{
		ArrayList<Integer> r=new ArrayList<Integer>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		r.addAll(a);
		r.addAll(b);
		
		Collections.sort(r);
	
		res.add(r.get(2));
		res.add(r.get(6));
		res.add(r.get(8));

		return res;
	 		
}
}	

40.  String Processing - Username

Write a program to read a valid email id and extract the username.

Note - user name is the string appearing before @ symbol.

Include a class UserMainCode with a static method fetchUserName which accepts the string. The return type is the modified string.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of string.
Refer sample output for formatting specifications.

Sample Input 1:
admin@xyz.com

Sample Output 1:
admin
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
StringTokenizer st = new StringTokenizer(s1, "@");
String name = st.nextToken();
System.out.println(name);
}
}

41.  ID Validation
Write a program to get two string inputs and validate the ID as per the specified format.

Include a class UserMainCode with a static method validateIDLocations which accepts two strings as input.

The return type of the output is a string Valid Id or Invalid Id.

Create a class Main which would get the input and call the static method validateIDLocations present in the UserMainCode.

Input and Output Format:
Input consists of two strings.
First string is ID and second string is location. ID is in the format CTS-LLL-XXXX where LLL is the first three letters of given location and XXXX is a four digit number.

Output is a string Valid id or Invalid id.
Refer sample output for formatting specifications.

Sample Input 1:
CTS-hyd-1234
hyderabad
Sample Output 1:
Valid id

Sample Input 2:
CTS-hyd-123
hyderabad
Sample Output 2:
Invalid id
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.next();
StringTokenizer st = new StringTokenizer(s1, "-");
while (st.hasMoreElements()) {
String id = st.nextToken();
String loc = st.nextToken();
String xxx = st.nextToken();
if (loc.matches(s2.substring(0, 3)) && xxx.length() == 4) {
System.out.println("Valid");
} else {
System.out.println("Invalid");
}
}
}
}
42.  Mastering Hashmap

You have recently learnt about hashmaps and in order to master it, you try and use it in all of your programs.
Your trainer / teacher has given you the following exercise:
1.   Read 2n numbers as input where the first number represents a key and second one as value. Both the numbers are of type integers.
2.   Write a function getAverageOfOdd to find out average of all values whose keys are represented by odd numbers. Assume the average is an int and never a decimal number. Return the average as output. Include this function in class UserMainCode.

Create a Class Main which would be used to read 2n numbers and build the hashmap. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of a 2n+ 1 integers. The first integer specifies the value of n (essentially the hashmap size). The next pair of n numbers denote the key and value.
Output consists of an integer representing the average.
Refer sample output for formatting specifications.
Sample Input 1:
4
2
34
1
4
5
12
4
22


Sample Output 1:
8
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int sum = 0, avg = 0, count = 0, total;
HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
for (int i = 0; i < s; i++) {
hm.put(sc.nextInt(), sc.nextInt());
}
System.out.println(hm);
Iterator<Integer> itr = hm.keySet().iterator();
{
while (itr.hasNext()) {
int j = itr.next();
if (j % 2 != 0) {
sum += hm.get(j);
count++;
}
}
total = sum / count;
System.out.println(total);
}
}
}
43.  Test Vowels
Write a program to read a string and check if given string contains exactly five vowels in any order. Print “Yes” if the condition satisfies, else print “No”.
Assume there is no repetition of any vowel in the given string and all characters are lowercase.
Include a class UserMainCode with a static method testVowels which accepts a string. The return type (Integer) should return 1 if all vowels are present, else return 2.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of a string (“Yes” or “No”).
Refer sample output for formatting specifications.
Sample Input 1:
acbisouzze
Sample Output 1:
Yes

Sample Input 2:
cbisouzze
Sample Output 2:
No
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String s2 = s.replaceAll("[^aeiouAEIOU]", "");
System.out.println(s2);
HashSet<Character> hs = new HashSet<Character>();
for (int i = 0; i < s2.length(); i++) {
hs.add(s2.charAt(i));
}
System.out.println(hs);
if (hs.size() == 5) {
System.out.println("yes");
} else {
System.out.println("No");
}
}
}

44.  Regular Expression - III

Given a string (s)  apply the following rules.
I)At least 8 characters must be present
II)At least one capital letter must be present
III)At least one small letter must be present
Iv)At least one special symbol must be present
V)At least one numeric value must be present
If the condition is satisifed then print valid else print invalid.

Include a class UserMainCode with a static method passwordValidation which accepts the string. The return type is the string.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of string (valid / invalid) .
Refer sample output for formatting specifications.

Sample Input 1:
Technology$1213
Sample Output 1:
valid
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.matches
("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$!%]).{8,})"))

{
System.out.println("Valid");
} else {
System.out.println("Invalid");
}
}
}
45.  Average of Prime Locations

Write a program to read an integer array and find the average of the numbers located on the Prime location(indexes).
Round the avarage to two decimal places.
Assume that the array starts with index 0.
Include a class UserMainCode with a static method averageElements which accepts a single integer array. The return type (double) should be the average.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Double value.
Refer sample output for formatting specifications.


Assume that the maximum number of elements in the array is 20.


Sample Input 1:
8
4
1
7
6
5
8
6
9
Sample Output 1:
7.5

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int flag = 0, sum = 0;
double tot = 0, count = 0.0;
int a[] = new int[8];
for (int i = 0; i < 8; i++) {
a[i] = sc.nextInt();
}
for (int i = 0; i < 8; i++) {
flag = 0;
for (int j = 1; j <= i; j++) {
if (i % j == 0) {
flag++;
}
}
if (flag == 2) {
sum = sum + a[i];
count++;
}
}
tot = (double) (sum / count);
System.out.println(tot);
}
}
46.  Middle of Array

Write a program to read an integer array and return the middle element in the array. The size of the array would always be odd.
Include a class UserMainCode with a static method getMiddleElement which accepts a single integer array. The return type (integer) should be the middle element in the array.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Integer value.
Refer sample output for formatting specifications.


Assume that the maximum number of elements in the array is 19.


Sample Input 1:
5
1
5
23
64
9
Sample Output 1:
23

import java.util.Scanner;

public class G46{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
if(a.length%2!=0){
System.out.println(UserMainCode.getMiddleElement(a));
}
else{
System.out.println("enter the odd number of elemnts");
}

}
}
public class UserMainCode {

public static int getMiddleElement(int[] a){
int count=a.length;
return a[count/2];
}
}
47.  Negative String

Given a string input, write a program to replace every appearance of the word "is" by "is not".
If the word "is" is immediately preceeded or followed by a letter no change should be made to the string .

Include a class UserMainCode with a static method “negativeString” that accepts a String arguement and returns a String.

Create a class Main which would get a String as input and call the static method negativeString present in the UserMainCode.

Input and Output Format:
Input consists of a String.
Output consists of a String.

Sample Input 1:
This is just a misconception

Sample Output 1:
This is not just a misconception

Sample Input 2:
Today is misty

Sample Output 2:
Today is not misty

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = s1.replace(" is", " is not");
System.out.println(s2);
}
}
48.  Sum of Common Elements
Write a program to find out sum of common elements in given two arrays. If no common elements are found print - “No common elements”.
Include a class UserMainCode with a static method getSumOfIntersection which accepts two integer arrays and their sizes. The return type (integer) should return the sum of common elements.
Create a Class Main which would be used to accept 2 Input arrays and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2+m+n integers. The first integer corresponds to m (Size of the 1st array), the second integer corresponds to n (Size of the 2nd array), followed by m+n integers corresponding to the array elements.
Output consists of a single Integer corresponds to the sum of common elements or a string “No common elements”.
Refer sample output for formatting specifications.
Assume the common element appears only once in each array.

Sample Input 1:
4
3
2
3
5
1
1
3
9
Sample Output 1:
4
Sample Input 2:
4
3
2
3
5
1
12
31
9
Sample Output 2:
No common elements
import java.util.Scanner;
public class G48 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<m;i++){
b[i]=sc.nextInt();
}
int sum=UserMainCode.getSumOfIntersection(a, b);
if(sum==0){
System.out.println("No Common Elements");
}
else{
System.out.println(sum);
}
}
}
public class UserMainCode {

public static int getSumOfIntersection(int[] a,int[] b){
int sum=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<b.length;j++){
if(a[i]==b[j]){
sum=sum+b[j];
}
}
}
return sum;
}
}
49.  Regular Expression - III

Given a string (s) apply the following rules.
1. String should not begin with a number.
If the condition is satisifed then print TRUE else print FALSE.
Include a class UserMainCode with a static method validateString which accepts the string. The return type is the boolean formed based on rules.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE or FALSE .
Refer sample output for formatting specifications.

Sample Input 1:
ab2
Sample Output 1:
TRUE

Sample Input 2:
72CAB
Sample Output 2:
FALSE
import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
StringBuffer sb = new StringBuffer();
String s2 = sb.append(s1.substring(0, 1)).toString();
System.out.println(s2);
if (s2.matches("[a-z]{1}")) {
System.out.println("true");
} else {
System.out.println("False");
}
}
}
50.  Largest Chunk

Write a program to read a string and return the length of the largest "chunk" in the string.
A chunk is a repetition of same character 2 or more number of times. If the given string doest not contain any repeated chunk of characters return -1.
Include a class UserMainCode with a static method getLargestSpan which accepts the string. The return type is the integer.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
This place is soooo good
Sample Output 1:
4
import java.util.Scanner;
public class G50
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(UserMainCode.getLargestSpan(s)== -1)
{
System.out.println("No Chunks");
}
else{
System.out.println(UserMainCode.getLargestSpan(s));
}
}
}
import java.util.StringTokenizer;
public class UserMainCode {
public static int getLargestSpan(String a){
StringTokenizer st=new StringTokenizer(a," ");
int max=0;
while(st.hasMoreTokens()){
String s=st.nextToken();
StringBuffer sb=new StringBuffer(s);
for(int i=0;i<sb.length();i++){
int count=0;
for(int j=i+1;j<sb.length();j++){
if(sb.charAt(i)==sb.charAt(j)){
count++;
}
}
if(count>max){
max=count+1;
}
}
}
if(max==0){
return -1;
}
else{
return max;
}
}
}

Or


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int r=UserMainCode.getstring(s);
		System.out.println(r);
		
	

	}

}

import java.util.StringTokenizer;



public class UserMainCode {
	public static int getstring(String s) {
         
		int c=0,max=0,lar=0;

		StringTokenizer st=new StringTokenizer(s," ");
		while (st.hasMoreTokens()) {
			String v =st.nextToken();
			int l=v.length();
			for(int i=0;i<l;i++)
			{   c=0;
				for(int j=i+1;j<l;j++)
				{
					if(v.charAt(i)==v.charAt(j))
						c++;
				}
			
			if(c>max)
			{
				max=c+1;
				lar=v.length();
			}
			
		}}
		
	    
	   
	if(max>2)
		return max;
	else 
	return -1;

		
}


51.  Find Digits

For a given double number with atleast one decimal value, Write a program to compute the number of digits before and after the decimal point in the following format – noOfDigitsBeforeDecimal:noOfDigitsAfterDecimal.

Note: Ignore zeroes at the end of the decimal (Except if zero is the only digit after decimal. Refer Example 2 and 3)

Include a class UserMainCode with a static method findNoDigits which accepts the decimal value. The return type is string.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a double.
Output consists of string.
Refer sample output for formatting specifications.

Sample Input 1:
843.21

Sample Output 1:
3:2

Sample Input 2:
20.130

Sample Output 2:
2:2

Sample Input 3:
20.130

Sample Output 3:
2:2

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
String b = String.valueOf(a);
StringBuffer sb = new StringBuffer();
StringTokenizer st = new StringTokenizer(b, ".");
String c = st.nextToken();
String d = st.nextToken();
System.out.println(c);
System.out.println(d);
int x = c.length();
int y = d.length();
sb.append(x).append(':').append(y);
System.out.println(sb);
}
}
Or
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String r=UserMainCode.getstring(s);
		System.out.println(r);
		
	

	}

public class UserMainCode {
	public static String getstring(String s) {
         
		String s1,s2;

		StringTokenizer st=new StringTokenizer(s,".");
		s1=st.nextToken();
		s2=st.nextToken();
		int l1=s1.length();
		int l2=s2.length();
		String r=l1+"."+l2;
		return r;

		
}
}
}
52.  String Repetition

Write a program to read a string and an integer and return a string based on the below rules.
If input2 is equal or greater than 3 then repeat the first three character of the String by given input2 times, separated by a space.
If input2 is 2 then repeat the first two character of String two times separated by a space,
If input2 is 1 then return the first character of the String.
Include a class UserMainCode with a static method repeatString which takes a string & integer and returns a string based on the above rules.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and integer.
Output consists of a string.
Refer sample output for formatting specifications.


Sample Input 1:
COGNIZANT
4
Sample Output 1:
COG COG COG COG


Sample Input 2:
COGNIZANT
2
Sample Output 2:
CO CO
package Arrayy;

import java.util.Scanner;

public class strRepetition {

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 int n=sc.nextInt();
	 int num=n;
	 int number=n;
	 if(n>=3)
	 {
		 while(num>0)
		 {
		 System.out.print(str.substring(0,3)+" ");
		 num--;
	     }
	 }
	 else if(n<=2)
	 {
		 while(number>0)
		 {
			 System.out.print(str.substring(0,n)+" ");
			 number--;
		 }
	 }
	}

}
 
                                              53.  Kaprekar Number

Write a program to check whether the given input number is a Kaprekar number or not.
Note : A positive whole number ‘n’ that has ‘d’ number of digits is squared and split into two pieces, a right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits. If the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number.

If its Kaprekar number assign to output variable 1 else -1.
Example 1:
Input1:9
9^2 = 81, right-hand piece of 81 = 1 and left hand piece of 81 = 8
Sum = 1 + 8 = 9, i.e. equal to the number. Hence, 9 is a Kaprekar number.

Example 2:
Input1:45
Hint:
45^2 = 2025, right-hand piece of 2025 = 25 and left hand piece of 2025 = 20
Sum = 25 + 20 = 45, i.e. equal to the number. Hence, 45 is a Kaprekar number."

Include a class UserMainCode with a static method “getKaprekarNumber” that accepts an integer argument and returns an integer. The method returns 1 if the input integer is a Kaprekar number. Else the method returns -1.
Create a class Main which would get the an Integer as input and call the static method getKaprekarNumber present in the UserMainCode.

Input and Output Format:
Input consists of an integer.
Output consists of a single string that is either “Kaprekar Number” or “Not A Kaprekar Number”
Sample Input 1:
9
Sample Output 1:
Kaprekar Number
Sample Input 2:
45
Sample Output 2:
Kaprekar Number
Sample Input 3:
4
Sample Output 3:
Not A Kaprekar Number

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int x = 0, y = 0, z = 0;
int b = a * a;
String c = String.valueOf(b);
int d = c.length();
if (d == 2) {
x = b % 10;
y = b / 10;
z = x + y;
} 
else if (d == 4) {
x = b % 100;
y = b / 100;
z = x + y;
}
System.out.println(z);
if (z == a) {
System.out.println("Kaperakar number");
} else {
System.out.println("Not a Kaperakar Number");
}

}
}
54.  Start Case
Write a program to read a sentence in string variable and convert the first letter of each word to capital case. Print the final string.
Note: - Only the first letter in each word should be in capital case in final string.
Include a class UserMainCode with a static method printCapitalized which accepts a string. The return type (String) should return the capitalized string.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a strings.
Output consists of a String (capitalized string).
Refer sample output for formatting specifications.
Sample Input:
Now is the time to act!
Sample Output:
Now Is The Time To Act!

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
StringBuffer sb = new StringBuffer();
StringTokenizer st = new StringTokenizer(s1, " ");
while (st.hasMoreElements()) {
String s2 = st.nextToken();
s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1) + " ";
sb.append(s2);
}
System.out.println(sb.toString());
}
}

55.  String Concatenation
Write code to get two strings as input and If strings are of same length simply append them together and return the final string. If given strings are of different length, remove starting characters from the longer string so that both strings are of same length then append them together and return the final string.
Include a class UserMainCode with a static method concatstring which accepts two string input.
The return type of the output is a string which is the concatenated string.
Create a class Main which would get the input and call the static method concatstring present in the UserMainCode.

Input and Output Format:
Input consists of two strings.
Output is a string.
Refer sample output for formatting specifications.

Sample Input 1:
Hello
hi
Sample Output 1:
lohi


Sample Input 2:
Hello
Delhi
Sample Output 2:
HelloDelhi
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int a1 = s1.length();
		int a2 = s2.length();
		StringBuffer sb = new StringBuffer(s1);
		if (a1 == a2) {
		System.out.println(s1.concat(s2));
		} 
		else if(a2<a1)
		{
			sb.reverse();		
			String s3 = sb.substring(0, a2);
			StringBuffer sb1 = new StringBuffer(s3);
			sb1.reverse().append(s2);
			System.out.println(sb1.toString());
		}
		else
		{
			sb.reverse();		
			String s3 = sb.substring(0, a1);
			StringBuffer sb1 = new StringBuffer(s3);
			sb1.reverse().append(s2);
			System.out.println(sb1.toString());
			
		}

}
}


56.  Word Count - II

Write a program to read a string and count the number of words present in it.
Include a class UserMainCode with a static method countWord which accepts the string. The return type is the integer giving out the count of words.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
Today is Sunday
Sample Output 1:
3
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
int count = 0;
StringTokenizer st = new StringTokenizer(s1, " ");
while (st.hasMoreElements()) {
String s2 = st.nextToken();
count++;
}
System.out.println(count);
}
}
57.  Largest Difference

Write a program to read a integer array, find the largest difference between adjacent elements and display the index of largest difference.
EXAMPLE:
input1: {2,4,5,1,9,3,8}
output1: 4 (here largest difference 9-1=8 then return index of 9 ie,4)
Include a class UserMainCode with a static method checkDifference which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
2
4
5
1
9
3
8
Sample Output 1:
4
import java.util.Scanner;

public class G57{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.checkDifference(a));
}
}
import java.util.StringTokenizer;
public class UserMainCode {
	public static int checkDifference(int[] a){
	int max=0,p=0;
	for(int i=0;i<a.length-1;i++){
	int j=i+1;
	int t=Math.abs(a[i]-a[j]);
	if(t>max)
	{
	max=t;
	p=j;
	}
	}
	return p;

	}
}

58.  DOB - Validation

Write a program to validate the Date of Birth given as input in String format (MM/dd/yyyy) as per the validation rules given below. Return true for valid dates else return false.
1. Value should not be null
2. month should be between 1-12, date should be between 1-31 and year should be a four digit number.
Include a class UserMainCode with a static method ValidateDOB which accepts the string. The return type is TRUE / FALSE.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
12/23/1985

Sample Output 1:
TRUE

Sample Input 2:
31/12/1985

Sample Output 2:
FALSE

import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.matches("([1-12]{2})/([1-31]{2})/([0-9]{4})")) {
System.out.println("TRUE");
} else {
System.out.println("FALSE");
}
}
}
59.  Duplicates

GIven three integers (a,b,c) find the sum. However, if one of the values is the same as another, both the numbers do not count towards the sum and the third number is returned as the sum.

Include a class UserMainCode with a static method getDistinctSum which accepts three integers and returns integer.

Create a Class Main which would be used to accept three integers and call the static method present in UserMainCode.

Input and Output Format:

Input consists of three integers.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
1
2
1

Sample Output 1:
2

Sample Input 2:
1
2
3

Sample Output 2:
6
import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int sum = 0;
if (a == b) {
sum = c;
} else if (b == c) {
sum = a;
} else if (c == a) {
sum = b;
} else {
sum = a + b + c;
}
System.out.println(sum);
}
}

60.  Initial Format
Write a program to input a person's name in the format "FirstName LastName" and return the person name in the following format - "LastName, InitialOfFirstName".

Include a class UserMainCode with a static method nameFormatter which accepts a string. The return type (string) should return the expected format.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string that corresponds to a Person's name.
Output consists of a string(person's name in expected format).
Refer sample output for formatting specifications.
Sample Input :
Jessica Miller
Sample Output:
Miller, J
import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
StringBuffer sb = new StringBuffer();
StringTokenizer st = new StringTokenizer(s, " ");
while (st.hasMoreElements()) {
String s1 = st.nextToken();
String s2 = st.nextToken();
sb.append(s2).append(", ").append(s1.substring(0, 1));
}
System.out.println(sb);
}
}
Or
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		
		
		String r=UserMainCode.getstring(s);
		System.out.println(r);
		
	

	}}

public class UserMainCode {
	public static String getstring(String s) {
         
		
		String s1,s2;
		StringTokenizer st=new StringTokenizer(s," ");
		s1=st.nextToken();
		s2=st.nextToken();
		StringBuffer sb=new StringBuffer(s2);
		String r=sb.append(",").append(s1.substring(0,1)).toString();
		return r;
		
}
}	

61.  Remove Elements
Write a program to remove all the elements of the given length and return the size of the final array as output. If there is no element of the given length, return the size of the same array as output.

Include a class UserMainCode with a static method removeElements which accepts a string array, the number of elements in the array and an integer. The return type (integer) should return the size of the final array as output.
Create a Class Main which would be used to accept Input String array and a number and call the static method present in UserMainCode.
Assume maximum length of array is 20.
Input and Output Format:
Input consists of a integers that corresponds to n, followed by n strings and finally m which corresponds to the length value.
Output consists of a single Integer.
Refer sample output for formatting specifications.

Sample Input 1:
5
a
bb
b
ccc
ddd
2
Sample Output 1:
4
import java.util.*;
public class ClassSet28 {
public static int StringsNotOfGivenLength(List<String> l1,String s1){
int n1=s1.length();
int c=0;
for(int i=0;i<l1.size();i++)
{
int n2=l1.get(i).length();
if(n1!=n2)
c++;
}
return c;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no.of elements:");
int n=s.nextInt();
List<String> l1=new ArrayList<String>();
for(int i=0;i<n;i++)
l1.add(s.next());
System.out.println("enter the input string:");
String s1=s.next();
System.out.println(StringsNotOfGivenLength(l1,s1));
}
}

Or
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			{
			s[i]=sc.next();
			}
			
		int nt=sc.nextInt();
		int r=UserMainCode.getstring(s,nt);
		System.out.println(r);
		
	

	}}


public class UserMainCode {
	public static int getstring(String s[],int nt) {
         
		int r=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()!=nt)
				r++;
		}
		return r;
}
}	

63.  Reverse Split
Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
Include a class UserMainCode with a static method reshape which accepts a string and a character. The return type (String) should return the final string.
Create a Class Main which would be used to accept a string and a character, and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string and a character.
Output consists of a string (the final string).
Refer sample output for formatting specifications.
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R
public class Main {


public static String reversedAndParsedString(String s1,char c){
StringBuffer sb=new StringBuffer(s1);
StringBuffer sb1=new StringBuffer(s1);
sb.reverse();
for(int i=0;i<(2*s1.length())-1;i++)
if(i%2!=0)
sb1=sb.insert(i,c);
return sb1.toString();
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the String:");
String s1=s.next();
char c=s.next().charAt(0);
System.out.println("the formatted string is:"+reversedAndParsedString(s1,c));
}
}
Or
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sym=sc.next();
		
		
		String r=UserMainCode.getstring(s,sym);
		System.out.println(r);
		
	

	}}

import java.util.StringTokenizer;
public class UserMainCode {
	public static String getstring(String s,String sym) 
	{
         
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			sb.append(s.charAt(i)).append(sym);
			
		}
		String r;
		sb.reverse();
		r=sb.substring(1,sb.length());
		
		return r;
}

}

64.  Largest Key in HashMap
Write a program that construts a hashmap and returns the value corresponding to the largest key.
Include a class UserMainCode with a static method getMaxKeyValue which accepts a string. The return type (String) should be the value corresponding to the largest key.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers equals the integer key and value as string.
Output consists of a string which is the value of largest key.
Refer sample output for formatting specifications.
Sample Input 1:
3
12
amron
9
Exide
7
SF
Sample Output 1:
Amron
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.lang.*;

public class Main {

public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	HashMap<Integer, String>hm=new HashMap<Integer, String>();
	for(int i=0;i<n;i++)
	{
	hm.put(s.nextInt(),s.next());
	}
	
	System.out.println(getvalues(hm));
	}
	public static String getvalues(HashMap<Integer, String> hm) {
	int b=0,max=0;
	String s1=new String();
	
	Iterator<Integer> i= hm.keySet().iterator();
	while(i.hasNext())
	{
	b=i.next();
	if(b>max)
	{
	max=b;
	s1=hm.get(b);
	}
	}
	return s1;
}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Integer, String> re=new HashMap<Integer, String>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
			re.put(sc.nextInt(), sc.next());
		
		String r=UserMainCode.getstring(re);
		System.out.println(r);
		
	

	}}

import java.util.Map;
import java.util.Set;



public class UserMainCode {
	public static String getstring(Map<Integer, String> re) 
	{
         
		int m=0;
		String r="";
		Set<Integer> key=re.keySet();
		for(Integer l:key)
		{
			
			if(l>m)
			{
				m=l;
				r=re.get(l);
			}
		}
		
		return r;
}
}	
65.  Scores

Write a program to read a integer array of scores, if 100 appears at two consecutive locations return true else return false.
Include a class UserMainCode with a static method checkScores which accepts the integer array. The return type is boolean.
Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of a string that is either 'TRUE' or 'FALSE'.
Refer sample output for formatting specifications.

Sample Input 1:
3
1
100
100
Sample Output 1:
TRUE

Sample Input 2:
3
100
1
100
Sample Output 2:
FALSE

import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int a[] = new int[s];
for (int i = 0; i < s; i++) {
a[i] = sc.nextInt();
}
for (int i = 0; i < a.length; i++) {
if (a[i] == a[i + 1]) {
System.out.println("true");
return;
} 
else if (a[i + 1] == a[i + 2]) {
System.out.println("True");
return;
}
 else {
System.out.println("False");
return;
}
}
}
}

Or
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		String r=UserMainCode.getstring(a);
		System.out.println(r);
		
	

	}}
public class UserMainCode {
	public static String getstring(Integer a[]) 
	{
        
		String r;
		int c=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==100 && a[i+1]==100)
				c++;
		}
		if(c==1)
			r="TRUE";
		else
			r="FALSE";
		return r;
}
}	


66.  Fetching Middle Characters from String
Write a program to read a string of even length and to fetch two middle most characters from the input string and return it as string output.
Include a class UserMainCode with a static method getMiddleChars which accepts a string of even length as input . The return type is a string which should be the middle characters of the string.
Create a class Main which would get the input as a string and call the static method getMiddleChars present in the UserMainCode.
Input and Output Format:
Input consists of a string of even length.
Output is a string .
Refer sample output for formatting specifications.
Sample Input 1:
this
Sample Output 1:
hi

Sample Input 1:
Hell
Sample Output 1:
el
import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.length() % 2 == 0) {
if (s1.length() > 2) {
System.out.println(s1.substring(s1.length() / 2 - 1,
s1.length() / 2 + 1));
}
}
}
}
Or
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		
		String r=UserMainCode.getstring(n);
		System.out.println(r);
		
	

	}}

public class UserMainCode {
	public static String getstring(String s) 
	{
  
		String r;
		if(s.length()%2==0)
		r=s.substring((s.length()/2)-1,(s.length()/2)+1);
		else
			r="Please enter even no. of. characters";
		return r;
}
}	

67.  Password Validation
Given a method with a password in string format as input. Write code to validate the password using following rules:
- Must contain at least one digit
- Must contain at least one of the following special characters @, #, $
# Length should be between 6 to 20 characters.

Include a class UserMainCode with a static method validatePassword which accepts a password string as input.

If the password is as per the given rules return 1 else return -1.If the return value is 1 then print valid password else print as invalid password.

Create a Main class which gets string as an input and call the static method validatePassword present in theUserMainCode.

Input and Output Format:
Input is a string .
Output is a string .
Sample Input 1:
%Dhoom%
Sample Output 1:
Invalid password
Sample Input 2:
#@6Don

Sample Output 2:
Valid password

import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.matches("((?=.*[0-9])(?=.*[#@$])(?=.*[a-z]).{6,20})")) {
System.out.println("Valid Password");
} else {
System.out.println("Not a Valid PAssword");
}
}
}
Or
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		
	    Integer r=UserMainCode.getstring(n);
	    if(r==1)
		System.out.println("Valid");
	    else
	    	System.out.println("Not Valid");
		
	

	}}

public class UserMainCode {
	public static Integer getstring(String s) 
	{
  
	
		
		if(s.matches(".*[a-zA-Z].*") && s.matches(".*[0-9].*") && s.matches(".*[!@#$%^&*(].*") && s.length()>7 && s.length()<21)
			return 1;
		
		else
			
		return -1;
}
}	

                                                             68.  Anagrams

Write a program to read two strings and checks if one is an anagram of the other.
An anagram is a word or a phrase that can be created by rearranging the letters of another given word or phrase. We ignore white spaces and letter case. All letters of 'Desperation' can be rearranged to the phrase 'A Rope Ends It'.
Include a class UserMainCode with a static method checkAnagram which accepts the two strings. The return type is boolean which is TRUE / FALSE.
Create a Class Main which would be used to accept the two strings and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two strings.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.
Sample Input 1:
tea
eat
Sample Output 1:
TRUE

Sample Input 2:
Desperation
A Rope Ends It
Sample Output 2:
TRUE

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(UserMainCode.getstring(s1,s2));
	
	}}
import java.util.Set;
import java.util.TreeSet;



public class UserMainCode {
	public static Boolean getstring(String s1,String s2) 
	{
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		Set<String> al=new TreeSet<String>();
		Set<String> al1=new TreeSet<String>();
		
	    for(int i=0;i<s1.length();i++)
	    	al.add(String.valueOf(s1.charAt(i)));
	    for(int i=0;i<s2.length();i++)
	        al1.add(String.valueOf(s2.charAt(i)));
	   
	    if(al.equals(al1))
			return true;
		
		else
			
		   return false;
}
}	

69.  Pattern Matcher

Write a program to read a string and check if it complies to the pattern 'CPT-XXXXXX' where XXXXXX is a 6 digit number. If the pattern is followed, then print TRUE else print FALSE.

Include a class UserMainCode with a static method CheckID which accepts the string. The return type is a boolean value.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output should print TRUE or FALSE .

Refer sample output for formatting specifications.

Sample Input 1:
CPT-302020

Sample Output 1:
TRUE

Sample Input 2:
CPT123412

Sample Output 2:
FALSE

import java.io.*;
import java.util.*;

public class Main
 {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.matches("[CPT-]{4}[0-9]{6}")) 
{
System.out.println("True");
}
 else
 {
System.out.println("False");
}
}
}
Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println(UserMainCode.getstring(s1));
	
	}}


public class UserMainCode {
	public static Boolean getstring(String s1) 
	{
		if(s1.matches("([CPT]{3})([-]{1})([0-9]{6})"))
		{
			return true;
		}
		else
			return false;
}
}	

70.  Max Admissions

Write a program that reads details about number of admissions per year of a particular college, return the year which had maximum admissions. The details are stored in an arraylist with the first index being year and next being admissions count.
Include a class UserMainCode with a static method getYear which accepts a arraylist. The return type is an integer indicating the year of max admissions.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the data (year & admissions). The next n pair of numbers contains the year and admissions count.
Output consists of an integer as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
4
2010
200000
2011
300000
2012
45000
2013
25000
Sample Output 1:
2011
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
		hm.put(s.nextInt(),s.nextInt());
		}
		
		System.out.println(getvalues(hm));
		}
		public static int getvalues(HashMap<Integer,Integer> hm) {
		int b=0,max=0,c=0,d=0;
		Iterator<Integer> i=hm.keySet().iterator();
		while(i.hasNext())
		{
			b=i.next();
			c=hm.get(b);
			if(c>max)
			{
				max=c;
				d=b;
			}
		}
		return d;
		}
}
Or
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String, Integer> stud=new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
			stud.put(sc.next(),sc.nextInt());
		
		System.out.println(UserMainCode.getstring(stud));
	
	}}

import java.util.Map;
import java.util.Set;
public class UserMainCode {
	public static String getstring(Map<String, Integer> stud) 
	{   int m=0;
	String s="";
		Set<String> key=stud.keySet();
		for(String l:key)
		{
			if(stud.get(l)>m)
			{
				m=stud.get(l);
				s=l;
			}
		}
		return s;
}
}	
71.  Grade Calculator

A School wants to give assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read student details from the User. The details would include name, mark in the given order. The datatype for name is string, mark is float.
 You decide to build a hashmap. The hashmap contains name as key and mark as value.

BUSINESS RULE:
1. If Mark is less than 60, then grade is FAIL.
2. If Mark is greater than or equal to 60, then grade is PASS.
Note: FAIL/PASS should be in uppercase.
Store the result in a new Hashmap with name as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmap as input and returns the hashmap as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read student details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:

Input consists of student details. The first number indicates the size of the students. The next two values indicate the name, mark.

Output consists of a name and corresponding grade for each student.

Refer sample output for formatting specifications.

Sample Input 1:
3
Avi
76.36
Sunil
68.42
Raja
36.25

Sample Output 1:
Avi
PASS
Sunil
PASS
Raja
FAIL
import java.util.*;
public class ClassSeT23 {
public static void main(String[] args) {
Map<String, Integer> m1=new HashMap<String, Integer>();
m1.put("abc", 90);
m1.put("efg", 50);
m1.put("mno", 60);
m1.put("rst", 75);
m1.put("xyz", 35);
System.out.println(examResult(m1));
}
public static Map<String,String> examResult(Map<String, Integer> m1) {
Map<String,String> m2=new HashMap<String, String>();
String s1=new String();
String s2=new String();
int n=0;
Iterator<String> i=m1.keySet().iterator();
while(i.hasNext()){
s1=(String) i.next();
n=m1.get(s1);
if(n>=60)
s2="PASS";
else
s2="FAIL";
m2.put(s1, s2); }
return m2;
}
}
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String, Float> stud=new LinkedHashMap<String, Float>();
		for(int i=0;i<n;i++)
			stud.put(sc.next(),sc.nextFloat());
		
		System.out.println(UserMainCode.getstring(stud));
	
	}}
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class UserMainCode {
	public static Map<String, String> getstring(Map<String, Float> stud) 
	{   
		Map<String, String> s=new HashMap<String, String>();
	
		Iterator<String> it=stud.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			if(stud.get(key)>=60)
			{
				s.put(key, "PASS");
			}
			else
				s.put(key, "FAIL");
		}
		/*Set<String> key=stud.keySet();
		for(String l:key)
		{
			if(stud.get(l)>=60)
			{
				s.put(l, "PASS");
			}
			else
				s.put(l, "FAIL");
		}*/
		return s;
}
}	
	
72.  Count Vowels
Given a string input, write a program to find the total number of vowels in the given string.
Include a class UserMainCode with a static method “countVowels” that accepts a String argument and returns an int that corresponds to the total number of vowels in the given string.

Create a class Main which would get the String as input and call the static method countVowels present in the UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of an integer..

Sample Input:
avinash

Sample Output:
3
import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = s1.replaceAll("[aeiou]", "");
System.out.println(s1.length() - s2.length());
}
}
Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(UserMainCode.getstring(s));
	
	}}
public class UserMainCode {
	public static Integer getstring(String s) 
	{   
	
		String s1;
		s1=s.replaceAll("[aeiouAEIOU]", "");
		int r=s.length()-s1.length();
		return r;
}
}	

73.  Validate Number
Given a negative number as string input, write a program to validate the number and to print the corresponding positive number.
Include a class UserMainCode with a static method “validateNumber” that accepts a string argument and returns a string. If the argument string contains a valid negative number, the method returns the corresponding positive number as a string. Else the method returns -1.
Create a class Main which would get a String as input and call the static method validateNumber present in the UserMainCode.
Input and Output Format:
Input consists of a String.
Output consists of a String.
Sample Input 1:
-94923

Sample Output 1:
94923

Sample Input 2:
-6t

Sample Output 2:
-1

import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
if (s1.matches("[-0-9]{1,}")) {
int s2 = Math.abs(Integer.parseInt(s1));
String s3 = String.valueOf(s2);
System.out.println(s3);
} else {
System.out.println("-1");
}
}
}
Or
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(UserMainCode.getstring(s));
	
	}}

public class UserMainCode {
	public static String getstring(String s) 
	{   
	
		String s1;
		