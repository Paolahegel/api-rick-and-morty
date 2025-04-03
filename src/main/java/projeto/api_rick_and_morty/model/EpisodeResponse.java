package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record EpisodeResponse(String id,
                              String name,
                              String air_date,
                              String episode,
                              List<String> characters) {
}
