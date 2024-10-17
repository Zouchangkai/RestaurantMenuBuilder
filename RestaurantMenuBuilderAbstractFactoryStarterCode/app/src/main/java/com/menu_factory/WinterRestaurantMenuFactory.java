/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.*;
/**
 * The WinterRestaurantMenuFactory class implements the RestaurantMenuFactory interface
 * to create menu items specific to the winter season.
 * 
 * <p>This factory is responsible for producing the various components of the winter menu,
 * including drinks, main courses, entrees, and desserts.</p>
 * 
 * @author gouraya
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
    /**
     * Creates a new drink item for the winter menu.
     *
     * @return a new instance of WinterDrink
     */
    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }
    
    /**
     * Creates a new main course item for the winter menu.
     *
     * @return a new instance of WinterMainCourse
     */
    @Override
    public MainCourse createMainCourse() {
        return new WinterMainCourse();
    }

    /**
     * Creates a new entree item for the winter menu.
     *
     * @return a new instance of WinterEntree
     */
    @Override    
    public Entree createEntree() {
        return new WinterEntree();
    }

    /**
     * Creates a new dessert item for the winter menu.
     *
     * @return a new instance of WinterDessert
     */
    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }   
}
