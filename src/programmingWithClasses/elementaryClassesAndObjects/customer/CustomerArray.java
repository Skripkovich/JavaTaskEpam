package programmingWithClasses.elementaryClassesAndObjects.customer;

import java.util.ArrayList;

class  CustomerArray extends ArrayList {

    public CustomerArray selectByName (String name){

        CustomerArray result = new CustomerArray();

        for(int i=0;i <= this.size()-1;i++){

            CustomerClass costumer = (CustomerClass) this.get(i);
            if (costumer.getName().equals(name)){
                result.add(costumer);
            }
        }
        return result;
    }

    public void customerPrintOut (){
        for(int i=0;i <= this.size()-1;i++){
            CustomerClass costumer = (CustomerClass) this.get(i);
            costumer.toString(costumer);
        }
    }
}
