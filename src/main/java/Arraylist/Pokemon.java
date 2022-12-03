
package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Pokemon {
    
    public int luck ;
     public String name;
     public int vida;
     public int ataque;

     //mutadores
    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
//contructor vacio
    public Pokemon() {
    }
// constructor pokemon
    public  Pokemon(String name, int vida, int ataque) {
        this.luck = new Random().nextInt((5 - 1) + 1) + 1;
        this.name = name;
        this.vida = vida;
        this.ataque = ataque;
    }
   
     public void Pokemon(){
 
     }
     public static void combate(){
     
     }
     //fuera del class
}
