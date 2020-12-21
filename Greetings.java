public class Greetings {
    private static Intro word = new Intro();

    public static void main(String[] args) {
        System.out.println("Hello World" + word.getWord());
    }
}