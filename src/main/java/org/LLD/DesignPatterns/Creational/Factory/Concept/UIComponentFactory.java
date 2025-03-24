package org.LLD.DesignPatterns.Creational.Factory.Concept;


import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Button.Button;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Dropdown.Dropdown;
import org.LLD.DesignPatterns.Creational.Factory.Concept.components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}