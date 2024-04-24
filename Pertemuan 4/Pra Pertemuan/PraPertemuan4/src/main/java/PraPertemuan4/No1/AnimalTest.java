/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No1;

/**
 *
 * @author Dwinanda
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Hani");
        animals[1] = new Cat("Kitty");
        animals[2] = new BigDog("BigHani");
        for (Animal animal : animals) {
            animal.greets();
        }
        Dog aaa = new Dog("Hanie");
        aaa.greets(aaa);
        BigDog bbb = new BigDog("BigHanie");
        bbb.greets(aaa);
        bbb.greets(bbb);
    }
}
