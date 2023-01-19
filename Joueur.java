package joueur;

public class Joueur
{
    public int id;
    public String pseudo;
    public int score;

    public Joueur(){}
    
    public Joueur(int Jid, String Jpseudo, int Jscore)
    {
        this.id=Jid;
        this.pseudo=Jpseudo;
        this.score=Jscore;
    }
    public int GetId()
    {
        return this.id;
    }
    public void setId(int Jid)
    {
        this.id=Jid;
    }
    public String GetPseudo()
    {
        return this.pseudo;
    }
    public void setPseudo(String Jpseudo)
    {
        this.pseudo=Jpseudo;
    }
    public int GetScore()
    {
        return this.score;
    }
    public void setScore(int Jscore)
    {
        this.score=Jscore;
    }
    public int limiteJoueur(int limite)
    {
        return limite;
    }
}