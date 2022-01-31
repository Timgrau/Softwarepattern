class Tired implements IState {
    private int count = 3;

    @Override
    public void currentState(Person person) {
        System.out.println("Im feeling tired.");

        if(--count == 0) {
            person.setState(new Good());
        }
    }
}
