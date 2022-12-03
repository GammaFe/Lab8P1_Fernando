package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8P1_FernandoGomez {

    public static void main(String[] args) {
        // ArrayList<Pokemon> pokemon= new ArrayList();
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pokemon> pokemon = new ArrayList();
        ArrayList<Pokemon> pokemon2 = new ArrayList();
        System.out.println("Jugador 1 ingrese cauntos pokemones desea max 3");
        int cont = entrada.nextInt();
        while (cont > 3) {
            System.out.println("Solo se puede un maximo de 3 pokemones");
            cont = entrada.nextInt();
        }
        int vida = cont;
        while (cont > 0) {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre:");
            String nom = entrada.nextLine();
            entrada = new Scanner(System.in);
            System.out.println("Ingrese vida");
            int Hp = entrada.nextInt();
            System.out.println("Ingrese potencia de Ataque");
            int dmg = entrada.nextInt();
            String Pokemon;
            Pokemon poke = new Pokemon(nom, Hp, dmg);
            pokemon.add(poke);
            Pokemon X = new Pokemon();
            cont = cont - 1;
        }
        System.out.println("Jugador 2 ingrese cauntos pokemones desea");
        int conta = entrada.nextInt();
        while (conta > 3) {
            System.out.println("Solo se puede un maximo de 3 pokemones");
            conta = entrada.nextInt();
        }
        int vida2 = conta;
        while (conta > 0) {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre:");
            String nom2 = entrada.nextLine();
            entrada = new Scanner(System.in);
            System.out.println("Ingrese vida");
            int Hp2 = entrada.nextInt();
            System.out.println("Ingrese potencia de Ataque");
            int dmg2 = entrada.nextInt();
            String Pokemon;
            Pokemon poke2 = new Pokemon(nom2, Hp2, dmg2);
            pokemon2.add(poke2);
            Pokemon Y = new Pokemon();
            conta = conta - 1;
        }

        for (int i = 0; i < pokemon.size(); i++) {
            Pokemon X = new Pokemon();
            X = pokemon.get(i);
            System.out.println(X.name + " Ataque: " + X.getAtaque() + " Vida: " + X.vida + "Su suerte es de: " + X.getLuck());
        }
        for (int j = 0; j < pokemon2.size(); j++) {
            Pokemon Y = new Pokemon();
            Y = pokemon2.get(j);
            System.out.println(Y.name + " Ataque: " + Y.getAtaque() + " Vida: " + Y.vida + "Su suerte es de: " + Y.getLuck());
        }
        while ((vida > 0) && (vida2 > 0)) {

            Pokemon X = new Pokemon();
            X = pokemon.get(1);
            Pokemon Y = new Pokemon();
            Y = pokemon2.get(1);
            int A = Y.getVida();
            int B = X.getVida();
            if (X.getLuck() > Y.getLuck()) {
                A = A - X.getAtaque();
                B = B - Y.getAtaque();
            } else if (Y.getLuck() > X.getLuck()) {
                B = B - Y.getAtaque();
                A = A - X.getAtaque();
                if (B < 0) {
                    System.out.println("B ha caido");
                    vida = 0;
                }else if (A < 0) {
                    System.out.println("A ha caido");
                     vida = 0;       
                }
            
            }

        }
    }
    //fuera del main

}
