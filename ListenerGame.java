package action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import graphique.*;

public class ListenerGame 
{
    JButton[] bouton;
    AffichageJeu affJeu;
    AffichageJeu[] affJ;
    ListenerMenu menu;
    //ImageIcon[] image;
    public ListenerGame() throws Exception, IOException
    {
        Affichage aff=new Affichage();
        aff.setVisible(false);

        menu=new ListenerMenu();
        menu.getAffichage().setVisible(false);
        
        AffichageJeu affJeu=new AffichageJeu();
        affJeu.setVisible(false);

        // for(int i=0; i<aff.getButton().length; i++)
        // {
        //     if(aff.getButton()[i].equals("Play"))
        //     {
        //         affJeu.getButtons()[0].addActionListener(new ActionListener() {
        //             public void actionPerformed(ActionEvent event) {

        //                 affJeu.getButtons()[1].setText("Bouton 2");
        //                 for(int i=3; i<17; i++)
        //                 {
        //                     for(int j=0; j<affJeu.getIcons().length; j++)
        //                     {
        //                         //image[j]=(ImageIcon) affJeu.getButtons()[i].getIcon();
                               

        //                        //affJeu.getButtons()[i]=new JButton(affJeu.getIcons()[0]);

        //                         //affJeu.getButtons()[i].setIcon(affJeu.getIcons()[j]);
        //                         if(i==17)
        //                         {
        //                             break;
        //                         }
        //                         //else
        //                         //{
        //                             //continue;
        //                         //}
        //                     }
        //                 }
        //             }
        //         });
        //     }
        // }
        
        
        //affJeu.setVisible(false);

        
    }
    public AffichageJeu getAffichageJeu()
    {
        return this.affJeu;
    }
    public AffichageJeu[] getAffichageJ()
    {
        return this.affJ;
    }
}
