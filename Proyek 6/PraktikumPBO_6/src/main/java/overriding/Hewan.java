/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author VOSTRO V131
 */
public class Hewan {
    public void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}