package action;

import javax.swing.*;

import client.Client;
import graphique.*;
import reseau.*;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class ListenerMenu 
{
    Affichage aff;
    AffichageJeu affJeu;
    AffichageJeu[] aJeus;
    Serveur serveur;
    Client client;

    public ListenerMenu() throws IOException
    {
        aff=new Affichage();
       
        aff.getButton()[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                if(aff.getCheckBoxs()[0].isSelected())
                {
                    aff.dispose();
                    try 
                    {
                        affJeu=new AffichageJeu();
                        affJeu.setVisible(true);
                    } 
                    catch (Exception e) 
                    {
                        // TODO: handle exception
                    }
                    
                }
                else if(aff.getCheckBoxs()[1].isSelected())
                {
                    try 
                    {
                        serveur=new Serveur();
                        serveur.getAffJeu().setVisible(false);

                        if(serveur.getSocket()!=null)
                        {
                            aff.dispose();
                            //client=new Client();
                            serveur.getOs();
                            aJeus=new AffichageJeu[1];
                            aJeus[0]=serveur.getAffJeu();
                            //aJeus[1]=serveur.getAffJeu();
                            for(int i=0; i<aJeus.length; i++)
                            {
                                aJeus[i].setVisible(true);
                            }
                    
                        }
                        
                    } 
                    catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                }
                
                //jeu.setVisible(true);
            }
        });

        aff.getButton()[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                
            }
        });

        aff.getButton()[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                aff.getHelpPan().removeAll();
				aff.getHelpPan().setOpaque(true);

				for(int i=0; i<aff.getCheckBoxs().length; i++)
                {
                    aff.getCheckBoxs()[i].setBackground(Color.black);
                    aff.getCheckBoxs()[i].setForeground(Color.white);
                    aff.getCheckBoxs()[i].setFont(new Font("Impact", Font.PLAIN, 28));
                    aff.getCheckBoxs()[i].setAlignmentX(aff.getHelpPan().CENTER_ALIGNMENT);
                    aff.getCheckBoxs()[i].setFocusPainted(false);
                    aff.getCheckBoxs()[i].setMargin(new Insets(0, 20, 0, 20));
                }
				aff.getHelpPan().add(Box.createRigidArea(new Dimension(0, 75)));
				aff.getHelpPan().add(aff.getCheckBoxs()[0]);
                aff.getHelpPan().add(aff.getCheckBoxs()[1]);
				aff.revalidate();
				aff.repaint();
            }
        });

        aff.getButton()[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                
            }
        });

        aff.getButton()[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
            }
        });
        for(int i=0; i<aff.getCheckBoxs().length; i++)
        {
            aff.getCheckBoxs()[0].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    for(int i=0; i<aff.getCheckBoxs().length; i++)
                    {
                        if(aff.getCheckBoxs()[0].isSelected())
                        {
                            aff.getCheckBoxs()[0].setSelected(true);
                            aff.getCheckBoxs()[1].setSelected(false);  
                        }
                    }
                }
            });

            aff.getCheckBoxs()[1].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    for(int i=0; i<aff.getCheckBoxs().length; i++)
                    {
                        if(aff.getCheckBoxs()[1].isSelected())
                        {
                            aff.getCheckBoxs()[1].setSelected(true);
                            aff.getCheckBoxs()[0].setSelected(false);
                        }
                    }
                }
            });
        }
        
    }
    public Affichage getAffichage()
    {
        return this.aff;
    }
    public AffichageJeu getAffichageJeu() throws Exception, IOException
    {
        // aJeus=new AffichageJeu[2];
        // aJeus[0]=new AffichageJeu();
        // aJeus[1]=new AffichageJeu();
        
        return this.affJeu;
    }
    public AffichageJeu[] getAffichageJeus()
    {
        return this.aJeus;
    }
}
