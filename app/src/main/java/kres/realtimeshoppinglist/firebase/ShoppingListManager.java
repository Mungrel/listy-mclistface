package kres.realtimeshoppinglist.firebase;

import com.google.firebase.database.DatabaseReference;

import kres.realtimeshoppinglist.model.ShoppingList;

public class ShoppingListManager {

    public ShoppingList createShoppingList(String listName) {
        DatabaseReference newListRef = FirebaseRefs.getShoppingListRootRef().push();
        String listID = newListRef.getKey();

        ShoppingList shoppingList = new ShoppingList(listID, listName);
        newListRef.setValue(shoppingList);

        return shoppingList;
    }

}
