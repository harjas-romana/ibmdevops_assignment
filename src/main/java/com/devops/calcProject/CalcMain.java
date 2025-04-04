package com.devops.calcProject;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class CalcMain
{
static final Logger logger = Logger.getLogger(CalcMain.class);
public static void main( String[] args )
{
BasicConfigurator.configure();
int a,b,choice;
float result=0;
Scanner in=new Scanner(System.in);
a=Integer.parseInt(args[0]);
logger.info("First number: "+a);
b=Integer.parseInt(args[1]);
logger.info("Second number: "+b);
logger.info("\n1: Addition.\n2: Subtraction.\n3: Multiplication.\n4: Divide.\n5: Remainder.\n6: Exit.");
choice=Integer.parseInt(args[2]);
logger.info("\nYour choice: "+choice);
switch(choice)
{
case 1:
result=addition(a,b); break;
case 2:
result=subtraction(a,b); break;
case 3:
result=multiplication(a,b); break;
case 4:
result=division(a,b); break;
case 5:
result=remainder(a,b); break;
default:
logger.info("An Invalid Choice!!!\n");
}
if(choice>=1 && choice<=5)
logger.info("Result is: " + result);
}
public static int addition(int a,int b) {
return a+b;
}
public static int subtraction(int a,int b) {
return a-b;
}
public static int multiplication(int a,int b) {
return a*b;
}
public static float division(int a,int b) {
return (float)((float)a/(float)b);
}
public static int remainder(int a,int b) {
return a%b;
}
}
