import java.util.Random;

/**
 * Random connection Factory
 * @author Timo Grautstück
 * @version 19.11.2021
 */

abstract class RandomConnectionFactory {
    /**
     * Create random connection.
     */
    public RandomConnectionFactory() {
        IDatabase database = newInstance();
        database.connection();
        database.getResponse(new Random().nextBoolean());
    }
    public abstract IDatabase newInstance();
}
