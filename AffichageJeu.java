package graphique;

import reseau.*;
import jeu.*;
import joueur.*;
import action.*;

import java.util.random.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class AffichageJeu extends JFrame implements ActionListener
{
    ListenerMenu listMenu;
    Serveur serveur;
    Client client;
    Level content;
    JPanel[] panel;
    ImageIcon[] icon;
    JButton[] buttons;
    Carte[] cartes;
    Carte cart;

    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public int WIDTH = (int) screenSize.getWidth();
	public int HEIGHT = (int) screenSize.getHeight();

    public AffichageJeu(String s)
    {
        this.setVisible(false);
    }
    public AffichageJeu() throws IOException
    {
        Affichage aff=new Affichage();
        aff.setVisible(false);

        listMenu=new ListenerMenu();
        listMenu.getAffichage().setVisible(false);

        this.setUndecorated(true);
		this.setVisible(true);
		this.setSize((int) WIDTH, (int) HEIGHT);

        cart=new Carte();
        cartes=new Carte[54];

        cartes[0]=new Carte(0, cart.listeNomCarte()[0], cart.listeCategorie()[0], cart.ListeIcon()[0]);
        cartes[1]=new Carte(1, cart.listeNomCarte()[1], cart.listeCategorie()[0], cart.ListeIcon()[1]);
        cartes[2]=new Carte(2, cart.listeNomCarte()[2], cart.listeCategorie()[0], cart.ListeIcon()[2]);
        cartes[3]=new Carte(3, cart.listeNomCarte()[3], cart.listeCategorie()[0], cart.ListeIcon()[3]);
        cartes[4]=new Carte(4, cart.listeNomCarte()[4], cart.listeCategorie()[0], cart.ListeIcon()[4]);
        cartes[5]=new Carte(5, cart.listeNomCarte()[5], cart.listeCategorie()[0], cart.ListeIcon()[5]);
        cartes[6]=new Carte(6, cart.listeNomCarte()[6], cart.listeCategorie()[0], cart.ListeIcon()[6]);
        cartes[7]=new Carte(7, cart.listeNomCarte()[7], cart.listeCategorie()[0], cart.ListeIcon()[7]);
        cartes[8]=new Carte(8, cart.listeNomCarte()[8], cart.listeCategorie()[0], cart.ListeIcon()[8]);
        cartes[9]=new Carte(9, cart.listeNomCarte()[9], cart.listeCategorie()[0], cart.ListeIcon()[9]);
        cartes[10]=new Carte(10, cart.listeNomCarte()[10], cart.listeCategorie()[0], cart.ListeIcon()[10]);
        cartes[11]=new Carte(11, cart.listeNomCarte()[11], cart.listeCategorie()[0], cart.ListeIcon()[11]);
        cartes[12]=new Carte(12, cart.listeNomCarte()[12], cart.listeCategorie()[0], cart.ListeIcon()[12]);

        cartes[13]=new Carte(13, cart.listeNomCarte()[0], cart.listeCategorie()[1], cart.ListeIcon()[13]);
        cartes[14]=new Carte(14, cart.listeNomCarte()[1], cart.listeCategorie()[1], cart.ListeIcon()[14]);
        cartes[15]=new Carte(15, cart.listeNomCarte()[2], cart.listeCategorie()[1], cart.ListeIcon()[15]);
        cartes[16]=new Carte(16, cart.listeNomCarte()[3], cart.listeCategorie()[1], cart.ListeIcon()[16]);
        cartes[17]=new Carte(17, cart.listeNomCarte()[4], cart.listeCategorie()[1], cart.ListeIcon()[17]);
        cartes[18]=new Carte(18, cart.listeNomCarte()[5], cart.listeCategorie()[1], cart.ListeIcon()[18]);
        cartes[19]=new Carte(19, cart.listeNomCarte()[6], cart.listeCategorie()[1], cart.ListeIcon()[19]);
        cartes[20]=new Carte(20, cart.listeNomCarte()[7], cart.listeCategorie()[1], cart.ListeIcon()[20]);
        cartes[21]=new Carte(21, cart.listeNomCarte()[8], cart.listeCategorie()[1], cart.ListeIcon()[21]);
        cartes[22]=new Carte(22, cart.listeNomCarte()[9], cart.listeCategorie()[1], cart.ListeIcon()[22]);
        cartes[23]=new Carte(23, cart.listeNomCarte()[10], cart.listeCategorie()[1], cart.ListeIcon()[23]);
        cartes[24]=new Carte(24, cart.listeNomCarte()[11], cart.listeCategorie()[1], cart.ListeIcon()[24]);
        cartes[25]=new Carte(25, cart.listeNomCarte()[12], cart.listeCategorie()[1], cart.ListeIcon()[25]);

        cartes[26]=new Carte(26, cart.listeNomCarte()[0], cart.listeCategorie()[2], cart.ListeIcon()[26]);
        cartes[27]=new Carte(27, cart.listeNomCarte()[1], cart.listeCategorie()[2], cart.ListeIcon()[27]);
        cartes[28]=new Carte(28, cart.listeNomCarte()[2], cart.listeCategorie()[2], cart.ListeIcon()[28]);
        cartes[29]=new Carte(29, cart.listeNomCarte()[3], cart.listeCategorie()[2], cart.ListeIcon()[29]);
        cartes[30]=new Carte(30, cart.listeNomCarte()[4], cart.listeCategorie()[2], cart.ListeIcon()[30]);
        cartes[31]=new Carte(31, cart.listeNomCarte()[5], cart.listeCategorie()[2], cart.ListeIcon()[31]);
        cartes[32]=new Carte(32, cart.listeNomCarte()[6], cart.listeCategorie()[2], cart.ListeIcon()[32]);
        cartes[33]=new Carte(33, cart.listeNomCarte()[7], cart.listeCategorie()[2], cart.ListeIcon()[33]);
        cartes[34]=new Carte(34, cart.listeNomCarte()[8], cart.listeCategorie()[2], cart.ListeIcon()[34]);
        cartes[35]=new Carte(35, cart.listeNomCarte()[9], cart.listeCategorie()[2], cart.ListeIcon()[35]);
        cartes[36]=new Carte(36, cart.listeNomCarte()[10], cart.listeCategorie()[2], cart.ListeIcon()[36]);
        cartes[37]=new Carte(37, cart.listeNomCarte()[11], cart.listeCategorie()[2], cart.ListeIcon()[37]);
        cartes[38]=new Carte(38, cart.listeNomCarte()[12], cart.listeCategorie()[2], cart.ListeIcon()[38]);

        cartes[39]=new Carte(39, cart.listeNomCarte()[0], cart.listeCategorie()[3], cart.ListeIcon()[39]);
        cartes[40]=new Carte(40, cart.listeNomCarte()[1], cart.listeCategorie()[3], cart.ListeIcon()[40]);
        cartes[41]=new Carte(41, cart.listeNomCarte()[2], cart.listeCategorie()[3], cart.ListeIcon()[41]);
        cartes[42]=new Carte(42, cart.listeNomCarte()[3], cart.listeCategorie()[3], cart.ListeIcon()[42]);
        cartes[43]=new Carte(43, cart.listeNomCarte()[4], cart.listeCategorie()[3], cart.ListeIcon()[43]);
        cartes[44]=new Carte(44, cart.listeNomCarte()[5], cart.listeCategorie()[3], cart.ListeIcon()[44]);
        cartes[45]=new Carte(45, cart.listeNomCarte()[6], cart.listeCategorie()[3], cart.ListeIcon()[45]);
        cartes[46]=new Carte(46, cart.listeNomCarte()[7], cart.listeCategorie()[3], cart.ListeIcon()[46]);
        cartes[47]=new Carte(47, cart.listeNomCarte()[8], cart.listeCategorie()[3], cart.ListeIcon()[47]);
        cartes[48]=new Carte(48, cart.listeNomCarte()[9], cart.listeCategorie()[3], cart.ListeIcon()[48]);
        cartes[49]=new Carte(49, cart.listeNomCarte()[10], cart.listeCategorie()[3], cart.ListeIcon()[49]);
        cartes[50]=new Carte(50, cart.listeNomCarte()[11], cart.listeCategorie()[3], cart.ListeIcon()[50]);
        cartes[51]=new Carte(51, cart.listeNomCarte()[12], cart.listeCategorie()[3], cart.ListeIcon()[51]);

        cartes[52]=new Carte(52, cart.listeNomCarte()[13], cart.listeCategorie()[0], cart.ListeIcon()[52]);
        cartes[53]=new Carte(53, null, null, cart.ListeIcon()[53]);
		// Create instance of the game
		content = new Level();

        this.panel=new JPanel[3];
        panel[0]=new JPanel();
        panel[1]=new JPanel();
        panel[2]=new JPanel();
        
        
        this.getContentPane().add(content);
        
        for(int i=0; i<panel.length; i++)
        {
            panel[i].setLayout(new FlowLayout());
            // panel[i].setBackground(Color.RED);

            //label[1].add(panel[i]);       
        }
        panel[0].setLayout(new FlowLayout(FlowLayout.CENTER));
        panel[1].setLayout(new FlowLayout(FlowLayout.CENTER, 60, 30));
        panel[2].setLayout(new FlowLayout(FlowLayout.CENTER));

        this.getContentPane().add(panel[0]);
        this.getContentPane().add(panel[1]);
        this.getContentPane().add(panel[2]);

        buttons=new JButton[17];

        
        buttons[0]=new JButton(cartes[53].ListeIcon()[53]);
        buttons[0].setBounds(30, 40, 300, 30);

        buttons[1]=new JButton("Carte joueur 1");
        buttons[1].setBounds(30, 40, 300, 30);

        buttons[2]=new JButton("Carte joueur 2");
        buttons[2].setBounds(30, 200, 300, 30);

        buttons[0].setOpaque(false);
        //enlever la zone de contenu
        buttons[0].setContentAreaFilled(false);
        //enlever la bordure
        buttons[0].setBorderPainted(false);

        panel[1].add(buttons[2]);
        panel[1].add(buttons[1]);
        panel[1].add(buttons[0]);
        

        for(int i=3; i<10; i++)
        {
            buttons[i]=new JButton("Carte n*"+(i-2));
            panel[0].add(buttons[i]);

            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent event) {

                    for(int i=3; i<10; i++)
                    {
                        for(int j=0; j<cartes.length; j++)

                        for(int k=0; k<cart.ListeIcon().length; k++)
                        {
                           
                            if(event.getSource()==buttons[i])
                            {
                                buttons[i].setText("");
                                    

                                buttons[2].setText("");
                                buttons[2].setIcon(buttons[i].getIcon());
                               
                                buttons[2].setOpaque(false);
                                //enlever la zone de contenu
                                buttons[2].setContentAreaFilled(false);
                                //enlever la bordure
                                buttons[2].setBorderPainted(false);
                            }                             
                            break;
                            
                            
                        }
                    }     
                    
                }
            });
        }

        for(int i=10; i<17; i++)
        {
            buttons[i]=new JButton("Carte n*"+(i-9));
            panel[2].add(buttons[i]);

            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent event) {

                    for(int i=10; i<17; i++)
                    {
                        for(int j=0; j<cartes.length; j++)

                        for(int k=0; k<cart.ListeIcon().length; k++)
                        {
                            if(event.getSource()==buttons[i])
                            {
                                buttons[i].setText("");

                                buttons[1].setText("");
                                buttons[1].setIcon(buttons[i].getIcon());//generer la carte selectionne par joueur
                                buttons[1].setOpaque(false);
                                //enlever la zone de contenu
                                buttons[1].setContentAreaFilled(false);
                                //enlever la bordure
                                buttons[1].setBorderPainted(false);

                                
                                break;
                            }
                        }
                    }     
                    
                }
            });
        }

        buttons[0].addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                for(int i=3; i<17; i++)
                {
                    for(int k=0; k<cartes.length; k++)

                    for(int j=0; j<cartes[k].ListeIcon().length; j++)
                    {
                        //image[j]=(ImageIcon) affJeu.getButtons()[i].getIcon();
                        int range=(cartes[k].ListeIcon().length-1);
                        int nbr = (int)(Math.random() * range) + j;
                                
                        //affJeu.getButtons()[i]=new JButton(affJeu.getIcons()[0]);
                        
                        buttons[i].setText("");
                        buttons[i].setIcon(cartes[k].ListeIcon()[nbr]);

                        buttons[i].setOpaque(false);
                        //enlever la zone de contenu
                        buttons[i].setContentAreaFilled(false);
                        //enlever la bordure
                        buttons[i].setBorderPainted(false);

                        if(buttons[i].getText().equals(""))
                        {
                            buttons[i].setIcon(cartes[k].ListeIcon()[nbr]);
                        }
                        else
                        {
                                    
                        }

                        if(i<=17)
                        {
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }
                }
            }
        });
        
        

        this.setLayout(new GridLayout(4, 1));

		// Sets the game pane (level) to the playScreen JFrame
		
		this.getGlassPane().setVisible(true);

		Timer timer = new Timer(10,this);
		timer.start();
    }
    public JPanel[] getPanels()
    {
        return this.panel;
    }
    public JButton[] getButtons()
    {
        return this.buttons;
    }
    public Level getLevel()
    {
        return this.content;
    }
    public Serveur getServeur() throws IOException
    {
        serveur=new Serveur();
        return this.serveur;
    }
    public void actionPerformed(ActionEvent e) 
    {
		this.repaint();
	}
    public Carte[] getCarte()
    {
        return this.cartes;
    }
}