package com.example.myapplication;

public class DataPage {
    int image;
    String menuName;
<<<<<<< HEAD
    String cafeName;
    String categoryName;
    int price;

    public DataPage(int image, String menuName, String cafeName, String categoryName, int price){
=======
    String price;

    public DataPage(int image, String menuName, String cafeName, String price){
>>>>>>> brchWDY
        this.image = image;
        this.menuName = menuName;
        this.cafeName = cafeName;
        this.categoryName = categoryName;
        this.price = price;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMenuName(){
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

<<<<<<< HEAD
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPrice(){
=======
    public String getPrice(){
>>>>>>> brchWDY
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
