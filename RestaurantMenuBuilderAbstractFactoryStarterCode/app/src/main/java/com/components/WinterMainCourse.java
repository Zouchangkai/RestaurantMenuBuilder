/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The WinterMainCourse class represents the main course items available in the winter menu.
 * It implements the MainCourse interface to define the specific dishes offered during the winter season.
 * 
 * <p>This class provides a string representation of the main course items for winter.</p>
 * 
 * @author gouraya
 */
public class WinterMainCourse implements MainCourse {
    
    /**
     * Returns a string representation of the winter main course items.
     *
     * @return a formatted string listing the main courses for winter
     */
    @Override
    public String toString() {
        return "Sirloin\nSalmon Croquettes\nSteak and Fries";
    }     
}
