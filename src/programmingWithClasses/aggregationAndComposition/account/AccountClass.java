package programmingWithClasses.aggregationAndComposition.account;

import java.util.ArrayList;

class AccountClass {

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> bal = new ArrayList<String>();
    ArrayList<String> status = new ArrayList<String>();

    public void accountInform (String accountName, String balance, String status){

        name.add(accountName);
        bal.add(balance);
        this.status.add(status);
    }
}
