package menus;

import components.*;

/**
 * Abstract class representing a restaurant menu.
 * This class defines the basic structure and behavior of a restaurant menu,
 * including menu items and methods for setting and retrieving the menu name 
 * and active period.
 * 
 * <p>This class is intended to be extended by concrete menu implementations
 * for different seasons.</p>
 */
public abstract class RestaurantMenu {
    
    private String name;  // Menu name
    private String period; // Period during which the menu is active

    // Menu items
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    /**
     * Returns the name of the menu.
     *
     * @return the name of the menu
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the menu.
     *
     * @param name the new name for the menu
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the active period of the menu.
     *
     * @return the active period of the menu
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * Sets the active period of the menu.
     *
     * @param period the new active period for the menu
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Abstract method to populate the menu with items.
     * This method must be implemented by subclasses to specify how
     * to populate the menu items.
     */
    public abstract void populateMenu();

    /**
     * Returns a string representation of the menu, including its name,
     * active period, and the list of menu items.
     *
     * @return a formatted string representing the menu
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The ").append(getName()).append("\n");
        sb.append("Active: ").append(getPeriod()).append("\n\n");
        
        sb.append("Entrees:\n");
        sb.append(entree).append("\n\n");
        
        sb.append("Main Courses:\n");
        sb.append(mainCourse).append("\n\n");
        
        sb.append("Desserts:\n");
        sb.append(dessert).append("\n\n");
        
        sb.append("Drinks:\n");
        sb.append(drink).append("\n\n");
        
        return sb.toString();
    }
}
