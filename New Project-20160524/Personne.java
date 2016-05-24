public class Personne{


    public String Nom;
    public String Prenom;
    public String Addresse;
    public String Classe;

     
     public String GetNom(){
        return Nom;
     }
     
     public String GetPrenom(){
        return Prenom;
     }
     
     public String GetAddresse(){
        return Addresse;
     }
     public String GetClasse(){
        return Classe;
     }
     
     
     public void SetNom(String SNom){
        Nom = SNom;
     }
     
     public void SetPrenom(String SPrenom){
        Prenom = SPrenom;
     }
     
     public void SetAddresse(String SAddresse){
        Addresse = SAddresse;
     }
     public void SetClasse(String SClasse){
        Classe = SClasse;
     }
     
     
     
     
     public String ToString(){
         String Str = new String();
         
        Str = "Je suis " + this.Nom + " " + this.Prenom + " de la classe " + this.Classe + " et j'habite au " + this.Addresse + ".";
        return Str;
     }
     
     
     
}
