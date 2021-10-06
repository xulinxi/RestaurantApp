package restaurantapp;

public class Restaurant {
    public static void main(String[] args) {
        Menu myMenu = new Menu("Dinner");
        MenuItem pizza = new MenuItem("Pizza",(float)10.99,"Wood-fired pizza with your choice of 2 toppings.","Dinner");
        MenuItem alfredo = new MenuItem("Linguine Alfredo",(float)9.99,"Dinner");
        System.out.println(pizza.equals(alfredo));
        myMenu.addMenuItem(pizza);
        myMenu.addMenuItem(alfredo);
        myMenu.addMenuItem(new MenuItem("Cup of Coffee", (float) 1.99));
        System.out.println(myMenu);
        myMenu.removeMenuItem("Cup of Coffee");
        System.out.println(myMenu);
    }
}

