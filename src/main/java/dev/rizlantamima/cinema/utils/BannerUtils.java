package dev.rizlantamima.cinema.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BannerUtils {
    public static void displayBanner (){
        String filePath = "banner.txt";
        URL resource = (BannerUtils.class).getClassLoader().getResource(filePath);
        System.out.println(resource);
        if (resource != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()))) {
                String line;
                System.out.println("-------------------------------------------");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("-------------------------------------------");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
