import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {
    
    @Test
    void testSafetyCar() {
        SafetyCar voituresafety1 =SafetyCar.getInstance();
        SafetyCar voituresafety2 =SafetyCar.getInstance();
        assertEquals(voituresafety1,voituresafety2);
    }
    @Test
    void testRenault() {
        VoitureDuChampionnatDeFormuleUn Renault1 = VoitureConstructor.getTypeCar(ConstructeurAutmobile.Renault);
        Renault RenColor = new Renault();
        String color = RenColor.getColor();

        assertEquals(color,"Bleu");
        assertTrue(Renault1 instanceof Renault);
    }

    @Test
    void testMercedes() {
        VoitureDuChampionnatDeFormuleUn Mercedes1 = VoitureConstructor.getTypeCar(ConstructeurAutmobile.Mercedes);
        Renault MerColor = new Mercedes();
        String color = MerColor.getColor();

        assertEquals(color,"Noir");
        assertTrue(Mercedes1 instanceof Mercedes);
    }

    @Test
    void testferrari() {
        VoitureDuChampionnatDeFormuleUn Ferrari1 = VoitureConstructor.getTypeCar(ConstructeurAutmobile.Ferrari);
        Renault MerColor = new Ferrari();
        String color = MerColor.getColor();

        assertEquals(color,"Rouge");
        assertTrue(Ferrari1 instanceof Ferrari);
    }
}
}