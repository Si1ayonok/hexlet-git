import java.util.*;
/*Реализуйте метод, который определяет, является ли переданное число натуральной
степенью тройки. Например, число 27 – это третья степень (3^3), 
а 81 – четвёртая (3^4).*/
public class Main {
  public static boolean isPowerOfThree(double number) {
      double num = 1;
      if (number >= 1) {
        for (int i = 3; i <= number; i *= 3) {
        num = num * 3;
        }
          if (num == number) {
          return true;
          }
        return false;
      }
      if (number < 1) {
        return false;
      }
      return false;
  }
    public static void main(String[] args) {
  System.out.println(isPowerOfThree(1));

    }
  }
import java.util.*;
/*Напишите метод diff(), который принимает два угла (integer), 
каждый от 0 до 360, и возвращает разницу между ними.
Угол между лучами измеряется двумя способами*/
public class Main {
  public static int diff (int integer1, int integer2) {
     if (integer1 <= 0 || integer1 >= 360 || integer2 <= 0 || integer2 >= 360) {
        return 0;
      }
     else if (integer1 >= integer2) {
        return integer1 - integer2;
      }
     return integer2 - integer1;
    }

    public static void main(String[] args) {
    System.out.println(diff(120, 480));

    }
  }
import java.util.*;
/*ДНК и РНК — это последовательности нуклеотидов.
Четыре нуклеотида в ДНК это аденин (A), цитозин (C), гуанин (G) и тимин (T).
Четыре нуклеотида в РНК это аденин (A), цитозин (C), гуанин (G) и урацил (U).
Цепь РНК составляется на основе цепи ДНК последовательной заменой каждого 
нуклеотида: G -> C; C -> G; T -> A; A -> U
Реализуйте метод, который принимает на вход цепь ДНК и возвращает соответствующую цепь РНК.
Если во входном параметре нет ни одного нуклеотида, то функция должна вернуть пустую строку. 
Если в переданной цепи ДНК встретится "незнакомый" нуклеотид, то функция должна вернуть null.*/
public class Main {
  public static String dnaToRna(String str) {
     var result = "";
     var i = 0;
     while (i < str.length()) {
        if (str.charAt(i) == 'G') {
        result = result + 'C';
        }
        else if (str.charAt(i) == 'C') {  
        result = result + 'G';
        }
        else if (str.charAt(i) == 'T') {
        result = result + 'A';
        }  
        else if (str.charAt(i) == 'A') {  
        result = result + 'U';
        } 
        else if (str == "") {  
        result = "";
        }
        else {
        result = null;
        break;
        }
       i++;
     }
   return result; 
  }
    public static void main(String[] args) {
    System.out.println(dnaToRna("ACNTG"));

    }
  }
import java.util.*;
/*Реализуйте метод isBalanced(),который принимает на вход строку, 
состоящую только из открывающих и закрывающих круглых скобок, и проверяет, 
является ли эта строка корректной. Пустая строка считается корректной.
Строка считается корректной, если содержащаяся в ней скобочная структура 
соответствует требованиям:
Скобки — это парные структуры. У каждой открывающей скобки должна быть 
соответствующая ей закрывающая скобка.
Закрывающая скобка не должна идти впереди открывающей. Такой вариант недопустим )(,
а вот такой допустим ()().*/
public class Main {
  public static boolean isBalanced(String str) {
     var i = 0;
     var count1 = 0;
     var count2 = 0;
        while (i < str.length()) {
          if (str.charAt(0) == ')' || str.charAt(str.length() - 1) == '(') {
            // строка не может начинаться закрывающейся скобкой или заканчиваться на открывающуюся
            return false;
          }
          if (str.charAt(i) == '(') {
            // Считаем только подходящие символы открывающей скобки
            count1 = count1 + 1;
          }
          if (str.charAt(i) == ')') {
            // Считаем только подходящие символы закрывающей скобки
            count2 = count2 + 1;
          }
          i++;
        }
        if (count1 == count2 || str == "") {
          return true;
          }
        return false;
        }  

    public static void main(String[] args) {
    System.out.println(isBalanced(""));

    }
  }
import java.util.*;
/*Реализуйте метод fizzBuzz(), который выводит на экран числа в диапазоне от
begin до end. При этом:
Если число делится без остатка на 3, то вместо него выводится слово Fizz
Если число делится без остатка на 5, то вместо него выводится слово Buzz
Если число делится без остатка и на 3, и на 5, то вместо числа выводится слово FizzBuzz
В остальных случаях выводится само число
Метод принимает два параметра (begin и end), определяющих начало и конец диапазона
(включительно). Если диапазон пуст (в случае, когда begin > end), то метод просто
ничего не печатает.*/
public class Main {
  public static String fizzBuzz(int begin, int end) {
    var result = "";
    int i = begin;
     while(i <= end) {
        if (i % 5 == 0 && i % 3 == 0) {
        result =  result + "\n" + "FizzBuzz" ;
        }
        else if (i % 5 == 0) {
        result =  result + "\n" + "Buzz" ;
        }
        else if (i % 3 == 0) {
        result =  result + "\n" + "Fizz" ;
        }
        else {
        result = result + "\n" + i;
        }
      i++;
        
      }
      return result;
  }

    public static void main(String[] args) {
    System.out.println(fizzBuzz(10, 20));

    }
  }
import java.util.*;
/*Реализуйте метод addDigits(), который принимает на вход неотрицательное целое 
число и возвращает другое число, полученное из первого следующим преобразованием:
Итеративно сложите все входящие в него цифры до тех пор пока, не останется одна цифра.*/
public class Main {
  public static int addDigits(int number) {
    int digit = 0;
    int result = 0;
    if (number > 0 && number < 10) {
      return number;
    }
    if (number >= 10) {
      while (number != 0) {
      digit = number % 10; 
      result = result + digit;
      result = newNumber(result);
      number = number / 10;
      }
    }
    else {
    return 0;
    }
    return result;
  }
  public static int newNumber(int number) {
    int result = 0;
    if (number > 0) {
      while (number != 0) {
      result = result + number % 10;
      number = number / 10;
      }
    }
    return result;
  }

    public static void main(String[] args) {
    System.out.println(addDigits(87945));
    

    }
  }
