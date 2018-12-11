/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasslab;

/**
 *
 * @author 16473
 */
public class Contact {
    String firstName , lastName , emailAddress ;

    public Contact(String firstName, String lastName, String emailAddress) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty())
            this.firstName = firstName;
        else 
            throw new IllegalContactInputException();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.isEmpty())
            this.lastName = lastName;
        else 
            throw new IllegalContactInputException();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if(!emailAddress.isEmpty())
            this.emailAddress = emailAddress;
        else 
            throw new IllegalContactInputException();
    }
}
