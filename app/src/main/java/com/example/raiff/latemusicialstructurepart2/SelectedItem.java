package com.example.raiff.latemusicialstructurepart2;


public class SelectedItem {
    private String mselectItem;
    private int mImageResource;

    /*
    Singleton
     */
    private static SelectedItem instance;
    private SelectedItem() {

    }
    public static SelectedItem getInstance() {
        if (instance == null) {
            instance = new SelectedItem();
        }
        return instance;
    }

    public void setSelectedItem(String SelectedItem){
        mselectItem = SelectedItem;

    }

    public String getSelected() {
        return mselectItem;
    }

    public void setResourceImage(int ResourceImage) {
        this.mImageResource = ResourceImage;
    }

    public int getResourceImage() {
        return this.mImageResource;
    }
}
