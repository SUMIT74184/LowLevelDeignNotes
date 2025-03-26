package DesignAtm.ATMStates;

import DesignAtm.ATM;
import DesignAtm.Card;

public class HasCardState extends ATMState{
    public HasCardState(){
        System.out.println("enter your card pin");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered=card.isCorrectPINEntered(pin);

        if(isCorrectPinEntered){
            atm.setCurrentATMState(new SelectOperationState());
        }else{
            System.out.println("Invalid pin Number ...please try again");
            exit(atm);
        }
    }

    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    public void returnCard(){
        System.out.println("please collect your card");
    }
}
