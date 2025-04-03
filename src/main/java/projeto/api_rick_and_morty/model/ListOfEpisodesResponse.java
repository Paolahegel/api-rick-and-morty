package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * Modelo de resposta para representar uma lista de episódios da série Rick and Morty.
 *
 * <p>Os nomes dos atributos seguem a estrutura definida na documentação oficial da API:</p>
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.
 *
 * <p>Essa classe encapsula uma lista de episódios retornados pela API pública.</p>
 *
 * @param results Lista de episódios, representados pelo modelo {@link EpisodeResponse}.
 *
 * @author @paolahegel
 * @version 1.0
 */

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ListOfEpisodesResponse(List<EpisodeResponse> results) {
}
