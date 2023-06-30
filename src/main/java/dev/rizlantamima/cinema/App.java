package dev.rizlantamima.cinema;

import dev.rizlantamima.cinema.configurations.I18n;
import dev.rizlantamima.cinema.repositories.SeatRepository;
import dev.rizlantamima.cinema.repositories.SeatRepositoryInMemoryImpl;
import dev.rizlantamima.cinema.utils.BannerUtils;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SeatRepository seatRepository = new SeatRepositoryInMemoryImpl();
//        BannerUtils.displayBanner();
//        Locale[] availableLocale = availableLocale();
//        for (int i = 0; i < availableLocale.length ; i++) {
//            System.out.println((i+1) + ". " + availableLocale[i].getDisplayName());
//        }
//        I18n.setLocale(new Locale("su", "ID"));
//        ResourceBundle resourceBundle = I18n.getResources("messages");
//        System.out.println( resourceBundle.getString("welcome") );
    }


}
