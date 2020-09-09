package ru.mirea.ikbo2419.pr1;

public class shar {
    private String Color;
    private int Radius;
    public shar(String Color, int Radius){
        this.Color=Color;
        this.Radius=Radius;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public int getRadius() {
        return Radius;
    }
    public void setRadius(int Radius) {
        this.Radius = Radius;
    }
    public String toString(){
        return this.Radius+"cm ball is "+this.Color;
    }
}
