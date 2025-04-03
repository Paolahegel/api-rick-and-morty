package projeto.api_rick_and_morty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationResponse(int id,
                               String name,
                               String type,
                               String dimension,
                               List<String> residents) {
}
