package joueur;

import jeu.*;

public class Score
{
    int idNameCard;
    int idCategorieCard;
    int score;

    public Score(){}
    
    public Score(int idName, int idCategorie, int Jscore)
    {
        this.idNameCard=idName;
        this.idCategorieCard=idCategorie;
        this.score=Jscore;
    }
    public int GetNameCard()
    {
        return this.idNameCard;
    }
    public void setNameCard(int idName)
    {
        this.idNameCard=idName;
    }
    public int GetIdCategorie()
    {
        return this.idCategorieCard;
    }
    public void setIdCategorie(int idCategorie)
    {
        this.idCategorieCard=idCategorie;
    }
    public int GetScore()
    {
        return this.score;
    }
    public void setScore(int Jscore)
    {
        this.score=Jscore;
    }
    public int generationDeScoreBataille(int indc, int indN)
    {
        Carte carte=new Carte();
        Regle regle=new Regle();

        int Jscore=0;

        if(regle.hierarchieJeuBataille(indc, indN))
        {
            score=score++;
        }
        else
        {
            score=0;
        }

        this.score=Jscore;

        return this.score;
    }
}