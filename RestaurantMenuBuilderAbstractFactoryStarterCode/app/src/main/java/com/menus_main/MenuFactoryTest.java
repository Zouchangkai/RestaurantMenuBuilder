/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menus_main;

import menu_building.*;
import menus.*;

/**
 * The MenuFactoryTest class tests the functionality of the restaurant menu builder.
 * It demonstrates the creation of seasonal restaurant menus using the factory method pattern.
 * 
 * <p>This class builds and displays the menus for all four seasons: Fall, Winter, Spring, and Summer.</p>
 * 
 * @author gouraya
 */
public class MenuFactoryTest {

    /**
     * The main method serves as the entry point for the application.
     * It builds and displays the restaurant menus for all four seasons.
     *
     * <p>This method creates an instance of the MenuBuilding class, then constructs
     * the seasonal menus and prints their details to the console.</p>
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Create an instance of ConcreteMenuBuilding to build menus.
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        // Build and display the Fall menu.
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        // Build and display the Winter menu.
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);
        
        // Build and display the Spring menu.
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);
         
        // Build and display the Summer menu.
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
    }    
}
