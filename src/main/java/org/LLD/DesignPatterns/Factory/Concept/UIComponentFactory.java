package org.LLD.DesignPatterns.Factory.Concept;


import org.LLD.DesignPatterns.Factory.Concept.components.Button.Button;
import org.LLD.DesignPatterns.Factory.Concept.components.Dropdown.Dropdown;
import org.LLD.DesignPatterns.Factory.Concept.components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}