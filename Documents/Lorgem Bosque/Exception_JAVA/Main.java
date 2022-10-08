import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> people = new ArrayList<String>();

        Person<String> personFirst = new Person<String>();
        personFirst.setMyName("Lorgem Bosque ");
        personFirst.setMyDetails("Music Lover and Fine");
        personFirst.setMyVehicle("I want to collect boys and cars");
        people.add("\"" + personFirst.getMyName() + "\"" + " I am " + personFirst.getMyDetails() + " and "
                + personFirst.getMyVehicle());

        Person<String> personSecond = new Person<String>();
        personSecond.setMyName("Jerica Libradilla");
        personSecond.setMyDetails("Humble and Thoughtful");
        personSecond.setMyVehicle("She loves driving bikes.");
        people.add("\"" + personSecond.getMyName() + "\"" + " I am " + personSecond.getMyDetails() + " and "
                + personSecond.getMyVehicle());

        Person<String> personThird = new Person<String>();
        personThird.setMyName("Dulce Iran");
        personThird.setMyDetails("Strict and Caring");
        personThird.setMyVehicle("I love driving Cars.");
        people.add("\"" + personThird.getMyName() + "\"" + " I am " + personThird.getMyDetails() + " and "
                + personThird.getMyVehicle());

        Person<String> personFourth = new Person<String>();
        personFourth.setMyName("Boy Iran");
        personFourth.setMyDetails("Wise and Strict");
        personFourth.setMyVehicle("I love driving motorcycle.");
        people.add("\"" + personFourth.getMyName() + "\"" + " I am " + personFourth.getMyDetails() + " and "
                + personFourth.getMyVehicle());

        Person<String> personFifth = new Person<String>();
        personFifth.setMyName(" Gemma Iran");
        personFifth.setMyDetails("Silent and Dangerous");
        personFifth.setMyVehicle("I love driving Motorcycles.");
        people.add("\"" + personFifth.getMyName() + "\"" + " I am " + personFifth.getMyDetails() + " and "
                + personFifth.getMyVehicle());

        System.out.print("     [0,1,2,3,4]");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new PersonException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new PersonException("Your input exceeds the size of the arraarray.");
            }

            System.out.println("Index number: " + input);
            System.out.println(people.get(input));

        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }


 {
    
}
}