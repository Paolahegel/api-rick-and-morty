package projeto.api_rick_and_morty.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import projeto.api_rick_and_morty.model.CharacterResponse;
import projeto.api_rick_and_morty.model.ListOfEpisodesResponse;
import projeto.api_rick_and_morty.model.LocationResponse;

/**
 * Client responsável por intermediar a comunicação entre a aplicação e a API pública do Rick and Morty.
 *
 * <p> Esta classe fornece métodos para buscar informações sobre personagens, episódios e localizações
 * da API externa, utilizando {@link RestTemplate} para realizar requisições HTTP de forma síncrona.</p>
 *
 * <p>Os endpoints utilizados seguem a documentação oficial da API, disponível em:
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.</p>
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

    public LocationResponse findLocationById(String id) {
        String url = BASE_URL + "/location/" + id;
        return restTemplate.getForObject(url, LocationResponse.class);
    }

}