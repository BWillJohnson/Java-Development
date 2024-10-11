package com.pluralsight;


public class Books {
    private final int ID;
    private final double ISBN;
    private String Title;
    private boolean isCheckedOut;
    private String isCheckedTo;

    public Books(int ID, double ISBN, String title) {
        this.ID = ID;
        this.ISBN = ISBN;
        Title = title;
        this.isCheckedOut = false;
        this.isCheckedTo = "N/A";
    }

    public int getID() {
        return ID;
    }

    public double getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public String getIsCheckedTo() {
        return isCheckedTo;
    }

    public void logOut(String reader) {
        this.isCheckedOut = true;
        this.isCheckedTo = reader;
    }

    public void  logIn(){
    this.isCheckedOut = false;
    this.isCheckedTo = null;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ID=" + ID +
                ", ISBN=" + ISBN +
                ", Title='" + Title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", isCheckedTo='" + isCheckedTo + '\'' +
                '}';
    }
}
