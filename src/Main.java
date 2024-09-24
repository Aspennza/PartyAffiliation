import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //String partyAffiliation = “”
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\n\nEnter your party affiliation: ";

        //output “Enter your party affiliation: ”
        System.out.print(menu);

        //input partyAffiliation
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("\nYou get a Democratic Donkey.");
        }
        else if (partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("\nYou get a Republican Elephant.");
        }
        else if (partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("\nYou get an Independent Person.");
        }
        else
        {
            System.out.println("\nYou entered a party affiliation other than D, R, or I, so you get Other. You entered: " + partyAffiliation);
        }

        //if partyAffiliation == “D” then
        //output “You get a Democratic Donkey.”
        //else if partyAffiliation == “R” then
        //output “You get a Republican Elephant.”
        //else if partyAffiliation == “I” then
        //output “You get an Independent Man.”
        //else
        //output “You did not enter a recognizable party affiliation. Enter D, R, or I. You entered: ” + partyAffiliation
        //endIf
    }
}