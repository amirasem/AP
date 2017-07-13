package ui.menu;

import ui.UI;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class MultipleMenuUi implements UI {
    private final MenuUI[] menus;

    public MultipleMenuUi(MenuUI[] menus) {
        this.menus = menus;
    }

    @Override
    public void show() {
        for (MenuUI m : menus)
            if (m.isNotEmpty()) {
                m.show();
                System.out.println("");
            }
    }

    @Override
    public void run(int index) {
        menus[0].run(index);
    }
}
