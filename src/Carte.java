import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Carte {
    private char[][] grille;

    public Carte(String cheminFichier) throws IOException {
        //Lecture du fichier et construction de la grille
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cheminFichier));
        int lignes = 0;
        int colonnes = 0;

        // Compter le nombre de lignes et de colonnes dans le fichier
        String ligne = bufferedReader.readLine();
        while (ligne != null) {
            lignes++;
            colonnes = (colonnes > ligne.length()) ? colonnes : ligne.length();
        }

        // Initialiser la carte avec les dimensions trouvées
        grille = new char[lignes][colonnes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                grille[i][j] = ' ';
            }
        }

        // Charger la carte à partir du fichier
        bufferedReader = new BufferedReader(new FileReader(cheminFichier));
        int ligneActuelle = 0;
        while ((ligne = bufferedReader.readLine()) != null) {
            char[] caracteres = ligne.toCharArray();
            for (int j = 0; j < caracteres.length; j++) {
                grille[ligneActuelle][j] = caracteres[j];
            }
            ligneActuelle++;
        }

        bufferedReader.close();
    }

    public void afficherCarte() {
        for (char[] ligne : grille) {
            for (char g : ligne) {
                System.out.print(g);
            }
            System.out.println();
        }
    }

    public char getCase(int x, int y) {
        return (estDansLesLimites(x, y)) ? grille[x][y] : '#';
        //return grille[x][y];
    }

    private boolean estDansLesLimites(int x, int y) {
        return x >= 0 && x < grille.length && y >= 0 && y < grille[0].length;
    }


    public int getLargeur() {
        return grille[0].length;
    }

    public int getHauteur() {
        return grille.length;
    }

}
