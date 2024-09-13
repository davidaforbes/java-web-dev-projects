package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> Foods;
    private Date LastUpdated;

    public Menu(ArrayList<MenuItem> aFoods, Date aLastUpdated){
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

    public void setLastUpdated(Date lastUpdated) {
        LastUpdated = lastUpdated;
    }
    public Date getLastUpdated() {
        return LastUpdated;
    }

}
