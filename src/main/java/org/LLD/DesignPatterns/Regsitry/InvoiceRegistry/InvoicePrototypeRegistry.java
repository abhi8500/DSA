package org.LLD.DesignPatterns.Regsitry.InvoiceRegistry;

import org.LLD.DesignPatterns.Prototype.Invoice.Invoice;
import org.LLD.DesignPatterns.Prototype.Invoice.InvoiceType;

public interface InvoicePrototypeRegistry {

    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
