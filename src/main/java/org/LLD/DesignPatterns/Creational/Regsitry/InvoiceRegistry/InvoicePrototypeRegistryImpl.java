package org.LLD.DesignPatterns.Creational.Regsitry.InvoiceRegistry;

import org.LLD.DesignPatterns.Creational.Prototype.Invoice.Invoice;
import org.LLD.DesignPatterns.Creational.Prototype.Invoice.InvoiceType;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    Map<InvoiceType, Invoice> invoiceTypeInvoiceMap = new HashMap<>();


    @Override
    public void addPrototype(Invoice invoice) {
        invoiceTypeInvoiceMap.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return invoiceTypeInvoiceMap.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return invoiceTypeInvoiceMap.get(type).copy();
    }
}
