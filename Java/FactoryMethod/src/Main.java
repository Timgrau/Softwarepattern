/**
 * Factory Method Pattern:
 * Define an interface for creating an object, but let subclasses decide which class to
 * instantiate. The factory method lets a class defer instantiation to subclasses.
 */
public class Main {

    public static void main(String[] args) {
        RandomConnectionFactory mongoDBFactory = new MongoDBFactory();
        RandomConnectionFactory mySQLFactory = new MySQLFactory();

        IDatabase sql = mySQLFactory.newInstance();
        IDatabase mongo = mongoDBFactory.newInstance();
    }
}
