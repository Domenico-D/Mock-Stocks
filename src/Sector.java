/**
 * Defines what a sector is, holding stocks that are then placed within a portfolio.
 */


public class Sector
{

    private String name;
    private char sectorVolatality;
    private Stock[] instruments;

    public Sector(String nm)
    {
        name = nm;
    }

    public Sector(String nm, Stock[] stocks)
    {

        name = nm;
        instruments = stocks;

    }

    public double getSectorCapital()
    {
        double capital = 0;
        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i] != null)
            {
                capital += (instruments[i].getCurrentPrice() * instruments[i].getSharesOwned());
            }
        }


        return capital;
    }

    public String getName()
    {
        return name;
    }

    //Gets the total Sector Volatility as a char to show the user the level of volatility
    public char getSectorVolatality()
    {

        //Constants to store volatility levels to determine char
        final double high = 0.1;
        final double medium = 0.06;

        //For loop to add up all of the volatility of each stock in the sector
        double volatilityTotal = 0;

        for (int i = 0; i < instruments.length; i++)
        {

            if (instruments[i] != null)
            {
                volatilityTotal += instruments[i].getVolatility();
            }

        }

        //Get average volatility
        double vAverage = volatilityTotal / instruments.length;

        //Check how high volatility is and assign it a char based on average velocity
        if (vAverage >= high)
        {
            sectorVolatality = 'H';
        }
        else if (vAverage >= medium)
        {
            sectorVolatality = 'M';
        }
        else
        {
            sectorVolatality = 'L';
        }

        return sectorVolatality;
    }

    public double getDailyProfit()
    {
        double dailyProfit = 0;

        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i] != null)
            {
                dailyProfit += instruments[i].getDayProfit();
            }
        }
        return dailyProfit;
    }

    public Stock[] getInstruments()
    {
        return instruments;
    }

    public void setInstruments(Stock[] stocks)
    {
        instruments = stocks;
    }

    //Removes a stock
    public void removeStock(int choice)
    {

        instruments[choice] = null;

    }

    public void tradeStock(Stock newStock, Stock oldStock)
    {

        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i].getName().equalsIgnoreCase(oldStock.getName()))
            {

                //Get Price and number of shares of New Stock
                double newStockPrice = newStock.getCurrentPrice();

                //Get Price and number of shares of old stock
                double oldStockPrice = instruments[i].getCurrentPrice();
                double oldNumShares = instruments[i].getCurrentPrice();

                //Calculate amount of new Stock Shares
                double newShares = (oldStockPrice * oldNumShares) / newStockPrice;

                //Wipe old stock from user sector and add new stock
                instruments[i] = null;
                instruments[i] = newStock;
                instruments[i].buyShares(newShares, newStockPrice);
            }
        }
    }

    public String toString()
    {
        String str = "";


        str += "\t\t[━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━▼━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━]\n";

        //Spacing to mimic a center align within the border.
        str += String.format("\t\t   %-10s %-25s %-8s %-15s %10s %10s %15s", "Number", "Name", "Region", "Price", "Volatility", "Active", "Days Owned" + "\n");

        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i] != null)
            {
                str += "\t\t   " + (i + 1) + instruments[i].toString();
            }
            else
            {
                str += "\t\t   " + (i + 1) + "          EMPTY SLOT.\n";
            }
        }

        str += "\t\t[━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━▲━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━]";

        return str;
    }

    public void updateAllSectorStocks()
    {
        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i] != null)
            {
                if (instruments[i].getActive())
                {
                    instruments[i].updateStockPrice();
                }
            }
        }
    }

    public void updateBeginDayPrice()
    {
        for (int i = 0; i < instruments.length; i++)
        {
            if (instruments[i] != null)
            {
                instruments[i].updateBeginDayPrice();
            }
        }
    }


}
