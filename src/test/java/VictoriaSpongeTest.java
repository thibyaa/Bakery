import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VictoriaSpongeTest {

    VictoriaSponge victoriaSponge;
    @BeforeEach
    public void setUp(){
        victoriaSponge = new VictoriaSponge("Victoria Sponge", 6.00, 4, 2, "Vanilla", "Round", "Strawberry Jam");
    }

    @Test
    public void canCombineLayers(){
        assertThat(victoriaSponge.combineLayers()).isEqualTo("Layers combined with Strawberry Jam");
    }
}
