public class Oop {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
Person person1 = new Person ("Doğan", "Keleş", 29);
person1.salary = 40000;
        System.out.println(person1);
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
