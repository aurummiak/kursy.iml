package lessons.homework.stage13.model.logic;

import homework.stage13.model.entity.Artifact;
import homework.stage13.model.logic.GameHero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameHeroTest {
    @Test
    public void testCalculateTotalRecoveryPositive() { // подсчет общего восстановления
        Artifact[] artifacts = {
                new Artifact("Fire", 1.00, 2.00, 90.00, false),
                new Artifact("Hydro", 2.00, 2.00, 60.00, true),
                new Artifact("Wind", 1.50, 1.00, 100.00, true),
                new Artifact("Geo", 2.50, 5.00, 50.00, false),
        };

        double expected = 7.00;

        double actual = GameHero.calculateTotalRecovery(artifacts);

        assertEquals(expected, actual, 0.01);

    }

    @Test
    public void testCalculateTotalPowerPositive() { // подсчет общей силы
        Artifact[] artifacts = {
                new Artifact("Fire", 1.00, 2.00, 90.00, false),
                new Artifact("Hydro", 2.00, 2.00, 60.00, true),
                new Artifact("Wind", 1.50, 1.00, 100.00, true),
                new Artifact("Geo", 2.50, 5.00, 50.00, false),
        };

        double expected = 10.00;

        double actual = GameHero.calculateTotalPower(artifacts);

        assertEquals(expected, actual, 0.01);

    }

    @Test
    public void testCalculateTotalStaminaPositive() { // подсчет общей стамины
        Artifact[] artifacts = {
                new Artifact("Fire", 1.00, 2.00, 90.00, false),
                new Artifact("Hydro", 2.00, 2.00, 60.00, true),
                new Artifact("Wind", 1.50, 1.00, 100.00, true),
                new Artifact("Geo", 2.50, 5.00, 50.00, false),

        };

        double expected = 300.00;

        double actual = GameHero.calculateTotalStamina(artifacts);

        assertEquals(expected, actual, 0.01);

    }

    @Test
    public void tesCheckTreatmentFromArtifacts(){ // проверка лечения артефакта
        Artifact[] artifacts = {
                new Artifact("Fire", 1.00, 2.00, 90.00, false),
                new Artifact("Hydro", 2.00, 2.00, 60.00, false),
                new Artifact("Wind", 1.50, 1.00, 100.00, true),
                new Artifact("Geo", 2.50, 5.00, 50.00, true),
        };

        boolean expected = false;

        boolean actual = GameHero.checkTreatmentFromArtifacts(artifacts);

        assertEquals(expected, actual);


    }


}
