package menu_building;

import menu_factory.*;
import menus.*;

/**
 * Concrete implementation of the MenuBuilding class.
 * This class is responsible for creating specific restaurant menus 
 * based on the given season. It uses the Factory Method pattern 
 * to instantiate the appropriate menu for each season.
 * 
 * <p>This implementation supports four seasons: Fall, Winter, Spring, and Summer.</p>
 */
public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * Creates a restaurant menu based on the specified season.
     *
     * @param season the season for which the menu is to be created
     * @return a RestaurantMenu object corresponding to the specified season
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;

        if ("Fall".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        } 
        else if ("Winter".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu");
            theMenu.setPeriod("December 1 to February 28.");
        } 
        else if ("Spring".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 31.");  
        } 
        else if ("Summer".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31."); 
        }

        return theMenu;
    }
}
