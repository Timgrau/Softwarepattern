public class HappySubscriber implements ISubscriber {
    private String edition = null;

    @Override
    public void update(String edition) {
        this.edition = edition;
        System.out.println("The magazine from " + edition + " is pretty good!");
    }

    public String getEdition() {
        return this.edition;
    }
}
