package guru.qa;
    //Базовй метод вызова переменных.
//public class ArtemFirstProgram {
//    String name;
//    int age;
//    boolean isCute;

//Инкопсуляция метод private
public class ArtemFirstProgram {
    private final String name;
    private final int age;
    private final boolean isCute;
//Конструктор
    public ArtemFirstProgram(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    //Метод @Override переопределение(перекрытие) базовый метод, своим.
    @Override
    //Метод toString переопряделяет выведит все поля нашего объекта.
    public String toString() {
        return "ArtemFirstProgram{" +
                "name='" + name + '\'' +
                ", age=" + age + ", isCute=" + isCute +
                '}';
    }
}


