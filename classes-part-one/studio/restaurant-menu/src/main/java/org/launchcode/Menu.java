package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> Foods;
    private LocalDate LastUpdated;

    public Menu(ArrayList<MenuItem> aFoods, LocalDate aLastUpdated){
        Foods = aFoods;
        LastUpdated = aLastUpdated;
    }

// getters and setters
    public void setFoods(ArrayList<MenuItem> aFoods){
        Foods = aFoods;
    }
    public ArrayList<MenuItem> getFoods(){
        return Foods;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        LastUpdated = lastUpdated;
    }
    public LocalDate getLastUpdated() {
        return LastUpdated;
    }

    public void addMenuItem(MenuItem item) {
        this.Foods.add(item);
        LastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem item) {
        this.Foods.remove(item);
    }

    public String toString() {
        String menuString = "";
        for (MenuItem item : this.Foods) {
            menuString += item.toString() + "\n";
        }
        menuString += this.LastUpdated;
        return menuString;
    }

}
