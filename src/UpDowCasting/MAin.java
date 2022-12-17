package UpDowCasting;

public class MAin {
    public static void main(String[] args) {
        Animal animal = new Cat();

        Cat cat = (Cat) animal;
        ((Cat) animal).diChuyenMeo();
//        Cat cat1= new Cat();
//        Animal animal1= (Animal) cat1;
//        animal1.anuong();
    }
}
