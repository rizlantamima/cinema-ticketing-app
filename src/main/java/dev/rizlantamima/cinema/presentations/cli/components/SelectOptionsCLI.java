package dev.rizlantamima.cinema.presentations.cli.components;

import dev.rizlantamima.cinema.configurations.I18n;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectOptionsCLI {
    private String[] options;
    private String question;

    private int optionSelected;

    public SelectOptionsCLI(String[] options) {
        this.options = options;
        this.question = I18n.getMessage("optionQuestions");
    }
    public SelectOptionsCLI(String question, String[] options) {
        this.options = options;
        this.question = question;
    }

    public int start() {
        printOptions();
        System.out.println();
        System.out.printf(this.question + " ");
        listenForArrowKeys();
        return optionSelected;
    }

    private void printOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+". " + options[i]);
        }
    }

    private void listenForArrowKeys() {
        try {
            Scanner scanner =  new Scanner(System.in);
            optionSelected = scanner.nextInt();
            // Consuming the leftover new line
            // using the nextLine() method
            scanner.nextLine();
            if (optionSelected > options.length){
                invalidSelection();
            } else {
                optionSelected -= 1;
            }
        } catch (InputMismatchException e) {
            invalidSelection();
        }
    }

    private void invalidSelection(){
        System.out.println(I18n.getMessage("optionInvalidSelection"));
        System.out.println();
        System.out.println(I18n.getMessage("tryAgain"));
        start();
    }
}
