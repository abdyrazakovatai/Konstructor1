//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] lesson = {"Java 15", "English"};

        MyClass myClass1 = new MyClass("Atai", "Abdyrazakov", 19, lesson, "Kuurdak");
        MyClass myClass2 = new MyClass("Atai", "Abdyrazakov", 19, lesson);
        myClass2.food = "BeshBarmak";

        MyClass[] array = {myClass1, myClass2};

        for (MyClass myClass : array) {
            System.out.println(myClass.getInfo());
        }
    }
}
