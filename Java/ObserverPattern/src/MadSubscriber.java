public class MadSubscriber implements ISubscriber {
    private String edition;

    @Override
    public void update(String edition) {
        this.edition = edition;
        System.out.println("The magazine from " + edition + " is bad!");
    }

    public String getEdition() {
        return this.edition;
    }
}
