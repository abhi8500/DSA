package org.LLD.DesignPatterns.Creational.Regsitry.InvoiceRegistry;

import org.LLD.DesignPatterns.Creational.Prototype.Invoice.Invoice;
import org.LLD.DesignPatterns.Creational.Prototype.Invoice.InvoiceType;

public interface InvoicePrototypeRegistry {

    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
