package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * Modelo de resposta para representar informações sobre uma localização no universo de Rick and Morty.
 *
 * <p>Os nomes dos atributos seguem a estrutura definida na documentação oficial da API:</p>
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.
 *
 * <p>Esta classe utiliza o recurso de <b>Records</b> do Java para representar os dados de forma imutável e concisa.</p>
 */

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationResponse(int id,
                               String name,
                               String type,
                               String dimension,
                               List<String> residents) {
}
