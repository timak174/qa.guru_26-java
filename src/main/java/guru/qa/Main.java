package guru.qa;

public class Main {
    public static void main(String[] args) {
        // Целочисленные типы = можно хранить числа со знаком(плюс - мин).
        // Отличаются размером и диапозоном тех чисел которые в них могу хранится.
        // Диапозон хранения (бит) вычеляется по формуле (-2^ степени bit...(+2^ в степени bit - 1))
        byte aByte = 0;  // -128 + 127 (8бит)
        short aShort = 0; // -32768 + 32767 (16 бит)
        int aInt= 0; // -14 милиардов + 14 милиардов (32 бит)
        long aLong = 0; // биллиард и.т.д. (64 бит)
        // Типы с влавающей точкой
        float aFloat = 0.0;
        double aDouble = 0.0;
        // Символьный
        char aChar = 'a';
        // Логический
        boolean aBoolean = true;
        // Строка
        String aString = "string";


        System.out.print("Hello and welcome!");
    }
}