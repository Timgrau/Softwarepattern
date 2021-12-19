/**
 * @author Timo Grautstück
 * @version 19.11.2021
 */
public class MySQLFactory extends RandomConnectionFactory {

    @Override
    public IDatabase newInstance() {
        return new MySQL();
    }
}
