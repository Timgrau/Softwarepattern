/**
 * @author Timo Grautstück
 * @version 19.11.2021
 */
class MongoDB implements IDatabase {

    @Override
    public void getResponse( boolean connected ) {
        if( connected )
            System.out.println("Successfully connected to MongoDB!");
        else
            System.out.println("Connection to MongoDB could not be established!");
    }

    @Override
    public void connection() {
        System.out.println("...Connecting to MongoDB...");
    }
}
