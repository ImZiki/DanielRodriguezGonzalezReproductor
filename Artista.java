package evf.javadoc;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
    //DanielRodriguezGonzalez
    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
    
}


