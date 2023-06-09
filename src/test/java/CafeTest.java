import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CafeTest {

    BakeryProduct bakeryProduct1;
    BakeryProduct bakeryProduct2;

    Cafe cafe;

    @BeforeEach
    public void setUp(){
        cafe = new Cafe("Khadiza's Bakery");
        bakeryProduct1 = new ChocolateCake("Chocolate Cake",4.00, 3, 5, "Chocolate", "Square", 4);
        bakeryProduct2 = new VictoriaSponge("Victoria Sponge", 6.00, 4, 2, "Vanilla", "Round", "Strawberry");
        cafe.addToCollection(bakeryProduct1);
        cafe.addToCollection(bakeryProduct2);
    }

    @Test
   public void cakeAddToCollection(){
        assertThat(cafe.countNumberOfProducts()).isEqualTo(2);
    }

    @Test
    public void canSellProducts(){
        assertThat(cafe.sellProducts(bakeryProduct1)).isEqualTo(true);
        assertThat(cafe.getTill()).isEqualTo(4.00);
        assertThat(cafe.countNumberOfProducts()).isEqualTo(1);
    }

}
