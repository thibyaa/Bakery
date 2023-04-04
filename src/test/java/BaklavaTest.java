import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaklavaTest {

    Baklava baklava;
    @BeforeEach
    public void setUp() {
        baklava = new Baklava("Baklava", 5.00, 6, true, 4);
    }
    @Test
    public void canBake(){
        assertThat(baklava.bake()).isEqualTo("Bake for 30 minutes");
    }

}
