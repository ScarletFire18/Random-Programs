



public class Cellphone
{
    private String manufact;
    private String model;
    private double retailPrice;

    /**
     * Constructor
     * @param man The phone's manufacturer.
     * @param mod The phone's model.
     * @param price The phone's retail price.
     */

    public Cellphone(String man, String mod, double price)
    {
        manufact = man;
        model = mod;
        retailPrice = price;
    }

    public void setManufact(String man)
    {
        manufact = man;
    }

    public void setMod(String mod)
    {
        model = mod;
    }

    public void setRetailPrice(double price)
    {
        retailPrice = price;
    }

    public String getManufact()
    {
        return manufact;
    }

    public String getModel()
    {
        return model;
    }

    public double getRetailPrice()
    {
        return retailPrice;
    }
}