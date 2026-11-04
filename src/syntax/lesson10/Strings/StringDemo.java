package syntax.lesson10.Strings;

public class StringDemo {
    static void main(String[] args) {
        String strName = "Andrey";
        String strLastName = new String("Bogachev");
        System.out.println(strName + " " + strLastName);

        //equals
        String firstString = "Java";
        var secondString = "java";
        System.out.println("Is two strings equals: " + firstString.equals(secondString));
        System.out.println("Is two strings equalsIgnoreCase: " + firstString.equalsIgnoreCase(secondString));

        System.out.println("The length of strName: " + strName.length());

        String greeting = "Hello, world!";
        String substring = greeting.substring(
                greeting.indexOf("w"),
                greeting.indexOf("!")
        );
        System.out.println(substring);

        System.out.println("Original: " + greeting);
        String greetingToUpperCase = greeting.toUpperCase();
        System.out.println("To upper: " + greetingToUpperCase);
        String greetingToLowerCase = greeting.toLowerCase();
        System.out.println("To lower: " + greetingToLowerCase);

        System.out.println("The string contains \"WORLD\": " + greetingToUpperCase.contains("WORLD"));

        var login = "  andrey_bogachev    ";
        String loginAfterTrim = login.trim();
        System.out.println("loginAfterTrim: " + loginAfterTrim);

        var loginAfterReplace = login.trim().replace('_', '.');
        System.out.println("loginAfterReplace: " + loginAfterReplace);

        StringBuilder sb = new StringBuilder("Hello, ");
        sb.append("Andrey");
        System.out.println(sb);

    }
}
