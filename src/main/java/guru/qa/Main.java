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
        float aFloat = 0.0f;
        double aDouble = 0.0;
        // Символьный
        char aChar = 'a';
        // Логический
        boolean aBoolean = true;
        // Строка
        System.out.println("Hello and welcome!");

        // Опираторы

        // Опиратотор присвоеноние (=)
        String name = "ARTEM";
        // Арифметические операторы (+ - / * % ++ --)
        System.out.println(3 + 2);
        // Оператоты сравнения (<, >, >=, <=, !=, ==)
        System.out.println(3 > 2);
        // Логические операторы (&, |, &&, ||, !)
        // Оператор instanceof
        // Тернарный оператор = где можно (есть возможность) вернуть какой - то результат.
        char sex = 'm';
        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";
        // Управляющая конструкция (if)
        if (sex == 'm') {
            childName = "Valentin";
        } else {
            childName = "Valentina";
        }


    }
}