class Okay implements IState {

    @Override
    public void currentState(Person person) {
        System.out.println("Im feeling okay...");
        person.setState(new Tired());
    }
}
