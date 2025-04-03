package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * Modelo de dados que representa a resposta da API do Rick and Morty para um episódio específico.
 *
 * <p>Os nomes dos atributos foram retirados diretamente da documentação oficial da API, disponível em:
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.</p>
 *
 * <p>A anotação {@link JsonAutoDetect} permite a serialização e desserialização automática dos campos.</p>
 *
 * @param id Identificador único do episódio.
 * @param name Nome do episódio.
 * @param air_date Data de exibição original do episódio.
 * @param episode Código do episódio (ex.: "S01E01").
 * @param characters Lista de URLs dos personagens que aparecem no episódio.
 *
 * @author @paolahegel
 * @version 1.0
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record EpisodeResponse(String id,
                              String name,
                              String air_date,
                              String episode,
                              List<String> characters) {
}
