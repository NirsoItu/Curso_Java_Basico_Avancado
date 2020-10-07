package abstracts;

// Essa classe não pode ser instanciada, é necessario sobrescrever em outra classe

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String desenha(int x, int y){
        return "Desenhando as coordenadas x= "+x+"e "+ "y= "+y;
    }
}
