import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import static Constants.Constants.*;

public class AddressBookMain {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");
        HashMap<String, LinkedList<Contact>> hMap = new HashMap<>();

        AddressBookMain mainBook = new AddressBookMain();
        HashMapClass mapObject = new HashMapClass();
        int userResponse = 0;
        while (userResponse != 9) {
            System.out.println("What do you want to perform (Main Menu) ");
            System.out.print("1.Add / 2.Edit / 3.Delete / 4.List of Books / " +
                    "5.Print ParticularBook / 6.Print CompleteBook / 7. SEARCH / 8.Search By State / 9.Stop Menu - ");
            userResponse = mainBook.input.nextInt();
            try {
                switch (userResponse) {
                    case TO_ADD_NEW_BOOK:
                        mapObject.addBook(hMap);
                        break;
                    case TO_EDIT_BOOK:
                        mapObject.toEdit(hMap);
                        break;
                    case TO_DELETE_CONTACT:
                        mapObject.deleteBook(hMap);
                        break;
                    case TO_PRINT_LIST_OF_BOOKS:
                        mapObject.listOfBookNames(hMap);
                        break;
                    case TO_SEARCH_WITH_BOOKNAME://Print particular book
                        mapObject.particularBookName(hMap);
                        break;
                    case TO_PRINT_BOOK:
                        mapObject.printMap(hMap);
                        break;
                    case TO_SEARCH_WITH_NAME:
                        mapObject.searchWithName(hMap);
                        break;
                    case SEARCH_BY_CITY_STATE:
                        mapObject.searchByCity(hMap);
                        break;
                    case TO_STOP_MAIN_MENU:
                        System.out.println("<  Thank You >");
                        break;
                    default:
//                        System.out.println("Please Try Again");
                        throw new CustomException("Invalid Input Please Try Again");
                }
            } catch (Exception e) {
                throw new CustomException("Invalid Input Please Try Again");

            }
        }
    }
}
