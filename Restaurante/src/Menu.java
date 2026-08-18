import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.put(menuItem.getName(), menuItem);
    }

    public int getMenuItemCount() {
        return menuItems.size();
    }

    public void MenuAll() {
        for(MenuItem item: menuItems.values()) {
            System.out.println("Receta:" + item.getName() + " Precio: " + item.getPrice());
        }

    }

    public boolean replaceMenuItem(String name, MenuItem menuItem) {
        if(!menuItems.containsKey(name)) {
            System.out.println("No existe el menuItem: " + name);
            return false;
        }
        menuItems.remove(name);
        menuItems.put(menuItem.getName(), menuItem);
        return true;
    }



}
