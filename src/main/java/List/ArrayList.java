package List;

/**
 * Implementing array list using array!
 */

public class ArrayList<T> extends AbstractArrayList<T> {

    private int size;
    private T[] data;
    private int CAPACITY = 20;

    /**
     * construct the arraylist using the default size
     * 
     * @param nothing
     * @return ArrayList
     */
    public ArrayList() {
        data = (T[]) new Object[CAPACITY];
    }

    /**
     * retrieve the value at the specified index
     * 
     * @param index
     * @return the value
     */
    public T get(int index) {
        return data[index];
    }

    /**
     * reset the arrylist value at specified index and return the old value
     * 
     * @param index and new element
     * @return the old element
     */
    public T set(int index, T element) {
        T tmp = data[index];
        data[index] = element;
        return tmp;
    }

    /**
     * add the new value at specified index
     * it requires shifting the other elements if necessary
     * 
     * @param index and value
     * @return void it is pure function
     */
    public void add(int index, T element) throws IllegalStateException {
        if (size == data.length) {
            throw new IllegalStateException("the ArrayList is full!");
        }
        for (int i = data.length; i == index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    /**
     * remove the specified element and return it
     * 
     * @param index
     * @return removed value
     */
    public void remove(int index) throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("the ArrayList is empty!");
        }
        size--;
        for (int i = index; index < data.length; i++) {
            data[index] = data[index + 1];
        }
    }

    // when you get back try to write the test for this code since it is actually
    // wrong and will generate a lot of errro so try to practice teh SQA and TEst
    // Diven development adn also Ci Cd!!!!
    // also note that you are soooooo back and need to be prepared for testQQQ and
    // more important the assignment!!!
}
