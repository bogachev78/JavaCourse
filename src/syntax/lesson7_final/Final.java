package syntax.lesson7_final;

public class Final {
    static void main(String[] args) {
        int firstInt = 4, secondInt = 8;

        secondInt = 15;
        System.out.println("firstInt: " + firstInt + ", secondInt: " + secondInt);

        final var nameOfBoss = "Andrey Bogachev";
//        nameOfBoss = "Andrey";
        System.out.println(nameOfBoss);
    }
}
