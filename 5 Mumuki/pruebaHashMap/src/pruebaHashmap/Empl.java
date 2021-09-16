/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaHashmap;

/**
 *
 * @author juanj
 */
public class Empl {
    private int id;
    private String name;

    public Empl(String name) {
        // TODO Auto-generated constructor stub
        System.out.println("nuevo objeto " + name);
        this.name = name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+id;
    }
}
