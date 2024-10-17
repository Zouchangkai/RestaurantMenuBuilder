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
 * The SummerRestaurantMenuFactory class implements the RestaurantMenuFactory interface
 * to create menu items specific to the summer season.
 * 
 * <p>This factory is responsible for producing the various components of the summer menu,
 * including drinks, main courses, entrees, and desserts.</p>
 * 
 * @author gouraya
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
    /**
     * Creates a new drink item for the summer menu.
     *
     * @return a new instance of SummerDrink
     */
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }
    
    /**
     * Creates a new main course item for the summer menu.
     *
     * @return a new instance of SummerMainCourse
     */
    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse();
    }

    /**
     * Creates a new entree item for the summer menu.
     *
     * @return a new instance of SummerEntree
     */
    @Override    
    public Entree createEntree() {
        return new SummerEntree();
    }

    /**
     * Creates a new dessert item for the summer menu.
     *
     * @return a new instance of SummerDessert
     */
    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
}
