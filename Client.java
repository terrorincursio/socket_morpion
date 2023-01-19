package client;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import graphique.*;
import jeu.Carte;
import reseau.Serveur;

public class Client 
{
    Carte cart;
    AffichageJeu affJeu;
    Serveur serveur;

    public Client() throws Exception, IOException
    {
        cart=new Carte();
        Socket socketOfClient = null;
        BufferedWriter os = null;
        Scanner ecrire=new Scanner(System.in);
        BufferedReader is = null;
        
        final String serverHost = "localhost";
        
        try 
        {
            socketOfClient=new Socket(serverHost, 34902);

            if(socketOfClient!=null)
            {
                affJeu=new AffichageJeu();
                affJeu.setVisible(true);

                for(int i=10; i<17; i++)
                {
                    affJeu.getPanels()[2].add(affJeu.getButtons()[i]);
                    affJeu.getPanels()[2].setVisible(false);
                    //affJeu.getButtons()[i]=new JButton("Carte n*"+(i-9));
                    //affJeu.getPanels()[2].add(affJeu.getButtons()[i]);
                    if(getServeur().getAffJeu().getButtons()[i].isEnabled())
                    {
                        affJeu.getButtons()[1].setText("");
                        affJeu.getButtons()[1].setText("");
                        affJeu.getButtons()[1].setIcon(getServeur().getAffJeu().getButtons()[i].getIcon());
                        affJeu.getButtons()[1].setOpaque(false);
                        //
                        affJeu.getButtons()[1].setContentAreaFilled(false);
                        //enlever la bordure
                        affJeu.getButtons()[2].setBorderPainted(false);

                    }
                }
                for(int i=3; i<10; i++)
                {
                    //affJeu.getButtons()[i]=new JButton("Carte n*"+(i-2));
                    //affJeu.getPanels()[0].add(affJeu.getButtons()[i]);
                    //affJeu.getPanels()[0].setVisible(true);

                    affJeu.getButtons()[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            for(int i=3; i<10; i++)
                            {
                                for(int j=0; j<affJeu.getCarte().length; j++)
                                for(int k=0; k<cart.ListeIcon().length; k++)
                                {
                                    if(event.getSource()==affJeu.getButtons()[i])
                                    {
                                        affJeu.getButtons()[2].setText("");
                                        affJeu.getButtons()[2].setText("");
                                        affJeu.getButtons()[2].setIcon(affJeu.getButtons()[i].getIcon());//generer la carte selectionne par joueur
                                        affJeu.getButtons()[2].setOpaque(false);
                                        //enlever la zone de contenu
                                        affJeu.getButtons()[2].setContentAreaFilled(false);
                                        //enlever la bordure
                                        affJeu.getButtons()[2].setBorderPainted(false);

                                        try 
                                        {
                                            getServeur().getAffJeu().getButtons()[2].setText("");
                                            getServeur().getAffJeu().getButtons()[2].setText("");
                                            getServeur().getAffJeu().getButtons()[2].setIcon(affJeu.getButtons()[i].getIcon());//generer la carte selectionne par joueur
                                            getServeur().getAffJeu().getButtons()[2].setOpaque(false);
                                            //enlever la zone de contenu
                                            getServeur().getAffJeu().getButtons()[2].setContentAreaFilled(false);
                                            //enlever la bordure
                                            getServeur().getAffJeu().getButtons()[2].setBorderPainted(false);
                                        } catch (Exception e) {
                                            // TODO: handle exception
                                        }
                                        

                                        //getClient().getAJeu().getButtons()[1].setIcon(affJeu.getButtons()[i].getIcon());
                                        break;
                                    }
                                }
                            }     
                        }
                    });
                }
            }
            

            // Create output stream at the client (to send data to the server)
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));

            is=new BufferedReader(new InputStreamReader(socketOfClient.getInputStream())); // Recuperer le message du serveur
            System.out.println(is.readLine());

            System.out.println(">>>");

            //socketOfClient.close();
        } 
        catch (IOException e) 
        {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public Serveur getServeur() throws Exception, IOException
    {
        serveur=new Serveur();
        serveur.getAffJeu().setVisible(false);
        return this.serveur;
    }
    public AffichageJeu getAJeu()
    {
        return this.affJeu;
    }
    public static void main(String[] args) throws Exception, IOException
    {
        new Client();
    }
    
}
