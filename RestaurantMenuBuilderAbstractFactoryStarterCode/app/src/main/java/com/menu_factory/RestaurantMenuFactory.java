package menu_factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * The RestaurantMenuFactory interface defines the contract for creating menu items
 * for a restaurant menu. Implementing classes are responsible for providing the 
 * concrete implementations for each type of menu item.
 * 
 * <p>This interface includes methods to create various menu components:</p>
 * <ul>
 *   <li>Drinks</li>
 *   <li>Main Courses</li>
 *   <li>Entrees</li>
 *   <li>Desserts</li>
 * </ul>
 * 
 * @author gouraya
 */
public interface RestaurantMenuFactory {
    
    /**
     * Creates a drink item for the menu.
     *
     * @return a new instance of Drink
     */
    public Drink createDrink();
    
    /**
     * Creates a main course item for the menu.
     *
     * @return a new instance of MainCourse
     */
    public MainCourse createMainCourse();
    
    /**
     * Creates an entree item for the menu.
     *
     * @return a new instance of Entree
     */
    public Entree createEntree();
    
    /**
     * Creates a dessert item for the menu.
     *
     * @return a new instance of Dessert
     */
    public Dessert createDessert();
    
}
