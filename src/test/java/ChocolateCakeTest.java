import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChocolateCakeTest {

    ChocolateCake chocolateCake;
    @BeforeEach
    public void setUp(){
        chocolateCake = new ChocolateCake("Chocolate Cake",4.00, 3, 5, "Chocolate", "Square", 4);
    }

    @Test
    public void canAddChocolateChips(){
        assertThat(chocolateCake.addChocolateChips()).isEqualTo("Yay, diabetes");
    }

    @Test
    public void canBake(){
        assertThat(chocolateCake.bake(45)).isEqualTo("Bake for 45 minutes");
    }

    @Test
    public void canMixIngredients(){
        assertThat(chocolateCake.mixIngredients()).isEqualTo("4 cups of Cocoa powder was mixed with flour");
    }
}
