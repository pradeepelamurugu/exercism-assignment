import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.lang.reflect.Array;

class SimpleLinkedList<T> {
    ArrayList<T> list = new ArrayList<>();
    SimpleLinkedList() {
        ArrayList<T> list = new ArrayList<>();
    }

    SimpleLinkedList(T[] values) {
        list.addAll(Arrays.asList(values));
    }

    void push(T value) {
        list.add(value);
    }

    T pop() {
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        T element = list.get(list.size()-1);
        list.remove(list.size()-1);
        return element;
    }

    void reverse() {
        for (int i = 0; i < list.size() / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
    }

    T[] asArray(Class<T> clazz) {
        reverse();
        T[] result = (T[]) Array.newInstance(clazz, list.size());
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    int size() {
        return list.size();
    }
}
