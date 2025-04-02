package projeto.api_rick_and_morty.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dados {
    private int id;

    public Dados(int id) {
        this.id = id;
    }

}
