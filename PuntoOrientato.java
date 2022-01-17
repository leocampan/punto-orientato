import java.util.*;

public class PuntoOrientato extends Punto {
    // attributi
    private char orientamento;

    // costruttori
    public PuntoOrientato() {
        super(0., 0.);
        this.orientamento = 'A';
    }

    public PuntoOrientato(double x, double y, char orientamento) {
        super(x, y);
        this.orientamento = orientamento;
        setOrientamento(orientamento);
    }

    // costruttore di copia
    public PuntoOrientato(PuntoOrientato po) {
        super(po.getX(), po.getY());
        setOrientamento(po.getOrientamento());
    }

    // metodi
    public char getOrientamento() {
        return this.orientamento;
    }

    public void setOrientamento(char orientamento) {
        this.orientamento = orientamento;
    }

    public PuntoOrientato orientamento(char orientamento) {
        setOrientamento(orientamento);
        return this;
    }

    public void ruotaDestra() {
        switch (orientamento) {
            case 'A':
                orientamento = 'D';
            break;
                
            case 'B':
                orientamento = 'S';
            break;

            case 'D':
                orientamento = 'B';
            break;

            case 'S':       
                orientamento = 'A';
            break;

            default:
            break;
        }
    }

    public void ruotaSinistra() {
        switch (orientamento) {
            case 'A':
                orientamento = 'S';
            break;
                
            case 'B':
                orientamento = 'D';
            break;

            case 'D':
                orientamento = 'A';
            break;

            case 'S':       
                orientamento = 'B';
            break;

            default:
            break;
        }
    }

    public void sposta(double distanza) {
        switch (orientamento) {
            case 'A':
               setY(getY() + distanza);
            break;
                
            case 'B':
                setY(getY() - distanza);
            break;

            case 'D':
               setX(getX() + distanza);
            break;

            case 'S':       
                setX(getX() - distanza);
            break;

            default:
            break;
        }
    }

    public boolean equals(PuntoOrientato po) {
        return (super.getX() == po.getX() && super.getY() == po.getY() && this.getOrientamento() == po.getOrientamento());
    }

    public int hashCode() {
        return Objects.hashCode(orientamento);
    }

    public String toString() {
        return super.toString() + "\nOrientamento = " + getOrientamento() + "\n";
    }

}
