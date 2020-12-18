package application;

/**
 * This class represents one item in the list / database.
 */
public class Item {
    private int _itemID;        // Item ID number
    private String _itemName;   // Item name

    // Two-argument constructor
    public Item(int id, String name) {
        _itemID = id;
        _itemName = name;
    }

    public String toString() {
        return _itemID + ", " + _itemName;
    }
}
