package com.pluralsight.models;

public class SalesByCategory {
    private  String categoryName;
    private String year;

    public SalesByCategory(String categoryName, String year) {
        this.categoryName = categoryName;
        this.year = year;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "SalesByCategory{" +
                "categoryName='" + categoryName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
