public class Person {
    private IState state;

    public Person() {
        this.state = new Good();
    }

    void setState(IState state) {
        this.state = state;
    }

    public void askForState(String ask) {
        System.out.println(ask);
        state.currentState(this);
    }

}
