package org.LLD.DesignPatterns.Creational.Factory.Concept;


import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Button.AndroidButton;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Button.Button;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Dropdown.AndriodDropdown;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Dropdown.Dropdown;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Menu.AndroidMenu;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}