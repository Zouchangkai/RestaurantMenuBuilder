/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;

import menus.*;

/**
 * The MenuBuilding class is an abstract base class for creating restaurant menus.
 * This class defines the structure for building different seasonal menus.
 * 
 * <p>Subclasses must implement the {@link #makeMenuBuilding(String)} method 
 * to provide the specific menu implementation for a given season.</p>
 */
public abstract class MenuBuilding {

    /**
     * Abstract method to create a restaurant menu based on the specified season.
     *
     * @param season the season for which the menu is to be created
     * @return a RestaurantMenu object corresponding to the specified season
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Builds and populates a restaurant menu for the specified season.
     * This method calls the abstract method to create the menu 
     * and then populates it with items.
     *
     * @param season the season for which the menu is to be built
     * @return a populated RestaurantMenu object
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
}
