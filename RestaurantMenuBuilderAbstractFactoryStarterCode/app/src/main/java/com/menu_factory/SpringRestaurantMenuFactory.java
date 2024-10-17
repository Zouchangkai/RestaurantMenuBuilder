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
 * The SpringRestaurantMenuFactory class implements the RestaurantMenuFactory interface
 * to create menu items specific to the spring season.
 * 
 * <p>This factory is responsible for producing the various components of the spring menu,
 * including drinks, main courses, entrees, and desserts.</p>
 * 
 * @author gouraya
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates a new drink item for the spring menu.
     *
     * @return a new instance of SpringDrink
     */
    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }
    
    /**
     * Creates a new main course item for the spring menu.
     *
     * @return a new instance of SpringMainCourse
     */
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    /**
     * Creates a new entree item for the spring menu.
     *
     * @return a new instance of SpringEntree
     */
    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    /**
     * Creates a new dessert item for the spring menu.
     *
     * @return a new instance of SpringDessert
     */
    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    } 
}
