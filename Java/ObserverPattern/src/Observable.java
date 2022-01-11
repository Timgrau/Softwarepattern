interface Observable {

    void register(ISubscriber subscriber);

    void unregister(ISubscriber subscriber);

    void notifyObserver();
}
