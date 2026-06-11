package guru.qa;

public class Main2 {

    //Базовй метод вызова переменных

    //    public  static  void  main(String[] ages){
//       ArtemFirstProgram artemFirstProgram = new ArtemFirstProgram();
//        System.out.println("Name: " + artemFirstProgram.name);
//        System.out.println("age: " + artemFirstProgram.age);
//        System.out.println("Cute: " + artemFirstProgram.isCute);
//
//        artemFirstProgram.name = "Artem";
//        artemFirstProgram.age = 38;
//        artemFirstProgram.isCute = true;
//
//        System.out.println("Name: " + artemFirstProgram.name);
//        System.out.println("age: " + artemFirstProgram.age );
//        System.out.println("Cute: " + artemFirstProgram.isCute);
    //Команда для вывыода полей из ArtemFirstProgram с методом toString
//        System.out.println();
//    }
//}

    //Контсруктор чтобы он работал нужно в скобки поместить переменные
    public static void main(String[] ages) {
        ArtemFirstProgram artemFirstProgram = new ArtemFirstProgram(
                "Artem",
                340,
                true
        );
        System.out.println(artemFirstProgram);
    }
}