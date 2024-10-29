package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 60, message = "Location must be between 3 and 60 characters.")
    private String location;

    public @NotBlank @Size(min = 3, max = 60, message = "Location must be between 3 and 60 characters.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 60, message = "Location must be between 3 and 60 characters.") String location) {
        this.location = location;
    }

    public Employer() {}
}
