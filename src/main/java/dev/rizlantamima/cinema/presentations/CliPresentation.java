package dev.rizlantamima.cinema.presentations;

import dev.rizlantamima.cinema.utils.BannerUtils;

import java.util.Scanner;

public class CliPresentation implements CommonPresentation{
    private Scanner scanner = new Scanner(System.in);

    public void init() {
        BannerUtils.displayBanner();
        System.out.println("Press any key to continue...");
        scanner.nextLine();
    }

    public void landing() {

    }

    public void run() {

    }
}
