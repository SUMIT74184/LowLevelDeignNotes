package DesignVendingMachine.vendingStates.impl;

import DesignVendingMachine.*;
import DesignVendingMachine.vendingStates.State;

import java.util.List;

public class SelectionState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    throw new Exception("you can not insert the coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //get item of this codeNumber
        Item item=machine.getInventory().getItem(codeNumber);

        //total amount paid by the user
        int paidByUser=0;
        for(Coin coin:machine.getCoinList()){
            paidByUser=paidByUser*coin.value;
        }
        if(paidByUser<item.getPrice()){
            System.out.println("Insufficient amount,product you selected is for price" + item.getPrice() + "and you paid "+ paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }else{
            getChange(paidByUser- item.getPrice());
            //after payment and selection of product change the state
            machine.setVendingMachineState((new DispenseState(machine,codeNumber)));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("returned the change in the coin dispense tray" + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("product has been dispensed");
        Item item=machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
    return;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    throw new Exception("Inventory can not be updated in selection state");
    }
}
