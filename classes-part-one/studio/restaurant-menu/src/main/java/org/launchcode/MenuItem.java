package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;


public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate date;


    public MenuItem(String name, double price, String description, String category, LocalDate date) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getLocalDate() {
        return date;
    }
    public void setLocalDate(LocalDate date) {
        this.date = date;
    }

    public boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getLocalDate().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

    public String toString() {
        return this.name + "\n" + this.price + "\n" + this.description;
    }

    public boolean equals(Object item) {
        if (this == item) return true;
        if (item == null || getClass() != item.getClass()) return false;
        MenuItem menuItem = (MenuItem) item;
        return Double.compare(price, menuItem.price) == 0 && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(date, menuItem.date);
    }
}
