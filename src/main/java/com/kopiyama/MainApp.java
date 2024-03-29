import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu\n");
            System.out.println("1. Book");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline setelah nextInt()

            switch (choice) {
                case 1:
                    bookMenu(scanner);
                    break;
                case 2:
                    authorMenu(scanner);
                    break;
                case 3:
                    publisherMenu(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void bookMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nBook Menu Searching\n");
            System.out.println("1. Cari data book yang memiliki price paling Murah.");
            System.out.println("2. Cari data book yang memiliki price paling Mahal.");
            System.out.println("3. Cari data book berdasarkan range Price.");
            System.out.println("4. Cari Comic Berdasarkan Rating mangaka.");
            System.out.println("5. Cari Book berdasarkan Country dari Publishernya.");
            System.out.println("6. Cari Book berdasarkan Country dari Authornya.");
            System.out.println("7. Cari data Comic yang memiliki price paling Mahal.");
            System.out.println("0. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int bookChoice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline setelah nextInt()

            switch (bookChoice) {
                case 1:
                    // Implementasi logika untuk mencari data book yang memiliki price paling murah
                    System.out.println("Searching for data book with the lowest price...");
                    break;
                case 2:
                    // Implementasi logika untuk mencari data book yang memiliki price paling mahal
                    System.out.println("Searching for data book with the highest price...");
                    break;
                case 3:
                    // Implementasi logika untuk mencari data book berdasarkan range price
                    System.out.println("Searching for data book within price range...");
                    break;
                case 4:
                    // Implementasi logika untuk mencari Comic berdasarkan rating mangaka
                    System.out.println("Searching for Comic based on mangaka's rating...");
                    break;
                case 5:
                    // Implementasi logika untuk mencari Book berdasarkan country dari publishernya
                    System.out.println("Searching for Book based on publisher's country...");
                    break;
                case 6:
                    // Implementasi logika untuk mencari Book berdasarkan country dari authornya
                    System.out.println("Searching for Book based on author's country...");
                    break;
                case 7:
                    // Implementasi logika untuk mencari data Comic yang memiliki price paling mahal
                    System.out.println("Searching for data Comic with the highest price...");
                    break;
                case 0:
                    return;  // Kembali ke main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void authorMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nAuthor Menu Searching\n");
            System.out.println("1. Cari Data semua Mangaka.");
            System.out.println("2. Cari Data semua Author.");
            System.out.println("3. Cari Data semua Novelis.");
            System.out.println("4. Cari author berdasarkan Range umur.");
            System.out.println("5. Cari author berdasarkan Country.");
            System.out.println("0. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int authorChoice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline setelah nextInt()

            switch (authorChoice) {
                case 1:
                    // Implementasi logika untuk mencari data semua Mangaka
                    System.out.println("Searching for all Mangaka data...");
                    break;
                case 2:
                    // Implementasi logika untuk mencari data semua Author
                    System.out.println("Searching for all Author data...");
                    break;
                case 3:
                    // Implementasi logika untuk mencari data semua Novelis
                    System.out.println("Searching for all Novelis data...");
                    break;
                case 4:
                    // Implementasi logika untuk mencari author berdasarkan range umur
                    System.out.println("Searching for authors based on age range...");
                    break;
                case 5:
                    // Implementasi logika untuk mencari author berdasarkan country
                    System.out.println("Searching for authors based on country...");
                    break;
                case 0:
                    return;  // Kembali ke main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void publisherMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nPublisher Menu Searching\n");
            System.out.println("1. Cari Publisher dengan productionCost paling Mahal.");
            System.out.println("2. Cari Publisher dengan productionCost paling Murah.");
            System.out.println("0. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int publisherChoice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline setelah nextInt()

            switch (publisherChoice) {
                case 1:
                    // Implementasi logika untuk mencari publisher dengan productionCost paling mahal
                    System.out.println("Searching for publisher with highest production cost...");
                    break;
                case 2:
                    // Implementasi logika untuk mencari publisher dengan productionCost paling murah
                    System.out.println("Searching for publisher with lowest production cost...");
                    break;
                case 0:
                    return;  // Kembali ke main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
