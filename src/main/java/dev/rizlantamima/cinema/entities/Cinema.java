package dev.rizlantamima.cinema.entities;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public class Cinema {
    @NotBlank(message = "name be can't blank")
    @Valid
    private String name;

    public Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
