package List;

/**
 * General interface for the List data structure
 * in which we are able to add/remove elements not
 * only into/from start or end but also in between!
 */
public interface List<T> {

    /**
     * current size of the List
     * 
     * @param doesn't need any
     * @return int
     */
    int size();

    /**
     * check if the list is empty
     * 
     * @param doesn't need any
     * @return true if empty and false in not empty
     */
    boolean isEmpty();

    /**
     * retrieve an element at the specified index
     * 
     * @param index to locate the value
     * @return the element or null if the index has no value
     */
    T get(int index);

    /**
     * set the new value at specifed index
     * 
     * @param index and new element
     * @return element adn null if the index has no value
     */
    T set(int index, T element);

    /**
     * remove the element at specifed index
     * 
     * @param index to locate the value
     * @return it is purefunction
     */
    void remove(int index);

}
