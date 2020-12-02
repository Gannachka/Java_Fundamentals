package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter your name ;3");
        String name = in.next();
        System.out.printf("Hello %s \n ", name);

        for (int i = args.length - 1; i > -1; i--) {
            System.out.println(args[i]);
        }

        System.out.println("Enter count;3");
        int count = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt());
        }

        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt() + " ");
        }

        int result = 0;
        for (String v : args) {
            try {
                result += Integer.parseInt(v);

            } catch (Exception e) {
            }
        }
        System.out.print("\nResult= " + result);

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Jen");
        states.put(2, "Feb");
        states.put(3, "March");
        states.put(4, "April");
        states.put(5, "May");
        states.put(6, "June");
        states.put(7, "July");
        states.put(8, "Aug");
        states.put(9, "Sep");
        states.put(10, "Oct");
        states.put(11, "Nov");
        states.put(12, "Des");


        System.out.println("\nВведите число от 1 до 12 ");
        int k = in.nextInt();
        if (k > 0 && k < 13) {
            System.out.println(states.get(k));
        }

        System.out.println("Optional task 2");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("\n Введите числа чрез пробел");
        String numbers = scanner.nextLine();
        String[] retval = numbers.split(" ");
        String maxLength = retval[0];
        String minLength = retval[0];
        int minlength, maxlength;

        for (int i = 1; i < retval.length; i++) {
            if (maxLength.length() < retval[i].length())
                maxLength = retval[i];
        }
        maxlength = maxLength.length();
        for (int i = 1; i < retval.length; i++) {
            if (minLength.length() > retval[i].length())
                minLength = retval[i];
        }
        minlength = minLength.length();
        System.out.println(maxLength);
        System.out.println("Длина максимального числа" + maxlength);
        System.out.println(minLength);
        System.out.println("Длина минимального числа" + minlength);


        for (int i = retval.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (retval[j].length() > retval[j + 1].length()) {
                    String temp = retval[j + 1];
                    retval[j + 1] = retval[j];
                    retval[j] = temp;
                }
            }
        }


        for (int i = 0; i < retval.length; i++) {
            System.out.println(retval[i]);
        }
        for (int i = retval.length - 1; i > 0; i--) {
            System.out.println(retval[i]);
        }

        double sumLength=0;
        for (int i = 0; i < retval.length; i++) {
            sumLength=sumLength+ retval[i].length();

        }
        System.out.println(sumLength);
        double averageLength = sumLength/retval.length;
        System.out.println("Среднняя длина"+averageLength);
        System.out.println("Числа, длина которых меньше средней длины:");
        for (int i=0; i< retval.length;i++){
            if(retval[i].length()< averageLength)
                System.out.println(retval[i]+" длина "+retval[i].length());
        }
        System.out.println("Числа, длина которых больше средней длины:");

        for (String s : retval) {
            if (s.length() > averageLength)
                System.out.println(s + " длина " + s.length());
        }

        String result1 ="", unique="" , increaseNumbers="";
        int countOfDigit=11;
        String tempArr ="";
        for (String number:retval) {
            tempArr="";
            for (String digit:number.split("")) {
                if(!tempArr.contains(digit))
                {
                    tempArr+=digit;
                }
            }
            if(countOfDigit>tempArr.length())
            {
                result1=number;
                countOfDigit=tempArr.length();
            }
            else
            {
                unique=number;
                countOfDigit=tempArr.length();
            }

        }
        System.out.println("Число с наименьшим совпадением"+result);

        int countOfEvenNumbers =0, countOfOddAndEvenNumbers=0;
        String EvenArr="", OddAndEvenNumbers="",OddNumbers="", EvenNumbers="";

        for (String num:
                retval) {
            EvenArr="";
            OddAndEvenNumbers="";
            EvenNumbers="";
            OddNumbers="";
            for (String digit:
                    num.split("") ) {
                OddAndEvenNumbers+=digit;
                if(Integer.parseInt(digit)%2==0)
                    EvenArr += digit;
            }
            for(String even:
                    OddAndEvenNumbers.split("")){
                if(Integer.parseInt(even)%2==0)
                    EvenNumbers+= even;
                else
                    OddNumbers += even;

            }
            if(EvenArr.length()==num.length())
                countOfEvenNumbers++;
            if(EvenNumbers.length()==OddNumbers.length())
                countOfOddAndEvenNumbers++;

        }
        System.out.println("Количество чисел с Чётными цифрами"+countOfEvenNumbers);
        System.out.println("Количество чисел с одинаковым количеством чётных и нечётных чисел "+countOfOddAndEvenNumbers);
        System.out.println("Число с разными циырами"+unique);

    }
}
