class Good implements IState {
    private int count = 2;

    @Override
    public void currentState(Person person) {
        System.out.println("Im feeling good!");

        if(--count == 0)
            person.setState(new Okay());
    }
}
