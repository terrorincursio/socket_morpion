package reseau;

import java.net.*;
import java.awt.*;
import javax.swing.*;

import client.Client;

import java.awt.event.*;

import jeu.*;
import graphique.AffichageJeu;

import java.io.*;

public class Serveur 
{
    Client client;
    boolean condition;
    Carte cart;
    AffichageJeu affJeu;
    ServerSocket ss;
    Socket s;
    String line;
    PrintWriter out;
    BufferedReader is;
    BufferedWriter os;
    BufferedReader fichier;
    

    public Serveur() throws IOException
    {
        cart=new Carte();
        
        try 
        {
            System.out.println("En attente de connexion...");
            ss=new ServerSocket(34902);
            System.out.println(ss.getLocalPort());

            ss.setSoTimeout(30000);
            
            s=ss.accept();

            if(s!=null)
            {
                affJeu=new AffichageJeu();
                affJeu.setVisible(true);

                System.out.println("Client connect");
                PrintWriter out=new PrintWriter(s.getOutputStream()); //Envoyer une informations
                out.println("Generation d'interface...");
                is = new BufferedReader(new InputStreamReader(s.getInputStream()));
                os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                out.flush();

                for(int i=10; i<17; i++)
                {
                    //affJeu.getButtons()[i]=new JButton("Carte n*"+(i-9));
                    //affJeu.getPanels()[2].add(affJeu.getButtons()[i]);
                    
                    affJeu.getButtons()[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            for(int i=10; i<17; i++)
                            {
                                for(int j=0; j<affJeu.getCarte().length; j++)
                                for(int k=0; k<cart.ListeIcon().length; k++)
                                {
                                    if(event.getSource()==affJeu.getButtons()[i])
                                    {
                                        affJeu.getButtons()[i].setText("");
                                        affJeu.getButtons()[1].setText("");
                                        affJeu.getButtons()[1].setIcon(affJeu.getButtons()[i].getIcon());//generer la carte selectionne par joueur
                                        affJeu.getButtons()[1].setOpaque(false);
                                        //enlever la zone de contenu
                                        affJeu.getButtons()[1].setContentAreaFilled(false);
                                        //enlever la bordure
                                        affJeu.getButtons()[1].setBorderPainted(false);

                                        //getClient().getAJeu().getButtons()[1].setIcon(affJeu.getButtons()[i].getIcon());
                                        break;
                                    }
                                }
                            }     
                        }
                    });
                }
                for(int i=3; i<10; i++)
                {
                    //affJeu.getButtons()[i]=new JButton("Carte n*"+(i-2));
                    affJeu.getPanels()[0].add(affJeu.getButtons()[i]);
                    affJeu.getPanels()[0].setVisible(false);
                }
            }

            
             //important pour envoyer le message
            //ss.close();
            //s.close();
        } 
        catch (IOException e) 
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Connexion au serveur interrompue.");
    }
    public Client getClient() throws Exception, IOException
    {
        this.client=new Client();
        client.getAJeu().setVisible(false);
        return this.client;
    }
    public AffichageJeu getAffJeu()
    {
        return this.affJeu;
    }
    public ServerSocket getServerSocket()
    {
        return this.ss;
    }
    public Socket getSocket()
    {
        return this.s;
    }
    public BufferedWriter getOs()
    {
        return this.os;
    }
    public boolean getBoolean()
    {
        return this.condition;
    }
    private static void log(String message)
    {
        System.out.println(message);
    }
    public static void main(String[] args) throws IOException
    {
        new Serveur();
    }
}
