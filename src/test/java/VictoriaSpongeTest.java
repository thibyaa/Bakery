import org.junit.jupiter.api.BeforeEach;

public class VictoriaSpongeTest {

    VictoriaSponge victoriaSponge;
    @BeforeEach
    public void setUp(){
        victoriaSponge = new VictoriaSponge("Victoria Sponge", 6.00, 4, 2, "Vanilla", "Round", "Strawberry");
    }


}
