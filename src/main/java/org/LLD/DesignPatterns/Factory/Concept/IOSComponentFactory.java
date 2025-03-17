package org.LLD.DesignPatterns.Factory.Concept;


import org.LLD.DesignPatterns.Factory.Concept.components.Button.Button;
import org.LLD.DesignPatterns.Factory.Concept.components.Button.IOSButton;
import org.LLD.DesignPatterns.Factory.Concept.components.Dropdown.Dropdown;
import org.LLD.DesignPatterns.Factory.Concept.components.Dropdown.IOSDropdown;
import org.LLD.DesignPatterns.Factory.Concept.components.Menu.IOSMenu;
import org.LLD.DesignPatterns.Factory.Concept.components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}