import static org.junit.Assert.*;
import org.junit.Test;

public class TestObserverPattern {

    @Test
    public void testCreateObserver() {
        HappySubscriber happySub = new HappySubscriber();
        MadSubscriber madSub = new MadSubscriber();

        // Check if Objects got instantiated
        assertNotNull(madSub);
        assertNotNull(happySub);
    }

    @Test
    public void testCreateSubject() {
        Magazine testMagazine = new Magazine();

        // check if Object got instantiated
        assertNotNull(testMagazine);
    }

    @Test
    public void testRegisterObserver() {
        Magazine magazine = new Magazine();

        HappySubscriber happySub = new HappySubscriber();
        MadSubscriber madSub = new MadSubscriber();

        magazine.register(happySub);
        magazine.register(madSub);
    }

    @Test
    public void testNotifyObserver() {
        Magazine magazine = new Magazine();

        HappySubscriber happySub = new HappySubscriber();
        MadSubscriber madSub = new MadSubscriber();

        magazine.register(happySub);
        magazine.register(madSub);

        magazine.setEdition("January 2022");

        assertEquals(magazine.getEdition(), happySub.getEdition());
        assertEquals(magazine.getEdition(), madSub.getEdition());
    }

    @Test
    public void testUnregisterObserver() {
        Magazine magazine = new Magazine();

        HappySubscriber happySub = new HappySubscriber();
        MadSubscriber madSub = new MadSubscriber();

        magazine.register(happySub);
        magazine.register(madSub);

        magazine.setEdition("January 2022");
        magazine.unregister(madSub);

        magazine.setEdition("February 2022");

        assertEquals(magazine.getEdition(), happySub.getEdition());
        assertNotEquals(magazine.getEdition(), madSub.getEdition());
    }
}
