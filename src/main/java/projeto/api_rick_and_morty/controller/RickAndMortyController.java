package projeto.api_rick_and_morty.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projeto.api_rick_and_morty.client.RickAndMortyClient;
import projeto.api_rick_and_morty.model.CharacterResponse;
import projeto.api_rick_and_morty.model.ListOfEpisodesResponse;
import projeto.api_rick_and_morty.model.LocationResponse;


/**
 * Controller responsável por expor endpoints para acessar informações da API pública do Rick and Morty.
 *
 * <p>Esta classe define as rotas da API e utiliza {@link RickAndMortyClient} para interagir com a API externa.</p>
 *
 * <p>Os métodos disponíveis permitem buscar dados sobre personagens, episódios e localizações,
 * seguindo a documentação oficial da API do Rick and Morty:
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.</p>
 *
 * <p>Os endpoints estão mapeados com anotações do Spring, como {@code @GetMapping}, e retornam respostas com status HTTP apropriados.</p>
 *
 * @author @paolahegel
 * @version 1.0
 */
@RestController
@RequestMapping("/api/rick-and-morty")
@AllArgsConstructor
public class RickAndMortyController {

    RickAndMortyClient rickAndMortyClient;

    @GetMapping("/character/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CharacterResponse getCharacterById(@PathVariable String id) {
        return rickAndMortyClient.findCharacterById(id);
    }

    @GetMapping("/episode")
    @ResponseStatus(HttpStatus.OK)
    public ListOfEpisodesResponse listAllEpisode() {
        return rickAndMortyClient.listAllEpisodes();
    }

    @GetMapping("/location/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LocationResponse getLocationById(@PathVariable String id) {
        return rickAndMortyClient.findLocationById(id);
    }

}
