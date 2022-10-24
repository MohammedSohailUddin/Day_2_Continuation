package Exercise9;

import java.util.List;
import java.util.ArrayList;

public class Media {
    private List<Mediaa> resources = new ArrayList<Mediaa>();
    public void addMedia(Mediaa x) {
        resources.add(x);
    }
    public Mediaa retrieveLast() {
        int size = resources.size();
        if (size > 0) {
            return (Mediaa)resources.get(size - 1);
        }
        return null;
    }


interface Mediaa {
}

interface Book extends Mediaa {
}

interface Video extends Mediaa{
}

interface Newspaper extends Mediaa{
}
public static void main(String args[]) {
}
}