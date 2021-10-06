package restaurantapp;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private float price;
    private String name;
    private String description;
    private String category;
    private Date dateAdded;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) && description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        if (this.isNew())
            return "*NEW* "+name +" ($"+price+"): "+description;
        else
            return name +" ($"+price+"): "+description;
    }

    public MenuItem(String name, float price, String description, String category)
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }

    public MenuItem(String name,float price,String category)
    {
        this.name = name;
        this.price = price;
        this.description = "";
        this.category = category;
        this.dateAdded = new Date();
    }

    public MenuItem(String name,float price)
    {
        this.name = name;
        this.price = price;
        this.description = "";
        this.category = "all";
        this.dateAdded = new Date();
    }

    public boolean isNew()
    {
        //compare today's date to dateAdded.
        //if dateAdded is less than two weeks ago, return true
        long twoWeeksMs = 1209600000;
        Date today = new Date();
        return (today.getTime()-this.dateAdded.getTime() < twoWeeksMs);
    }

    public float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    protected void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

}