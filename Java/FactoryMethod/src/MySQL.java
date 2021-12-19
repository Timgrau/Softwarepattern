/**
 * @author Timo Grautstück
 * @version 19.11.2021
 */
class MySQL implements IDatabase {

    @Override
    public void getResponse( boolean connected ) {
        if( connected )
            System.out.println("Successfully connected to MySQL!");
        else
            System.out.println("Connection to MySQL could not be established!");
    }

    @Override
    public void connection() {
        System.out.println("...Connecting to MySQL...");
    }
}
