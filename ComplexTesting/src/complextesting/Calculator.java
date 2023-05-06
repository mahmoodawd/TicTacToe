/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complextesting;


public class Calculator
{
public static void main(String [] args)
{
double num1 = Double.parseDouble(args[0]);
String operator = args[1];
double num2 = Double.parseDouble(args[2]);
double result = 0;


}

public String calculator(int num1 , int num2,String operator)
{

switch(operator)
{
case "+" : 
return String.valueOf(num1 + num2);


case "-" : 
return String.valueOf(num1 - num2);

case "*" : 
return String.valueOf(num1 * num2);

case "/" : 
return String.valueOf(num1 / num2);

default:
return "error";
}

}
}
