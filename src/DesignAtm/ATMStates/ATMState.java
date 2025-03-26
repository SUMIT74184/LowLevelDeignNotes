package DesignAtm.ATMStates;

import DesignAtm.ATM;
import DesignAtm.Card;
import DesignAtm.TransactionType;

public  abstract class ATMState {
    public void insertCard(ATM atm, Card card){
        System.out.println("oops something went wrong");
    }
    public void authenticatePin(ATM atm,Card card,int pin){
        System.out.println("oops something went wrong");
    }
    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("oops something went wrong");
    }
    public void cashWithdrawal(ATM atm,Card card,int withdrawalAmount){
        System.out.println("oops something went wrong");
    }
    public void displayBalance(ATM atm,Card card){
        System.out.println("oops something went wrong");
    }
    public void returnCard(){
        System.out.println("oops something went wrong");
    }
    public void exit(ATM atm){
        System.out.println("oops something went wrong");
    }
}
