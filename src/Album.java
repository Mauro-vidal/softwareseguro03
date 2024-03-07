import java.util.ArrayList;
import java.util.List;

public class Album extends Musica {

    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas;


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }


    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public Album(String genero, int ano, String nome, String artista, ArrayList<Musica> musicas, String titulo, String duracao, String compositor) {
        super(titulo, duracao, compositor);
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostrarTodosOsDados() {
        System.out.println("Gênero: " + getGenero());
        System.out.println("Ano: " + getAno());
        System.out.println("Nome: " + getNome());
        System.out.println("Artista: " + getArtista());
        System.out.println("Músicas:");
        for (Musica musica : getMusicas()) {
            System.out.println(musica.getTitulo());
        }
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Compositor: " + getCompositor());
    }
}
