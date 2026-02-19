package HW11;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 30, "Інженер");
        Person p2 = new Person("Mary", 25, "Вчитель");
        Person p3 = new Person("Bob", 35, "Лікар");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3 + "\n");

        Person alice = new Person("Alice", 28, "Архітектор");
        System.out.println(alice);

        alice.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(alice);
    }
}
