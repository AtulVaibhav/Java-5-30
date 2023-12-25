package com.javaLearning;

public class Operators {
   public static void arithmeticOperators(){
	   int a =10;
	   int b=5;
	   System.out.println("Addition :"+(a+b));
	   System.out.println("Substraction :"+(a-b));
	   System.out.println("Multiplication :"+(a*b));
	   System.out.println("Division :"+(a/b));
	   System.out.println("Modulus :"+(a%b));
   }
   public static void unaryOperators(){
	   int a=10;
	 System.out.println("Unary Minus :"+(-a));
	 int b = a++;
	 System.out.println("Value of a :"+a+" Value of b :"+b);
     
	 int c = 12;
	 int d = ++c;
	 System.out.println("Value of c :"+c+" Value of d :"+d);
   
   
   }
   
   public static void relationalOperators(){
	   int a = 10;
	   int b=12;
	   System.out.println("Greater than :"+(a>b));
	   System.out.println("Lesser than :"+(a<b));
	   System.out.println("Greater than equal to :"+(a>=b));
	   System.out.println("Lesser than equal to :"+(a<=b));
	   System.out.println("Equal to :"+(a==b));
	   System.out.println("Not equal to :"+(a!=b));
   }
   
   public static void logicalOperators(){
	   int x=10;
	   int y = 20;
	   System.out.println("AND operation:"+((x<y)&&(x!=y)));
       System.out.println("OR operation :"+((x!=y)||(x<y)));
       System.out.println("NOT operation :"+ (!(x!=y)||(x==y)));
   }
   
   
   public static void bitwiseOperators(){
	   int x = 10;
	   int y = 15;
	   System.out.println("Bitwise AND :"+(x&y));
	   System.out.println("Bitwise OR :"+(x|y));
	   System.out.println("Bitwise XOR :"+(x^y));
	   System.out.println("Bitwise Compliment :"+(~x));
   }
   public static void shiftOperators(){
	   int x=10;
	   int x1 = 20;
	   System.out.println("Left shift :"+(x<<2));
	   System.out.println("Right shift :"+(x1>>2));
   }
   
   
   public static void instanceOf(){
	   String str = "Java";
	   System.out.println(str instanceof String);
   }
	public static void main(String[] args) {
	  Operators.arithmeticOperators();
     Operators.unaryOperators();
     Operators.relationalOperators();
     Operators.logicalOperators();
     Operators.bitwiseOperators();
     Operators.shiftOperators();
     Operators.instanceOf();
	}

}
