package dev.rizlantamima.cinema.presentations.cli.components;

public class UtilsComponent {

    public static void showBanner(String word){
        word = " " + word + " ";
        int totalCharacter = 100;

        int space = ((totalCharacter - word.length()) / 2) - 1;

        System.out.println();
        System.out.printf("%s%s%s%n", "=".repeat(space), word, "=".repeat(space));
        System.out.println();
    }
}
