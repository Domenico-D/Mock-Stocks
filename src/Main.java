/**
 * Domenico Didiano and Jimmy Huynh
 * Date: January, 24, 2020
 * ICS 4U1, ISU --- Stonks.
 * A program which mimics the stock market, allowing you to trade,
 * create artificial stocks, and trade with fake money.
 */

import java.util.*;
import java.lang.*;

public class Main {

    private static Scanner inputStr = new Scanner(System.in);
    private static Scanner inputNum = new Scanner(System.in);

    //Initialize Stocks for the user to fill in portfolio 1
    private static Stock userPortfolio1Sector1Stock1 = new Stock();
    private static Stock userPortfolio1Sector1Stock2 = new Stock();
    private static Stock userPortfolio1Sector1Stock3 = new Stock();
    private static Stock userPortfolio1Sector1Stock4 = new Stock();
    private static Stock userPortfolio1Sector1Stock5 = new Stock();

    private static Stock userPortfolio1Sector2Stock1 = new Stock();
    private static Stock userPortfolio1Sector2Stock2 = new Stock();
    private static Stock userPortfolio1Sector2Stock3 = new Stock();
    private static Stock userPortfolio1Sector2Stock4 = new Stock();
    private static Stock userPortfolio1Sector2Stock5 = new Stock();

    private static Stock userPortfolio1Sector3Stock1 = new Stock();
    private static Stock userPortfolio1Sector3Stock2 = new Stock();
    private static Stock userPortfolio1Sector3Stock3 = new Stock();
    private static Stock userPortfolio1Sector3Stock4 = new Stock();
    private static Stock userPortfolio1Sector3Stock5 = new Stock();

    private static Stock userPortfolio1Sector4Stock1 = new Stock();
    private static Stock userPortfolio1Sector4Stock2 = new Stock();
    private static Stock userPortfolio1Sector4Stock3 = new Stock();
    private static Stock userPortfolio1Sector4Stock4 = new Stock();
    private static Stock userPortfolio1Sector4Stock5 = new Stock();

    private static Stock userPortfolio1Sector5Stock1 = new Stock();
    private static Stock userPortfolio1Sector5Stock2 = new Stock();
    private static Stock userPortfolio1Sector5Stock3 = new Stock();
    private static Stock userPortfolio1Sector5Stock4 = new Stock();
    private static Stock userPortfolio1Sector5Stock5 = new Stock();

    //Initialize Stocks for the user to fill in portfolio 2
    private static Stock userPortfolio2Sector1Stock1 = new Stock();
    private static Stock userPortfolio2Sector1Stock2 = new Stock();
    private static Stock userPortfolio2Sector1Stock3 = new Stock();
    private static Stock userPortfolio2Sector1Stock4 = new Stock();
    private static Stock userPortfolio2Sector1Stock5 = new Stock();

    private static Stock userPortfolio2Sector2Stock1 = new Stock();
    private static Stock userPortfolio2Sector2Stock2 = new Stock();
    private static Stock userPortfolio2Sector2Stock3 = new Stock();
    private static Stock userPortfolio2Sector2Stock4 = new Stock();
    private static Stock userPortfolio2Sector2Stock5 = new Stock();

    private static Stock userPortfolio2Sector3Stock1 = new Stock();
    private static Stock userPortfolio2Sector3Stock2 = new Stock();
    private static Stock userPortfolio2Sector3Stock3 = new Stock();
    private static Stock userPortfolio2Sector3Stock4 = new Stock();
    private static Stock userPortfolio2Sector3Stock5 = new Stock();

    private static Stock userPortfolio2Sector4Stock1 = new Stock();
    private static Stock userPortfolio2Sector4Stock2 = new Stock();
    private static Stock userPortfolio2Sector4Stock3 = new Stock();
    private static Stock userPortfolio2Sector4Stock4 = new Stock();
    private static Stock userPortfolio2Sector4Stock5 = new Stock();

    private static Stock userPortfolio2Sector5Stock1 = new Stock();
    private static Stock userPortfolio2Sector5Stock2 = new Stock();
    private static Stock userPortfolio2Sector5Stock3 = new Stock();
    private static Stock userPortfolio2Sector5Stock4 = new Stock();
    private static Stock userPortfolio2Sector5Stock5 = new Stock();

    //Initialize Stocks for the user to fill in portfolio 3
    private static Stock userPortfolio3Sector1Stock1 = new Stock();
    private static Stock userPortfolio3Sector1Stock2 = new Stock();
    private static Stock userPortfolio3Sector1Stock3 = new Stock();
    private static Stock userPortfolio3Sector1Stock4 = new Stock();
    private static Stock userPortfolio3Sector1Stock5 = new Stock();

    private static Stock userPortfolio3Sector2Stock1 = new Stock();
    private static Stock userPortfolio3Sector2Stock2 = new Stock();
    private static Stock userPortfolio3Sector2Stock3 = new Stock();
    private static Stock userPortfolio3Sector2Stock4 = new Stock();
    private static Stock userPortfolio3Sector2Stock5 = new Stock();

    private static Stock userPortfolio3Sector3Stock1 = new Stock();
    private static Stock userPortfolio3Sector3Stock2 = new Stock();
    private static Stock userPortfolio3Sector3Stock3 = new Stock();
    private static Stock userPortfolio3Sector3Stock4 = new Stock();
    private static Stock userPortfolio3Sector3Stock5 = new Stock();

    private static Stock userPortfolio3Sector4Stock1 = new Stock();
    private static Stock userPortfolio3Sector4Stock2 = new Stock();
    private static Stock userPortfolio3Sector4Stock3 = new Stock();
    private static Stock userPortfolio3Sector4Stock4 = new Stock();
    private static Stock userPortfolio3Sector4Stock5 = new Stock();

    private static Stock userPortfolio3Sector5Stock1 = new Stock();
    private static Stock userPortfolio3Sector5Stock2 = new Stock();
    private static Stock userPortfolio3Sector5Stock3 = new Stock();
    private static Stock userPortfolio3Sector5Stock4 = new Stock();
    private static Stock userPortfolio3Sector5Stock5 = new Stock();

    //All Technology Sector Stocks
    private static Stock intelStock = new Stock("Intel", 'N', 60.54, 0.7, true);
    private static Stock appleStock = new Stock("Apple", 'N', 316.75, 0.8, true);
    private static Stock alphabetStock = new Stock("Alphabet", 'N', 482.98, 0.9, true);
    private static Stock samsungStock = new Stock("Samsung", 'A', 218.32, 0.7, true);
    private static Stock microsoftStock = new Stock("Microsoft", 'N', 166.25, 0.8, true);
    private static Stock nvidiaStock = new Stock("Nvidia", 'A', 247.95, 0.1, true);
    private static Stock nintendoStock = new Stock("Nintendo", 'A', 53.26, 0.7, true);
    private static Stock amdStock = new Stock("AMD", 'A', 51.05, 0.1, true);

    //Array of all technology stocks
    private static Stock[] technologyArray = {intelStock, appleStock, alphabetStock, samsungStock, microsoftStock, nvidiaStock, nintendoStock, amdStock};

    //Technology Sector
    private static Sector technologySector = new Sector("Technology", technologyArray);

    //All Crypto Currency Stocks
    private static Stock bitcoinStock = new Stock("Bitcoin", 'N', 8700.32, 0.17, true);
    private static Stock doge_CoinStock = new Stock("Doge Coin", 'E', 1.37, 0.13, true);
    private static Stock litecoinStock = new Stock("Litecoin", 'A', 57.31, 0.16, true);
    private static Stock zCashStock = new Stock("zCash", 'F', 53.23, 0.1, true);
    private static Stock ethereumStock = new Stock("Ethereum", 'O', 168.19, 0.15, true);
    private static Stock zuccBuccStock = new Stock("ZuccBucc", 'N', 666.66, 0.2, true);
    private static Stock rippleStock = new Stock("Ripple", 'O', 1.23, 0.11, true);
    private static Stock dashStock = new Stock("Dash", 'F', 108.13, 0.14, true);

    //Array of crypto currency stocks
    private static Stock[] cryptoArray = {bitcoinStock, doge_CoinStock, litecoinStock, zCashStock, ethereumStock, zuccBuccStock, rippleStock, dashStock};

    //Crypto Currency Sector
    private static Sector cryptoCurrencySector = new Sector("Crypto Currency", cryptoArray);

    //All Retail Stocks
    private static Stock amazonStock = new Stock("Amazon", 'N', 1892.02, 0.09, true);
    private static Stock alibabaStock = new Stock("Alibaba", 'A', 222.26, 0.09, true);
    private static Stock bestBuyStock = new Stock("BestBuy", 'N', 90.24, 0.07, true);
    private static Stock costcoStock = new Stock("Costco", 'N', 313.26, 0.07, true);
    private static Stock rexallStock = new Stock("Rexall", 'N', 1329.28, 0.09, true);
    private static Stock wishStock = new Stock("Wish", 'A', 841.42, 0.08, true);
    private static Stock freshCoStock = new Stock("FreshCo", 'N', 64.82, 0.07, true);
    private static Stock ebayStock = new Stock("Ebay", 'N',35.72 , 0.08, true);

    //Array of retail stocks
    private static Stock[] retailArray = {amazonStock, alibabaStock, bestBuyStock, costcoStock, rexallStock, wishStock, freshCoStock, ebayStock};

    //Retail Sector
    private static Sector retailSector = new Sector("Retail", retailArray);

    //All auto Stocks
    private static Stock fordStock = new Stock("Ford", 'N', 9.21, 0.04, true);
    private static Stock volkswagenStock = new Stock("Volkswagen", 'E', 181.30, 0.06, true);
    private static Stock hondaStock = new Stock("Honda", 'A', 89.41, 0.03, true);
    private static Stock toyotaStock = new Stock("Toyota", 'A', 32.45, 0.04, true);
    private static Stock teslaStock = new Stock("Tesla", 'N', 523.89, 0.06, true);
    private static Stock volvoStock = new Stock("Volvo", 'E', 161.45, 0.05, true);
    private static Stock nissanStock = new Stock("Nissan", 'A', 29.41, 0.03, true);
    private static Stock ferrariStock = new Stock("Ferrari", 'E', 213.13, 0.06, true);

    //Array of auto Stocks
    private static Stock[] autoArray = {fordStock, volkswagenStock, hondaStock, toyotaStock, teslaStock, volvoStock, nissanStock, ferrariStock};

    //Auto Sector
    private static Sector autoSector = new Sector("Auto", autoArray);

    //All Aerospace and Defense Stocks
    private static Stock bombardierStock = new Stock("Bombardier", 'A', 1.29, 0.07, true);
    private static Stock generalElectricStock = new Stock("General Electric", 'A', 11.66, 0.08, true);
    private static Stock boeingStock = new Stock("Boeing", 'A', 313.37, 0.09, true);
    private static Stock unitedTechnologiesStock = new Stock("United Technologies", 'A', 59.41, 0.07, true);
    private static Stock airbusStock = new Stock("Airbus", 'A', 136.41, 0.08, true);
    private static Stock honeywellStock = new Stock("Honeywell", 'A', 180.93, 0.08, true);
    private static Stock spaceXStock = new Stock("SpaceX", 'A', 132.56, 0.09, true);
    private static Stock safranStock = new Stock("Safran", 'A', 142.00, 0.09, true);

    //Array of Aerospace and defence stocks
    private static Stock[] aeroArray = {bombardierStock, generalElectricStock, boeingStock, unitedTechnologiesStock, airbusStock, honeywellStock, spaceXStock, safranStock};

    //Aerospace Sector
    private static Sector aerospaceSector = new Sector("Aerospace", aeroArray);

    //All Financial / banks stocks
    private static Stock scotiaBankStock = new Stock("ScotiaBank", 'N', 72.63, 0.05, true);
    private static Stock cibcStock = new Stock("CIBC", 'N', 108.14, 0.07, true);
    private static Stock bankOfAmericaStock = new Stock("Bank of America", 'N', 34.26, 0.03, true);
    private static Stock bmoStock = new Stock("BMO", 'N', 104.34, 0.04, true);
    private static Stock hAndRBlockStock = new Stock("H and R Block", 'E', 53.63, 8.8, true);
    private static Stock tdStock = new Stock("TD", 'N', 73.96, 0.05, true);
    private static Stock rbcStock = new Stock("RBC", 'N', 106.79, 0.02, true);
    private static Stock tangerineStock = new Stock("Tangerine", 'O', 163.76, 0.06, true);

    //Array of Financial stocks
    private static Stock[] financialArray = {scotiaBankStock, cibcStock, bankOfAmericaStock, bmoStock, hAndRBlockStock, tdStock, rbcStock, tangerineStock};

    //Financial Sector
    private static Sector financialSector = new Sector("Financial", financialArray);

    //All food Stocks
    private static Stock mcDonaldsStock = new Stock("McDonalds", 'A', 211.16, 0.08, true);
    private static Stock wendysStock = new Stock("Wendys", 'A', 21.66, 0.09, true);
    private static Stock chipotleStock = new Stock("Chipotle", 'A', 870.73, 0.07, true);
    private static Stock dominosStock = new Stock("Dominos", 'A', 285.11, 0.05, true);
    private static Stock beyondMeatStock = new Stock("BeyondMeat", 'A', 129.18, 0.07, true);
    private static Stock pepsiCoStock = new Stock("PepsiCo", 'A', 141.86, 0.1, true);
    private static Stock heinekenStock = new Stock("Heineken", 'A', 99.86, 0.07, true);
    private static Stock henneseyStock = new Stock("Hennesey", 'A', 51.41, 0.12, true);

    //Array of food Stocks
    private static Stock[] foodArray = {mcDonaldsStock, wendysStock, chipotleStock, dominosStock, beyondMeatStock, pepsiCoStock, heinekenStock, henneseyStock};

    //Food Sector
    private static Sector foodSector = new Sector("Food", foodArray);

    //initialize sector array for first portfolio.
    private static Sector[] userSectors1 = new Sector[5];
    private static Portfolio portfolio1 = new Portfolio("",userSectors1);

    //Initialize user Sectors for portfolio 1
    private static Sector userTechnology1 = new Sector("Technology");
    private static Sector userCrypto1 = new Sector("Crypto Currency");
    private static Sector userRetail1 = new Sector("Retail");
    private static Sector userAuto1 = new Sector("Auto");
    private static Sector userAerospace1 = new Sector("Aerospace");
    private static Sector userFinancial1 = new Sector("Financial");
    private static Sector userFood1 = new Sector("Food");




    //initialize sector array for second portfolio.
    private static Sector[] userSectors2 = new Sector[5];
    private static Portfolio portfolio2 = new Portfolio("",userSectors2);

    //Initialize user Sectors for portfolio 2
    private static Sector userTechnology2 = new Sector("Technology");
    private static Sector userCrypto2 = new Sector("Crypto Currency");
    private static Sector userRetail2 = new Sector("Retail");
    private static Sector userAuto2 = new Sector("Auto");
    private static Sector userAerospace2 = new Sector("Aerospace");
    private static Sector userFinancial2 = new Sector("Financial");
    private static Sector userFood2 = new Sector("Food");

    //Initialize sector array for third portfolio.
    private static Sector[] userSectors3 = new Sector[5];
    private static Portfolio portfolio3 = new Portfolio("",userSectors3);

    //Initialize user Sectors for portfolio 3
    private static Sector userTechnology3 = new Sector("Technology");
    private static Sector userCrypto3 = new Sector("Crypto Currency");
    private static Sector userRetail3 = new Sector("Retail");
    private static Sector userAuto3 = new Sector("Auto");
    private static Sector userAerospace3 = new Sector("Aerospace");
    private static Sector userFinancial3 = new Sector("Financial");
    private static Sector userFood3 = new Sector("Food");

    private static Portfolio[] portfolios = {portfolio1, portfolio2, portfolio3};

    private static int numPortfolios = 0;


    public static void main(String[]args){


        /**
         * WHEN YOU END THE DAY, DO THE FOLLOWING:
         * 1. clear dailyProfit.
         * 2. change price with volatility.
         * 3. update new price;
         * 4. set beginDayPrice.
         */

        int choice, gameChoice;

        do{
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("1. Play");
            System.out.println("2. About us\n");
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
            choice = inputNum.nextInt();

            if(choice == 1){

                do{


                    if(numPortfolios < 1){
                        gameChoice = 1;
                    }
                    else{
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("\n1. Create a Portfolio");
                        //Only allow user to select Portfolios if they have more then one
                        System.out.println("2. Select Portfolio");
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        gameChoice = inputNum.nextInt();
                    }


                    if(gameChoice == 1){
                        numPortfolios++;

                        createPortfolio();

                    }
                    else if(gameChoice == 2){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("\nWhich portfolio would you like to access");
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    }

                }while(gameChoice != 0);

            }
            else if(choice == 2){
                System.out.println("test 2");
            }


        }while(choice != 0);




    }

    private static void createPortfolio(){
        //User menu selection
        int choice;
        //Prevents user from adding the same sector or Stock twice
        Boolean[] chosen = {true, true, true, true, true, true, true};
        Boolean[] chosenStock = {true, true, true, true, true, true, true, true};
        //Temp stock array to fill sectors
        Stock[] tempStocks = new Stock[5];
        //user stock choice
        int stockChoice;
        double currentPriceTemp;
        double volatilityTemp;
        char regionTemp;

        if(numPortfolios == 1){

            System.out.print("\nEnter the name of your first portfolio: ");
            portfolio1.setName(inputStr.nextLine());

            for (int i = 0; i < userSectors1.length; i++){

                do{
                    System.out.println("\nPlease choose what sectors you want in your portfolio");
                    System.out.println("Choose carefully you will not be able to change them later!");
                    System.out.println("1. Technology, 2. Crypto Currency, 3. Retail, 4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food");
                    choice = inputNum.nextInt();

                    //User chooses technology sector and stocks within.
                    if (choice == 1 && chosen[0]) {
                        //Set the chosen sector
                        userSectors1[i] = userTechnology1;

                        //Fill Stocks with user choices
                        for(int o = 0; o < tempStocks.length; o++){

                            do{

                                System.out.println("\nPlease choose the Stocks you want in the technology Sector");
                                System.out.println("1. Choose Stock");
                                System.out.println("2. Create Stock");
                                choice = inputNum.nextInt();

                                //Check if they want to create or choose a stock
                                if(choice == 1){
                                    System.out.println("\n\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(technologySector.toString());
                                    System.out.print("Which stock would you like to add: ");
                                    stockChoice = inputNum.nextInt();

                                    if(stockChoice == 1 && chosenStock[0]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 2 && chosenStock[1]){
                                        tempStocks[o] = cryptoArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 3 && chosenStock[2]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 4 && chosenStock[3]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 5 && chosenStock[4]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 6 && chosenStock[5]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 7 && chosenStock[6]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(stockChoice == 8 && chosenStock[7]){
                                        tempStocks[o] = technologyArray[stockChoice-1];
                                        chosenStock[stockChoice-1] = false;
                                        break;
                                    }
                                    else if(!chosenStock[stockChoice-1])
                                    {
                                        System.out.println("\nStock already selected. Pick something else.");
                                    }
                                    else{
                                        System.out.println("\nPlease enter a number between 1 and 8");
                                    }

                                }
                                else if(choice == 2){

                                    if(o == 0){

                                        System.out.print("\nEnter the name of your stock");
                                        userPortfolio1Sector1Stock1.setName(inputStr.nextLine());

                                        System.out.print("\nEnter the region as a single letter");
                                        System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                                        userPortfolio1Sector1Stock1.setRegion(inputStr.next().charAt(0));

                                        //Loop makes sure they enter a valid stock price
                                        do {
                                            System.out.println("\nEnter the current stock price(It must be less the 1000 and greater than 0) ");
                                            currentPriceTemp = inputNum.nextDouble();
                                            userPortfolio1Sector1Stock1.setCurrentPrice(currentPriceTemp);

                                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                                        do{
                                            System.out.println("\nEnter the stocks volatility (It must be less the 0.2 and greater than 0)");
                                            volatilityTemp = inputNum.nextDouble();
                                            userPortfolio1Sector1Stock1.setVolatility(volatilityTemp);
                                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                                        tempStocks[o] = userPortfolio1Sector1Stock1;

                                    }
                                    else if(o == 1){

                                        //paste o == 0 here and change stock 1 to 2

                                    }
                                    else if(o == 2){
                                        //paste o == 0 here and change stock 1 to 3
                                    }
                                    else if(o == 3){
                                        //paste o == 0 here and change stock 1 to 4
                                    }
                                    else if(o == 4){
                                        //paste o == 0 here and change stock 1 to 5
                                    }


                                }

                            }while(tempStocks[o] == null);

                        }


                        //Prevents user from adding the same sector twice
                        chosen[0] = false;
                        break;
                    }
                    //User chooses Crypto sector and stocks within.
                    else if (choice == 2 && chosen[1]) {
                        userSectors1[i] = userCrypto1;
                        chosen[1] = false;
                        break;
                    }
                    //User chooses Retail sector and stocks within.
                    else if (choice == 3 && chosen[2]) {
                        userSectors1[i] = userRetail1;
                        chosen[2] = false;
                        break;
                    }
                    //User chooses Auto sector and stocks within.
                    else if (choice == 4 && chosen[3]) {
                        userSectors1[i] = userAuto1;
                        chosen[3] = false;
                        break;
                    }
                    //User chooses Aerospace sector and stocks within.
                    else if (choice == 5 && chosen[4]) {
                        userSectors1[i] = userAerospace1;
                        chosen[4] = false;
                        break;
                    }
                    //User chooses Financial sector and stocks within.
                    else if (choice == 6 && chosen[5]) {
                        userSectors1[i] = userFinancial1;
                        chosen[5] = false;
                        break;
                    }
                    //User chooses Food sector and stocks within.
                    else if (choice == 7 && chosen[6]) {
                        userSectors1[i] = userFood1;
                        chosen[6] = false;
                        break;
                    }
                    else if(choice<1 || choice>7) {
                        System.out.println("Please enter a number from 1-7");
                    }
                    else if(!chosen[choice-1])
                    {
                        System.out.println("Sector already selected. Pick something else.");
                    }
                }while(userSectors1[i] == null);
            }

            //Add the sectors to the current portfolio
            portfolio1.setSectors(userSectors1);



        }
        else if(numPortfolios == 2){



        }
        else if(numPortfolios == 3){



        }
    }

}
