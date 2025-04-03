package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 /**
 * Modelo de dados que representa a resposta da API do Rick and Morty para um personagem específico.
 *
 * <p>Os nomes dos atributos foram retirados diretamente da documentação oficial da API, disponível em:
 * <a href="https://rickandmortyapi.com/documentation">Rick and Morty API Documentation</a>.</p>
 *
 * <p>A anotação {@link JsonAutoDetect} permite a serialização e desserialização automática dos campos.</p>
 *
 * @param id Identificador único do personagem.
 * @param name Nome do personagem.
 * @param status Status do personagem (vivo, morto, desconhecido).
 * @param species Espécie do personagem.
 * @param image URL da imagem do personagem.
 * @param episode Lista de episódios em que o personagem aparece.
 *
 * @author @paolahegel
 * @version 1.0
 */

// Consegue visualizar todos os dados dos campos que recebem
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record CharacterResponse(String id,
                                String name,
                                String status,
                                String species,
                                String image,
                                List<String> episode) {
}
