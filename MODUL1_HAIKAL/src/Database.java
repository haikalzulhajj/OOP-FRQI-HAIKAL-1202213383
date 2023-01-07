import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    ArrayList<Menu> menuList;

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu) {
        menuList.add(menu);
      }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("===================================");
        for (int i = 0; i < menuList.size(); i++) {
          System.out.println((i+1) + ". " + menuList.get(i).getName()  + menuList.get(i).getCategory()  + menuList.get(i).getPrice());
        }
      }
    

    // TODO Create Method to Search Menu from Database
    public void searchMenu(String name) {
        boolean found = false;

        for (int i = 0; i < menuList.size(); i++) {
          if (menuList.get(i).getName().equals(name)) {
            System.out.println(menuList.get(i).getName()  + menuList.get(i).getCategory()  + menuList.get(i).getPrice());
            found = true;
            break;
          }
        }
        if (!found) {
          System.out.println("Menu tidak ditemukan.");
        }
      }
    }
    

