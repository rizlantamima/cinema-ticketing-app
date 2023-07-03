package dev.rizlantamima.cinema.configurations;

import java.text.MessageFormat;
import java.util.*;

public class I18n {

    private static Locale locale;
    public static ResourceBundle getResources(String baseName){
        if (locale == null){
            setLocale(availableLocale()[0]);
        }
        return ResourceBundle.getBundle(baseName, locale);
    }

    public static String getMessage(String messageName){
        ResourceBundle resourceBundle= getResources("messages");
        return resourceBundle.getString(messageName);
    }

    public static String getMessageF(String messageName, String initialValue, String... values){
        ResourceBundle resourceBundle= getResources("messages");
        String pattern = resourceBundle.getString(messageName);
        MessageFormat messageFormat = new MessageFormat(pattern);
        List<Object> objects = new ArrayList<>();
        objects.add(initialValue);
        if (values.length > 0){
            objects.addAll(Arrays.asList(values));
        }
        return messageFormat.format(objects.toArray());
    }

    public static Locale getLocale() {
        return locale;
    }

    public static void setLocale(Locale locale) {
        I18n.locale = locale;
    }

    public static Locale[] availableLocale(){
        Locale[] locales = new Locale[3];
        locales[0] = new Locale("en","US");
        locales[1] = new Locale("id","ID");
        locales[2] = new Locale("su","ID");
        return locales;
    }
}
