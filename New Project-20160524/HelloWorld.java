public class HelloWorld extends Personne
{

     public static void main(String []args){
        System.out.println("Hello World");
        Personne Personne = new Personne();
        Personne.SetNom("Moua");
        Personne.SetPrenom("Paul");
        Personne.SetClasse("3C");
        Personne.SetAddresse("Promenade des Comediens");
        System.out.println(Personne.ToString());
     }
}
