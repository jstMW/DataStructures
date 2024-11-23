package List;

/**
 * the implementation of List using Array data structure
 */

public abstract class AbstractArrayList<T> implements List<T> {

    private int size;

    /**
     * show size of the array list
     * 
     * @param nothing
     * @return size
     */
    public int size() {
        return size;
    }

    /**
     * check if the array list is empty
     * 
     * @param nothing
     * @return true if empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

}
