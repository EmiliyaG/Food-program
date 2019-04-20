package system.logic.foodlogic;

import system.ui.fastfood.OrderScreen;

public class OrderScreenLogic {
    private OrderScreen orderScreen;

    public void setScreenLisener(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    /*
    this method is executed when the clear button is pressed
     */
    public void clearButtonSelected() {
        orderScreen.resetUiElements();
    }

    public void exitBtnSelected() {
        orderScreen.exitOfTheProgram();
    }

}
