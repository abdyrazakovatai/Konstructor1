import java.util.Arrays;

public class MyClass {
    String name;
    String lastName;
    int age;
    String[] lessons;
    String food;


    public MyClass(String name, String lastName, int age, String[] lessons) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lessons;
    }

    public MyClass(String name, String lastName, int age, String[] lessons, String food) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lessons;
        this.food = food;

    }

    public String getInfo() {
        return String.format("""
                Student
                name: %s
                last name: %s
                age: %d
                Lessons: %s
                food: %s
                """, name, lastName, age, lesson(), food);
    }

    public String lesson() {
        return Arrays.toString(lessons);
    }
}


