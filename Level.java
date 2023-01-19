package graphique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import joueur.*;
import jeu.*;
import reseau.Serveur;

public class Level extends JPanel
{
    JLabel[] player;
    JButton[] Carte;
    JButton[] menu;
	Joueur[] joueur;
	Serveur serveur;
	Carte carte;

    public JButton button(String name) 
    {
		JButton newButton = new JButton(name);
		newButton.setFocusPainted(false);
		newButton.setFont(new Font(null, Font.BOLD, 26));
		newButton.setFocusable(false);
		newButton.setBackground(new Color(30, 175, 30));
		newButton.setMaximumSize(new Dimension(225, 50));
		
		return newButton;
	}

    public Level() throws IOException
    {
		Affichage aff=new Affichage();
		aff.setVisible(false);

        this.joueur=new Joueur[2];
        joueur[0]=new Joueur(1, "player 1", 0);
        joueur[1]=new Joueur(2, "player 2", 0);

        player=new JLabel[2];

		player[0] = new JLabel(joueur[0].pseudo +" "+ joueur[0].score);
		player[1] = new JLabel(joueur[1].pseudo +" "+ joueur[1].score);
		
		do {
			try {
				// if(aff.getButton()[0].isEnabled() && aff.getCheckBoxs()[0].isSelected())
				// {
					joueur[0].pseudo = JOptionPane.showInputDialog(this, "Enter your name:", "Player 1", JOptionPane.QUESTION_MESSAGE);
					joueur[1].pseudo = JOptionPane.showInputDialog(this, "Enter your name:", "Player 2", JOptionPane.QUESTION_MESSAGE);
					break;
				// }
				// else if(aff.getButton()[0].isEnabled() && aff.getCheckBoxs()[1].isSelected())
				// {
				// 	joueur[0].pseudo = JOptionPane.showInputDialog(this, "Enter your name:", "Player 1", JOptionPane.QUESTION_MESSAGE);
				// 	try 
				// 	{
				// 		if(getServeur().getSocket()!=null)
                //         {
				// 			joueur[1].pseudo = JOptionPane.showInputDialog(this, "Enter your name:", "Player 2", JOptionPane.QUESTION_MESSAGE);
				// 		}
				// 	} 
				// 	catch (Exception e) 
				// 	{
				// 		// TODO: handle exception
				// 	}
					
				// 	break;
				// }

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter your pseudo", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (true);
		add(player[0]);
		add(Box.createRigidArea(new Dimension(25, 0)));
		add(player[1]);
		add(Box.createRigidArea(new Dimension(25, 0)));

        menu=new JButton[2];

		menu[0] = button("Exit");
		menu[1] = button("Save");

        for(int i=0; i<menu.length; i++)
        {
            add(menu[i]);
        }
        menu[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					System.exit(0);// Makes my life easy
				}
			}
		});

    }
	public Joueur[] getJoueurs()
	{
		return this.joueur;
	}
	public Serveur getServeur() throws IOException
	{
		serveur=new Serveur();
		return this.serveur;
	}
}
