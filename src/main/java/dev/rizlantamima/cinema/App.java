package dev.rizlantamima.cinema;

import dev.rizlantamima.cinema.presentations.CommonPresentation;
import dev.rizlantamima.cinema.presentations.cli.CliPresentation;
import dev.rizlantamima.cinema.repositories.CinemaRepository;
import dev.rizlantamima.cinema.repositories.CinemaRepositoryImpl;
import dev.rizlantamima.cinema.repositories.SeatRepository;
import dev.rizlantamima.cinema.repositories.SeatRepositoryInMemoryImpl;
import dev.rizlantamima.cinema.services.CinemaService;
import dev.rizlantamima.cinema.services.CinemaServiceImpl;
import dev.rizlantamima.cinema.services.SeatService;
import dev.rizlantamima.cinema.services.SeatServiceImpl;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        CinemaRepository cinemaRepository = new CinemaRepositoryImpl(validator);
        SeatRepository seatRepository = new SeatRepositoryInMemoryImpl();
        CinemaService cinemaService = new CinemaServiceImpl(cinemaRepository);
        SeatService seatService = new SeatServiceImpl(seatRepository);
        CommonPresentation presentation = new CliPresentation(cinemaService,seatService);
        presentation.init();
        validatorFactory.close();
    }


}
