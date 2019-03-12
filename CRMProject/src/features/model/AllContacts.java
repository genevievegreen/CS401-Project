/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbypetersen
 */
public class AllContacts {
    private static final int NO_CHOICE = -1;
    private final List<Contact> allcontacts;
    private int chosenList;

    // Initialize contacts to empty list
    public AllContacts() {
        allcontacts = new ArrayList<>();
        chosenList = NO_CHOICE;    // no list chosen
    }
    
      // set the "current" list
    public void setFocus(int index) {
        chosenList = index;
    }

    // Add a reminder to the "current" list
    public void addContact(Contact con) {
        allcontacts.add(con);
    }
    
    public List<Contact> getContacts(){
        return allcontacts;
    }
}
