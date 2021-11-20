package examplesFromLectures.PrimitiveType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;


    // Класс, который будет вызывать все методы, для данного класса мы создали обьект в классе BaseOperationMain,
    // который ранится

public class PrimitiveType {

    public void run() {
        System.out.println("BaseOperationsMain.main");
        //number();
        //character();
        //array();
        //circle();
        //inc();
        edition();
    }

//________________________________________________

    //Булевые выражения

    private void edition() {

        int i = 3;

        if (i == 0) {
        } else if (i == 1 && i != 20) { // можно указывать дополнительные условия
        } else if (i == 2 || i <= 100 || (i == 2 || i <= 100)) { //так лучше не писать, а так, как лучше*
        } else if (i == 3) {
        } else {
        }

        // лучше*

        /*
        boolean first = i == 2 || i <= 100; //так можно отдельно выносить выражение, а потом исп. его в условии, чтобы не загромождать
        boolean second = i == 2 || i >= 0;

        if (i == 0) {}
        else if(first || second) {}
        else {}

         */

//________________________________________________

        //Пример работы со свичём


        switch (i) { //switch сразу прыгает к необходимому кейсу и выходит
            case 0 : {} break;
            case 1 : {} break;
            case 3 : {} break;
            default: {} break; //если кейсы не подходят - попадаем в дефолт
        }

 //__________________________________________________

        //тернарные операторы

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // чтобы вводить с
        // клавиатуры
        try {
            String text = bufferedReader.readLine(); // считываем
            int value = Integer.parseInt(text); // присваеваем значение, которое считали
            if (value > 10){ // указываем условие
                System.out.println(" > 10"); // то выводим это
            } else {
                System.out.println(" < 10"); // то выводим это
            }

            String res = value > 10 ? " > 10" : " < 10"; // используем тернарный оператор, т.е. выводиться первое или второе
            System.out.println("res = " + res);

        } catch (IOException e){
            e.printStackTrace();
        }

//___________________________________________________

        // так выглядят сдвиги
        System.out.println(14 * 2); //28
        System.out.println(14 << 1);//тоже 28, умножаем на самого себя. Сдвиг влево - деление
    }

//________________________________________________

    //Как работать с инкрементом/дикрементом

    private void inc(){
        int i = 10;
        //i++; // сначало использет число, а потом добавляет / инициализорует, потом присваивает
        //++i; // сначала присвоет, потом распечатает / присваевает, потом инициализирует

        System.out.println(i++); // сначала инициализирует, потом присв. 1
        System.out.println("i = " + i);

        System.out.println();

        System.out.println(++i); // сразу приплюсовывает 1
        System.out.println("i = " + i);
    }

//___________________________________________________

        //Работа с циклами

    private void circle(){

        int i = 10;
        // пример обычного цикла
        for (int j = 0 /*старт счётчика*/; j <=i /*условие выхода */; j++ /*итератор*/) {
            System.out.println("j = " + j);
        }

        System.out.println();

        for (int j = 0; j <= i; j+=2) {
            System.out.println("j = " + j);
        }

        System.out.println();

       /* int z = 7;
        for (int j = 0; j <= z || z != 6; j++) { //как задать дополнительное условие + будет бесконечный цикл, тк
            //расспечатает все варианты, при которых j <= z и z != 6
            System.out.println("j = " + j);
        } */

        //также можно вынести j во внешнюю переменную

        int j = 0;
        int s = 5;
        for (; j < s; j++) {
            System.out.println("j = " + j);
        }

        System.out.println();

        // Пример работы с while

        int a = 0;
        while (a != 10 ){
            System.out.println("a = " + a);
            ++a;
        }

        System.out.println();
    }

//________________________________________________

    //Пример того, что все символы имеют своё бинарное значение

    private void character() {
        char i = 'i';
        System.out.println("i = " + i);
        System.out.println("i = " + (int)i);
    }

//________________________________________________

    //Пример того, для чего нам нужны массивы

    private void array(){
        int[] ints = new int[10]; //в тех местах, которые зарезервированы, будет храниться 0
        ints[0] = 10;
        ints[3] = 16;

        // ints[10] = 10; //здесь мы получим ексепшн, тк вышл за пределы массива

        for (int anInt : ints) {
            System.out.println("snInt = " + anInt); //выводим содержимое массива
        }

        //Пример того, как мы ещё можемо инициализировать массив

        int[] arr = { 0, 3, 0, 3, 3 };
        for (int i : arr){
            System.out.println("i = " + i);
        }

        //Пример работы с двумерным масивом. В таком массиве каждая ячейка вмещает отдельный массив

        int[][] doubleArr = new int[3][];
        // мы можем каждую из ячеек массива инициализировать
        doubleArr[0] = new int [10];
        doubleArr[1] = new int [1];
        doubleArr[2] = new int [8];

        //Также, можем двумерный массив инициализировать таким образом:
        int [][] dArr ={
                {2, 3, 5, 7},
                {1, 9, 10},
                {3, 4},
                {4, 2, -7}
        };
        //теперь его выводим:
        for (int i = 0; i < dArr.length; i++) { //бежим по внешнему массиву (те размер нашего массива 3
            for (int j = 0; j < dArr[i].length; j++) { //бежим по внутреннему массиву (то, что лежит внутри)

            }
        }

        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        String hello = "hello";

        for(char c:hello.toCharArray()){ // показываем, что стринг - это массив чаров
            System.out.println("c = " + c);
        }

    }

//________________________________________________

    private void number() {

        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;
        System.out.println("bMax = " + bMax);
        System.out.println("bMin = " + bMin);

        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;

        System.out.println("sMax = " + sMax);
        System.out.println("sMin = " + sMin);

        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;

        System.out.println("iMin = " + iMin);
        System.out.println("iMin = " + iMax);

        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;

        System.out.println("lMin = " + lMin);
        System.out.println("lMax = " + lMax);

        System.out.println((byte) (bMax + 1));
        System.out.println((byte) (bMax + bMax));

//____________________________________________________________

        // Представляем в 0 и 1 какое-то число.
        // К примеру, значение до максимального значения Byte и как это выглядит в бинарном варианте

        String byteString = Integer.toBinaryString(iMin);
        System.out.println("byteString = " + byteString);

        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            System.out.println(i + " = " + Integer.toBinaryString(i)); //здесь превращаем в бинарное число
        }

//____________________________________________________________

        //Пример того, как работать с большими числами, которые выходят за приделы long
        // !!! нужно помнить, что в любом случае это будет обьект, а не большое число

        System.out.println(Long.MAX_VALUE + Long.MAX_VALUE);

        BigInteger left = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger right = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger sum = left.add(right);
        BigInteger mul = left.add(right);

        System.out.println(sum);
        System.out.println("mul = " + mul);

//____________________________________________________________

        //Пример того, что остаток нужно хранить отдельно, иначе в остаток не округляется

        double res = 2.0 - 1.0;
        System.out.println("res = " + res);
        res = 2.0 - 1.1;
        System.out.println("res = " + res);
        res = 200.10 - 10.05;
        System.out.println("res = " + res);

//____________________________________________________________

        //Пример того, как делать так, чтобы округляло

        BigDecimal l = new BigDecimal("200.10");
        BigDecimal r = new BigDecimal(("10.05"));
        BigDecimal sub = l.subtract(r);
        System.out.println("sub = " + sub);
    }
}
