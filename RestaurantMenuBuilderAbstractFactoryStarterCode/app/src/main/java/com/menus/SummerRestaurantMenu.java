/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * The SummerRestaurantMenu class represents the menu for the summer season.
 * It extends the abstract RestaurantMenu class and implements the method 
 * to populate the menu with seasonal items.
 * 
 * <p>This class uses the RestaurantMenuFactory to create the specific menu items 
 * such as entrees, main courses, desserts, and drinks for the summer menu.</p>
 * 
 * @author gouraya
 */
public class SummerRestaurantMenu extends RestaurantMenu {
    
    private RestaurantMenuFactory theFactory;  // Factory to create menu items
    
    /**
     * Constructs a SummerRestaurantMenu with the specified menu factory.
     *
     * @param factory the factory used to create menu items for this summer menu
     */
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the summer menu with the items created by the menu factory.
     * This method outputs a message indicating that items are being added
     * and then assigns the respective menu items (entree, main course, dessert, drink).
     */
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        // Insert code to assign menu items created
        System.out.println();
        
        // Create menu items using the factory
        entree = theFactory.createEntree();
        mainCourse = theFactory.createMainCourse();
        dessert = theFactory.createDessert();
        drink = theFactory.createDrink(); 
    }
}
