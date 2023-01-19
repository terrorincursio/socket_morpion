package jeu;

public class Regle
{
    public boolean hierachie(int indice)
    {
        Carte carte=new Carte();

        boolean hierarchie=true;

        for(int i=0; i<carte.listeNomCarte().length; i++)
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
        Carte carte=new Carte();

        boolean hierarchie=true;

        for(int i=0; i<carte.listeCategorie().length; i++)
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
    public boolean hierarchieJeuBataille(int indc, int indN)
    {
        Carte carte=new Carte();

        boolean hierarchie=true;

        for(int i=0; i<carte.listeCategorie().length; i++)
        {
            for(int j=0; j<carte.listeNomCarte().length; j++)
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
    public boolean hierarchieJeuAutre(int indc, int indN)
    {
        Carte carte=new Carte();

        boolean hierarchie=true;

        for(int i=0; i<carte.listeCategorie().length; i++)
        {
            for(int j=0; j<carte.listeNomCarte().length; j++)
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
    public boolean ConditionVictoire(int indc, int indN)
    {
        boolean condition=true;

        if(hierarchieJeuBataille(indc, indN))
        {
            condition=true;
        }
        else
        {
            condition=false;
        }
        return condition;
    }
}