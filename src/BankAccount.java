public class BankAccount {
    private double money;
    private String ssn;
    private String firstName;
    private String middleName;
    private String lastName;
    
    // Console for this class
    private java.util.Scanner console = new java.util.Scanner(System.in);
    public BankAccount(String firstName, String middleName, String lastName, String ssn, double money) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }
    public void setFirstName(String firstName) {
        while (!checkAlphabet(firstName)) {
            System.out.print("Please enter a valid first name: ");
            firstName = console.next();
        }
        this.firstName=firstName;
    }
    public void setMiddleName(String middleName) {
        while (!checkAlphabet(middleName)) {
            System.out.print("Please enter a valid middle name: ");
            middleName = console.next();
        }
        this.middleName=middleName;
    }
    public void setLastName(String lastName) {
        while (!checkAlphabet(lastName)) {
            System.out.print("Please enter a valid last name: ");
            lastName = console.next();
        }
        this.lastName=lastName;
    }
    public void setSSN(String SSN) {
        while (!checkSSN(SSN)) {
            System.out.print("Invalid SSN! Enter a valid SSN: ");
            SSN = console.next();
        }
        this.ssn=SSN;
    }
    private boolean checkSSN(String SSN) {
        if (SSN==null) {
            return false;
        }
        for (int i = 0; i<SSN.length();i++) {
            if (!(Character.isDigit(SSN.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    private boolean checkAlphabet(String str) {
        if (str==null) {
            return false;
        }
        for (int i = 0; i<str.length();i++) {
            if (!(Character.isLetter(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
