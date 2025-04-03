package projeto.api_rick_and_morty.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import projeto.api_rick_and_morty.model.CharacterResponse;
import projeto.api_rick_and_morty.model.ListOfEpisodesResponse;

/**
 * Client responsável por intermediar a comunicação entre
 * a aplicação e a API pública do Rick and Morty.
 *
 * <p> Esta classe fornece métodos para buscar informações sobre personagens da API externa.<p>
 *
 * <p>Utiliza {@link RestTemplate} para realizar requisições HTTP de forma síncrona.</p>
 *
 * @author @paolahegel
 * @version 1.0
 */
@Service
public class RickAndMortyClient {

    private final RestTemplate restTemplate;
    private static final String BASE_URL = "https://rickandmortyapi.com/api";


    public RickAndMortyClient() {
        this.restTemplate = new RestTemplate();
    }

    public CharacterResponse findCharacterById(String id) {
        String url = BASE_URL + "/character/" + id;
        return restTemplate.getForObject(url, CharacterResponse.class);
    }

    public ListOfEpisodesResponse listAllEpisodes() {
        String url = BASE_URL + "/episode/";
        return restTemplate.getForObject(url, ListOfEpisodesResponse.class);
    }

}