package Category;

import java.util.List;

import demo.demo;

public class Category {

    private String nameCategory;
    private List<demo> mdemos;

    public Category(String nameCategory, List<demo> mdemos) {
        this.nameCategory = nameCategory;
        this.mdemos = mdemos;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<demo> getmdemos() {
        return mdemos;
    }

    public void setmdemos(List<demo> mdemos) {
        this.mdemos = mdemos;
    }
}
