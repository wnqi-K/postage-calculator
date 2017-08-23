package au.edu.unimelb.comp30022.controllertesting;

public class Address {
    
    private String number;
    private String street;
    private String suburb;
    private String postCode;
    private String state;

    public Address(String number, String street, String suburb,
                   String postCode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postCode = postCode;
        this.state = state;
    }

    public static Address fromPostCode(String postCode) {
        return new Address(null, null, null, postCode, null);
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getState() {
        return state;
    }
}