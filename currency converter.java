import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        float initialAmount, convertedAmount = 0;
        int currencyFrom, currencyTo;
        String currency1Name, currency2Name = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the currency you want to convert from: ");
        System.out.println("(1) SAR \n(2) EURO \n(3) USD \n(4) JPY");
        currencyFrom = scanner.nextInt();

        switch(currencyFrom){

            case 1:
                currency1Name = "Saudi Riyals";

                System.out.println("To which currency you want it converted to? : ");
                System.out.println("(1) EURO \n(2) USD \n(3) JPY");
                currencyTo = scanner.nextInt();

                System.out.println("Enter the amount in SAR: ");
                initialAmount = scanner.nextFloat();

                switch(currencyTo){

                    case 1:
                        currency2Name = "Euros";
                        convertedAmount = initialAmount * 0.24f;
                        break;

                    case 2:
                        currency2Name = "U.S. Dollars";
                        convertedAmount = initialAmount * 0.27f;
                        break;

                    case 3:
                        currency2Name = "Japanese Yen";
                        convertedAmount = initialAmount * 39.35f;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                        break;
                }

                System.out.println(initialAmount + " " + currency1Name + " equal " + String.format("%.2f",convertedAmount) + currency2Name);
                break;

            case 2:
                currency1Name = "Euros";

                System.out.println("To which currency you want it converted to? : ");
                System.out.println("(1) SAR \n(2) USD \n(3) JPY");
                currencyTo = scanner.nextInt();

                System.out.println("Enter the amount in Euros: ");
                initialAmount = scanner.nextFloat();

                switch(currencyTo){

                    case 1:
                        currency2Name = "Saudi Riyals";
                        convertedAmount = initialAmount * 4.14f;
                        break;

                    case 2:
                        currency2Name = "U.S. Dollars";
                        convertedAmount = initialAmount * 1.1f;
                        break;

                    case 3:
                        currency2Name = "Japanese Yen";
                        convertedAmount = initialAmount * 162.95f;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                        break;
                }

                System.out.println(initialAmount + " " + currency1Name + " equal " + String.format("%.2f",convertedAmount) + currency2Name);
                break;


            case 3:
                currency1Name = "U.S. Dollars";

                System.out.println("To which currency you want it converted to? : ");
                System.out.println("(1) SAR \n(2) EURO \n(3) JPY");
                currencyTo = scanner.nextInt();

                System.out.println("Enter the amount in U.S. Dollars: ");
                initialAmount = scanner.nextFloat();

                switch(currencyTo){

                    case 1:
                        currency2Name = "Saudi Riyals";
                        convertedAmount = initialAmount * 3.75f;
                        break;

                    case 2:
                        currency2Name = "Euros";
                        convertedAmount = initialAmount * 0.91f;
                        break;

                    case 3:
                        currency2Name = "Japanese Yen";
                        convertedAmount = initialAmount * 147.66f;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                        break;
                }

                System.out.println(initialAmount + " " + currency1Name + " equal " + String.format("%.2f",convertedAmount) + currency2Name);
                break;

            case 4:
                currency1Name = "Japanese Yen";

                System.out.println("To which currency you want it converted to? : ");
                System.out.println("(1) SAR \n(2) EURO \n(3) USD");
                currencyTo = scanner.nextInt();

                System.out.println("Enter the amount in Japanese Yen: ");
                initialAmount = scanner.nextFloat();

                switch(currencyTo){

                    case 1:
                        currency2Name = "Saudi Riyals";
                        convertedAmount = initialAmount * 0.025f;
                        break;

                    case 2:
                        currency2Name = "Euros";
                        convertedAmount = initialAmount * 0.0061f;
                        break;

                    case 3:
                        currency2Name = "U.S. Dollars";
                        convertedAmount = initialAmount * 0.0068f;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                        break;
                }

                System.out.println(initialAmount + " " + currency1Name + " equal " + String.format("%.2f",convertedAmount) + currency2Name);
                break;


            default:
                System.out.println("Invalid Option.");
                break;

        }

        scanner.close();
    }
}

