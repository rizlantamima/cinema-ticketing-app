package dev.rizlantamima.cinema.configurations;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n {

    private static Locale locale;
    public static ResourceBundle getResources(String baseName){
        return ResourceBundle.getBundle(baseName, locale);
    }

    public Locale getLocale() {
        return locale;
    }

    public static void setLocale(Locale locale) {
        I18n.locale = locale;
    }

    private static Locale[] availableLocale(){
        Locale[] locales = new Locale[3];
        locales[0] = new Locale("en","US");
        locales[1] = new Locale("id","ID");
        locales[2] = new Locale("su","ID");
        return locales;
    }
}
