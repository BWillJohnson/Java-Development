package com.pluralsight;

public class Manga {
    private int ID;
    private int ISBN;
    private String Title;
    private String isCheckedOut;
    private String isCheckedTo;



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(String isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public String getIsCheckedTo() {
        return isCheckedTo;
    }

    public void setIsCheckedTo(String isCheckedTo) {
        this.isCheckedTo = isCheckedTo;
    }
}
