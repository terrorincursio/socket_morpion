package graphique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Affichage extends JFrame //implements ActionListener
{
	public JButton[] bouton;
	public JPanel contentPane;
	public JPanel helpPane;
	public JCheckBox[] checkBox;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public int WIDTH = (int) screenSize.getWidth();
	public int HEIGHT = (int) screenSize.getHeight();

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

    public Affichage()
    {
        super( "Jeu de carte");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fermer la fenetre lorsqu'on la quite
        this.setSize(600, 400);//déterminer la dimension de la fenêtre
        this.setLocationRelativeTo(null);//définir la position de la fenetre:  toujours mettre apres setSize

		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		//this.setLayout(new GridLayout(2, 1));

        contentPane=new JPanel();
        contentPane.setBackground(new Color(0, 0, 0, 100));
        contentPane.setPreferredSize(new Dimension((int) WIDTH / 3, (int) HEIGHT - (int) HEIGHT / 5));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

		helpPane =new JPanel();
		helpPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		helpPane.setLayout(new BoxLayout(helpPane, BoxLayout.Y_AXIS));
		helpPane.setPreferredSize(new Dimension((int) WIDTH / 3, (int) HEIGHT - (int) HEIGHT / 5));
		helpPane.setBackground(new Color(0, 0, 0, 125));
		helpPane.setOpaque(false);

		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 0, 125);
		this.getContentPane().add(contentPane, c);
		c.insets = new Insets(0, 125, 0, 0);
		c.gridx = 1;
		this.getContentPane().add(helpPane, c);

		this.bouton=new JButton[5];
        
        bouton[0] = button("Play");
		bouton[0].setAlignmentX(contentPane.CENTER_ALIGNMENT);
		contentPane.add(Box.createRigidArea(new Dimension(0, 50)));
		contentPane.add(bouton[0]);

        contentPane.getRootPane().setDefaultButton(bouton[0]);
        
		contentPane.add(Box.createRigidArea(new Dimension(0, 75)));

		bouton[1] = button("Help");
		bouton[1].setAlignmentX(contentPane.CENTER_ALIGNMENT);
		contentPane.add(bouton[1]);

		contentPane.getRootPane().setDefaultButton(bouton[1]);

		contentPane.add(Box.createRigidArea(new Dimension(0, 75)));

		bouton[2] = button("Mode");
		bouton[2].setAlignmentX(contentPane.CENTER_ALIGNMENT);
		contentPane.add(bouton[2]);

		contentPane.getRootPane().setDefaultButton(bouton[2]);

		contentPane.add(Box.createRigidArea(new Dimension(0, 75)));
		
		bouton[3]=button("Settings");//button for thomas
		bouton[3].setAlignmentX(contentPane.CENTER_ALIGNMENT);
		contentPane.add(bouton[3]);

		contentPane.getRootPane().setDefaultButton(bouton[3]);

		contentPane.add(Box.createRigidArea(new Dimension(0, 75)));

        bouton[4] = button("Exit");
		bouton[4].setAlignmentX(contentPane.CENTER_ALIGNMENT);
		contentPane.add(bouton[4]);

		contentPane.getRootPane().setDefaultButton(bouton[4]);

		checkBox=new JCheckBox[2];
		checkBox[0]=new JCheckBox("Solo");
		checkBox[0].setSelected(false);
		
		checkBox[1]=new JCheckBox("Multiplayer");
		checkBox[1].setSelected(false);

		// for(int i=0; i<checkBox.length; i++)
        // {
		// 	checkBox[i].setSelected(true);
		// }

        this.setVisible(true);//fais en sorte que l'on voit la fenetre
    }
	public JButton[] getButton()
	{
		return this.bouton;
	}
	public JPanel getContentPan()
	{
		return this.contentPane;
	}
	public JPanel getHelpPan()
	{
		return this.helpPane;
	}
	public JCheckBox[] getCheckBoxs()
	{
		return this.checkBox;
	}
	public Affichage getAffichage()
	{
		return this;
	}
}
