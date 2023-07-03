package dev.rizlantamima.cinema.presentations.cli;

import dev.rizlantamima.cinema.configurations.I18n;
import dev.rizlantamima.cinema.presentations.CommonPresentation;
import dev.rizlantamima.cinema.presentations.cli.components.SelectOptionsCLI;
import dev.rizlantamima.cinema.services.CinemaService;
import dev.rizlantamima.cinema.services.SeatService;

import java.util.Locale;

public class CliPresentation implements CommonPresentation {

    private CinemaService cinemaService;
    private CinemaCliPresentation cinemaCliPresentation;
    private SeatService seatService;

    public CliPresentation(CinemaService cinemaService, SeatService seatService) {
        this.cinemaService = cinemaService;
        this.seatService = seatService;
        this.cinemaCliPresentation = new CinemaCliPresentation(cinemaService);
    }


    public void init() {
        Locale[] locales = I18n.availableLocale();
        String[] optionLocale = new String[locales.length];
        for (int i = 0; i < locales.length; i++) {
            optionLocale[i] = locales[i].getDisplayName();
        }
        SelectOptionsCLI selectOptionsCLI = new SelectOptionsCLI(optionLocale);
        int localeIndex = selectOptionsCLI.start();
        Locale localeSelected = locales[localeIndex];
        I18n.setLocale(localeSelected);


        cinemaCliPresentation.initCinema();
    }


}
