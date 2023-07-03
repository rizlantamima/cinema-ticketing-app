package dev.rizlantamima.cinema.presentations.cli;

import dev.rizlantamima.cinema.configurations.I18n;
import dev.rizlantamima.cinema.entities.Cinema;
import dev.rizlantamima.cinema.presentations.cli.components.UtilsComponent;
import dev.rizlantamima.cinema.services.CinemaService;

import java.util.Scanner;

public class CinemaCliPresentation {

    CinemaService cinemaService;
    private Scanner scanner =  new Scanner(System.in);
    public CinemaCliPresentation(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    public void initCinema(){
        System.out.println(I18n.getMessage("askCinemaName") + " :");
        askCinema();
        landing();
    }

    private void landing() {
        String cinameName = this.cinemaService.getCinema().getName().toUpperCase();
        UtilsComponent.showBanner(I18n.getMessageF("welcome",cinameName));
    }


    private void askCinema(){
        System.out.println(I18n.getMessage("askCinemaName") + " :");
        this.cinemaService.initCinema(scanner.nextLine());
        if (this.cinemaService.getCinema() == null) {
            askCinema();
        }
    }
}
