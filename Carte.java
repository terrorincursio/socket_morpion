package jeu;

import javax.swing.*;
import java.awt.*;

public class Carte
{
    int idCarte;
    String nomDeCarte;
    String categorie;
    ImageIcon icone;

    public Carte(){}

    public Carte(int CidCarte, String CnomDeCarte, String Ccategorie, ImageIcon Cicon)
    {
        this.idCarte=CidCarte;
        this.nomDeCarte=CnomDeCarte;
        this.categorie=Ccategorie;
        this.icone=Cicon;
    }
    public int GetidCarte()
    {
        return this.idCarte;
    }
    public void setidCarte(int CidCarte)
    {
        this.idCarte=CidCarte;
    }
    public String GetnomDeCarte()
    {
        return this.nomDeCarte;
    }
    public void setnomDeCarte(String CnomDeCarte)
    {
        this.nomDeCarte=CnomDeCarte;
    }
    public String Getcategorie()
    {
        return this.categorie;
    }
    public void Setcategorie(String Ccategorie)
    {
        this.categorie=Ccategorie;
    }
    public ImageIcon[] ListeIcon()
    {
        ImageIcon[] icon=new ImageIcon[54];
        icon[0]=new ImageIcon("ressource\\img\\Carreau\\As_carreau.png");
        icon[1]=new ImageIcon("ressource\\img\\Carreau\\2_carreau.png");
        icon[2]=new ImageIcon("ressource\\img\\Carreau\\3_carreau.png");
        icon[3]=new ImageIcon("ressource\\img\\Carreau\\4_carreau.png");
        icon[4]=new ImageIcon("ressource\\img\\Carreau\\5_carreau.png");
        icon[5]=new ImageIcon("ressource\\img\\Carreau\\6_carreau.png");
        icon[6]=new ImageIcon("ressource\\img\\Carreau\\7_carreau.png");
        icon[7]=new ImageIcon("ressource\\img\\Carreau\\8_carreau.png");
        icon[8]=new ImageIcon("ressource\\img\\Carreau\\9_carreau.png");
        icon[9]=new ImageIcon("ressource\\img\\Carreau\\10_carreau.png");
        icon[10]=new ImageIcon("ressource\\img\\Carreau\\Valet_carreau.png");
        icon[11]=new ImageIcon("ressource\\img\\Carreau\\Reine_carreau.png");
        icon[12]=new ImageIcon("ressource\\img\\Carreau\\Roi_carreau.png");

        icon[13]=new ImageIcon("ressource\\img\\Trefle\\As_trefle.png");
        icon[14]=new ImageIcon("ressource\\img\\Trefle\\2_trefle.png");
        icon[15]=new ImageIcon("ressource\\img\\Trefle\\3_trefle.png");
        icon[16]=new ImageIcon("ressource\\img\\Trefle\\4_trefle.png");
        icon[17]=new ImageIcon("ressource\\img\\Trefle\\5_trefle.png");
        icon[18]=new ImageIcon("ressource\\img\\Trefle\\6_trefle.png");
        icon[19]=new ImageIcon("ressource\\img\\Trefle\\7_trefle.png");
        icon[20]=new ImageIcon("ressource\\img\\Trefle\\8_trefle.png");
        icon[21]=new ImageIcon("ressource\\img\\Trefle\\9_trefle.png");
        icon[22]=new ImageIcon("ressource\\img\\Trefle\\10_trefle.png");
        icon[23]=new ImageIcon("ressource\\img\\Trefle\\Valet_trefle.png");
        icon[24]=new ImageIcon("ressource\\img\\Trefle\\Reine_trefle.png");
        icon[25]=new ImageIcon("ressource\\img\\Trefle\\Roi_trefle.png");

        icon[26]=new ImageIcon("ressource\\img\\Coeur\\As_coeur.png");
        icon[27]=new ImageIcon("ressource\\img\\Coeur\\2_coeur.png");
        icon[28]=new ImageIcon("ressource\\img\\Coeur\\3_coeur.png");
        icon[29]=new ImageIcon("ressource\\img\\Coeur\\4_coeur.png");
        icon[30]=new ImageIcon("ressource\\img\\Coeur\\5_coeur.png");
        icon[31]=new ImageIcon("ressource\\img\\Coeur\\6_coeur.png");
        icon[32]=new ImageIcon("ressource\\img\\Coeur\\7_coeur.png");
        icon[33]=new ImageIcon("ressource\\img\\Coeur\\8_coeur.png");
        icon[34]=new ImageIcon("ressource\\img\\Coeur\\9_coeur.png");
        icon[35]=new ImageIcon("ressource\\img\\Coeur\\10_coeur.png");
        icon[36]=new ImageIcon("ressource\\img\\Coeur\\Valet_coeur.png");
        icon[37]=new ImageIcon("ressource\\img\\Coeur\\Reine_coeur.png");
        icon[38]=new ImageIcon("ressource\\img\\Coeur\\Roi_coeur.png");

        icon[39]=new ImageIcon("ressource\\img\\Pique\\As_pique.png");
        icon[40]=new ImageIcon("ressource\\img\\Pique\\2_pique.png");
        icon[41]=new ImageIcon("ressource\\img\\Pique\\3_pique.png");
        icon[42]=new ImageIcon("ressource\\img\\Pique\\4_pique.png");
        icon[43]=new ImageIcon("ressource\\img\\Pique\\5_pique.png");
        icon[44]=new ImageIcon("ressource\\img\\Pique\\6_pique.png");
        icon[45]=new ImageIcon("ressource\\img\\Pique\\7_pique.png");
        icon[46]=new ImageIcon("ressource\\img\\Pique\\8_pique.png");
        icon[47]=new ImageIcon("ressource\\img\\Pique\\9_pique.png");
        icon[48]=new ImageIcon("ressource\\img\\Pique\\10_pique.png");
        icon[49]=new ImageIcon("ressource\\img\\Pique\\Valet_pique.png");
        icon[50]=new ImageIcon("ressource\\img\\Pique\\Reine_pique.png");
        icon[51]=new ImageIcon("ressource\\img\\Pique\\Roi_pique.png");

        icon[52]=new ImageIcon("ressource\\img\\Joker.jpg");
        icon[53]=new ImageIcon("ressource\\img\\Dos_de_carte_2.jpg");

        return icon;
    }
    public ImageIcon getIcon()
    {
        return this.icone;
    }
    public void setIcon(ImageIcon Cicon)
    {
        this.icone=Cicon;
    }
    public String[] listeNomCarte()
    {
        String[] nomDeCarte=new String[14];

        nomDeCarte[0]="As";
        nomDeCarte[1]="2";
        nomDeCarte[2]="3";
        nomDeCarte[3]="4";
        nomDeCarte[4]="5";
        nomDeCarte[5]="6";
        nomDeCarte[6]="7";
        nomDeCarte[7]="8";
        nomDeCarte[8]="9";
        nomDeCarte[9]="10";
        nomDeCarte[10]="Valet";
        nomDeCarte[11]="Reine";
        nomDeCarte[12]="Roi";
        nomDeCarte[13]="Joker";

        return nomDeCarte;
    }
    public String[] listeCategorie()
    {
        String[] categorieCarte=new String[4];

        categorieCarte[0]="Carreau";
        categorieCarte[1]="Trefle";
        categorieCarte[2]="Coeur";
        categorieCarte[3]="Pique";

        return categorieCarte;
    }
    public boolean hierachie(int indice)
    {
        boolean hierarchie=false;

        for(int i=0; i<listeNomCarte().length; i++)
        {
            if((indice<=i && (indice!=0 || indice!=13)))
            {
                hierarchie=false;
            }
            else if((indice==0 && i!=13) || indice==13)
            {
                hierarchie=true;
            }
            else
            {
                hierarchie=true;
            }
        }
        return hierarchie;
    }
    public boolean hierarchieCategorie(int indC)
    {
        boolean hierarchie=false;

        for(int i=0; i<listeCategorie().length; i++)
        {
            if(indC>=i)
            {
               hierarchie=true;
            }
            else
            {
                hierarchie=false;
            }
        }
        return hierarchie;
    }
    public String[][] JeuDeCarte()
    {
        String[][] carteJeu=new String[listeCategorie().length][listeNomCarte().length];

        for(int i=0; i<listeCategorie().length; i++)
        {
            for(int j=0; j<listeNomCarte().length; j++)
            {
                if(j<=12)
                {
                    carteJeu[i][j]=listeNomCarte()[j]+" "+listeCategorie()[i];
                }
                else
                {
                    carteJeu[i][j]=listeNomCarte()[j];
                }
            }
        }
        return carteJeu;
    }
    public boolean hierarchieJeuB(int indc, int indN)
    {
        boolean hierarchie=false;

        for(int i=0; i<listeCategorie().length; i++)
        {
            for(int j=0; j<listeNomCarte().length; j++)
            {
                if((indc<=i && indN<j))
                {
                    hierarchie=false;
                }
                else if((indc>=i && indN>j))
                {
                    hierarchie=true;
                }
                else
                {
                    hierarchie=false;
                }
            }
        }
        return hierarchie;
    }
}