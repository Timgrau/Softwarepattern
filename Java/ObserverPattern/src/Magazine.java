import java.util.ArrayList;
import java.util.List;

public class Magazine implements Observable {
    List<ISubscriber> subsList = new ArrayList<>();
    private String edition = null;

    public void setEdition(String edition) {
        this.edition = edition;
        notifyObserver();
    }

    public String getEdition() {
        return this.edition;
    }

    @Override
    public void register(ISubscriber subscriber) {
        subsList.add(subscriber);
    }

    @Override
    public void unregister(ISubscriber subscriber) {
        subsList.remove(subscriber);
    }

    @Override
    public void notifyObserver() {
        for (ISubscriber subscriber : subsList) {
            subscriber.update(this.getEdition());
        }
    }
}
