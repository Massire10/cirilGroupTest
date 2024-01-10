import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try {
            Carte carte = new Carte("carte-v2.txt");
            Personnage personnage = new Personnage(3, 0);

            // Déplacer le personnage
            personnage.deplacer('S', carte);
            personnage.deplacer('S', carte);
            personnage.deplacer('S', carte);
            personnage.deplacer('E', carte);
            personnage.deplacer('E', carte);
            personnage.deplacer('E', carte);
            personnage.deplacer('E', carte);
            personnage.deplacer('N', carte);
            personnage.deplacer('N', carte);

            // Afficher le résultat
            carte.afficherCarte();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}