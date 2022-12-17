package UpDowCasting;

public class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void diChuyenMeo(){

        System.out.println(" Meo Dang di");
    }
}
