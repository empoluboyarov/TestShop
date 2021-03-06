package bank;

import interfaces.BankInterface;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public abstract class BaseBank implements BankInterface {

    public static int requestCount;

    private String name;

    private String creditDescription;

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription;
    }

    @Override
    public void checkInfo() {requestCount++;

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
