package application;

import java.util.ArrayList;

/**
 * This class represents the "model", e.g. list of students in a student database, or list of products in an inventory app. 
 * It also contains some additional data items (fields) for passing information between windows.
 */
public class Database {

    private ArrayList<Item> _list = new ArrayList<Item>();    // List of items

    // Here you might load the list from a file.
    // This method just creates some list entries for demonstration purposes.
    public void load() {
        _list.clear();
        _list.add(new Item(1234, "Grapple Grommet"));
        _list.add(new Item(5678, "Wally Washer"));
        _list.add(new Item(9876, "Billy Bolt"));
    }
    
    // Get the number of items in the database
    public int getSize() {
        return _list.size();
    }
    
    // Get a list item 
    public Item getItem(int index) {
        return _list.get(index);
    }
    
}
