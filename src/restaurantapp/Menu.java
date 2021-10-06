package restaurantapp;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private String menuType;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuType = "all";
        this.menuItems = new ArrayList<MenuItem>();
    }

    public Menu(String menuType) {
        this.menuType = menuType;
        this.menuItems = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
    }

    public Menu(String menuType, ArrayList<MenuItem> menuItems) {
        this.menuType = menuType;
        this.menuItems = menuItems;
        this.lastUpdated = new Date();
    }

    public static void scream()
    {
        System.out.println("I AM A MENU");
    }

    @Override
    public String toString() {
        String output = menuType+"\n\n";
        for (MenuItem item: menuItems) {
            output+=item.toString()+"\n";
        }
        return output;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
    //it might make sense to update the menu's lastUpdated to today's date
    //when anything else is updated

    public String getMenuType() {
        return menuType;
    }

    protected boolean setMenuType(String menuType) {
        this.menuType = menuType;
        this.lastUpdated = new Date();
        return true;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuItem getMenuItemByIndex(int index) {
        return menuItems.get(index);
    }

    protected boolean addMenuItem(MenuItem newMenuItem) {
        //adding a menu item if there isn't already one by that name
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).equals(newMenuItem))
                return false;
        }
        this.menuItems.add(newMenuItem);
        this.lastUpdated = new Date();
        return true;
    }

    protected boolean removeMenuItem(MenuItem newMenuItem) {
        //adding a menu item if there isn't already one by that name
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).equals(newMenuItem))
            {
                this.menuItems.remove(i);
                this.lastUpdated = new Date();
                return true;
            }
        }
        return false;
    }

    protected boolean removeMenuItem(String name) {
        //adding a menu item if there isn't already one by that name
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getName().equals(name))
            {
                this.menuItems.remove(i);
                this.lastUpdated = new Date();
                return true;
            }
        }
        return false;
    }
}