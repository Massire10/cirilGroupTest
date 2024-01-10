public class Personnage {
    private int x;
    private int y;

    public Personnage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(char direction, Carte carte) {

        if (direction == 'N') {
            if (y > 0 && carte.getCase(x, y - 1) == ' ')
                y--;
        } else if (direction == 'S') {
            if (y < carte.getHauteur() - 1 && carte.getCase(x, y + 1) == ' ')
                y++;
        } else if (direction == 'E') {
            if (x < carte.getLargeur() - 1 && carte.getCase(x + 1, y) == ' ')
                x++;
        } else if (direction == 'O') {
            if (x > 0 && carte.getCase(x - 1, y) == ' ')
                x--;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
