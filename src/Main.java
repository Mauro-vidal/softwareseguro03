import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Idade da pessoa:");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);

        System.out.println("Digite o título da música:");
        String tituloMusica = scanner.nextLine();
        System.out.println("Digite a duração da música:");
        String duracaoMusica = scanner.nextLine();
        System.out.println("Digite o nome do compositor:");
        String compositorMusica = scanner.nextLine();
        Musica musica = new Musica(tituloMusica, duracaoMusica, compositorMusica);

        ArrayList<Musica> musicas = new ArrayList<>();
        musicas.add(musica);

        System.out.println("Informe o gênero do álbum:");
        String generoAlbum = scanner.nextLine();
        System.out.println("Ano do álbum:");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do álbum:");
        String nomeAlbum = scanner.nextLine();
        System.out.println("Nome do artista:");
        String artistaAlbum = scanner.nextLine();
        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum, musicas, musica.getTitulo(), musica.getDuracao(), musica.getCompositor());

        album.mostrarTodosOsDados();

        scanner.close();
    }

}

