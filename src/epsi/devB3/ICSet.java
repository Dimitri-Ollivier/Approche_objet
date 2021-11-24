package epsi.devB3;

public interface ICSet {

    public static final int SET_MAX_SIZE = 100;

    void add(Object o);
    boolean isEmpty();
    Object getItem(int index);
    boolean contains(Object o);
    int getSize();
    int getSetMaxSize();
}
