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
 * The FallRestaurantMenuFactory class implements the RestaurantMenuFactory interface
 * to create menu items specific to the fall season.
 * 
 * <p>This factory is responsible for producing the various components of the fall menu,
 * including drinks, main courses, entrees, and desserts.</p>
 * 
 * @author gouraya
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates a new drink item for the fall menu.
     *
     * @return a new instance of FallDrink
     */
    @Override
    public Drink createDrink() {
        return new FallDrink();
    }
    
    /**
     * Creates a new main course item for the fall menu.
     *
     * @return a new instance of FallMainCourse
     */
    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    /**
     * Creates a new entree item for the fall menu.
     *
     * @return a new instance of FallEntree
     */
    @Override    
    public Entree createEntree() {
        return new FallEntree();
    }

    /**
     * Creates a new dessert item for the fall menu.
     *
     * @return a new instance of FallDessert
     */
    @Override    
    public Dessert createDessert() {
        return new FallDessert();
    }    
}
