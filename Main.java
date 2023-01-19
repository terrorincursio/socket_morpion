package main;

import joueur.*;
import jeu.*;
import graphique.*;
import action.*;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.net.*;
import java.io.*;


public class Main
{
    Main() throws Exception, IOException
    {
        Carte cart=new Carte();

        Carte[] carte=new Carte[2];
        carte[0]=new Carte(1, cart.listeNomCarte()[0], null, null);
        carte[1]=new Carte(2, cart.listeNomCarte()[1], null, null);

        Regle regle=new Regle();

        Score score=new Score();

        Joueur[] j=new Joueur[2];
        j[0]=new Joueur(1, "J1", score.GetScore());
        j[1]=new Joueur(2, "J2", score.GetScore());


        //System.out.println("Entrer du joueur: "+j[0].id+" au nom de "+j[0].pseudo);

        if(cart.hierachie(13))
        {
            System.out.println("V");
        }
        else
        {
            System.out.println("F");
        }
        for(int i=0; i<cart.listeCategorie().length; i++)
        {
            for(int k=0; k<cart.listeNomCarte().length; k++)
            {
                System.out.println(cart.JeuDeCarte()[i][k]);
            }
        }
        new ListenerMenu();    
       // new ListenerGame();
    }
    public static void main(String[] args) throws Exception, IOException
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        new Main();
    }
}