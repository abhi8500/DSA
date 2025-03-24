package org.LLD.DesignPatterns.Creational.Prototype.Invoice;

import org.LLD.DesignPatterns.Creational.Prototype.Concept.CloneableInterface;

public class Invoice implements CloneableInterface<Invoice> {

    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    private Invoice(Invoice copyInvoice) {
        this.invoiceId = copyInvoice.invoiceId;
        this.customerName = copyInvoice.customerName;
        this.amount = copyInvoice.amount;
        this.paymentMethod = copyInvoice.paymentMethod;
        this.type = copyInvoice.type;
    }

    @Override
    public Invoice copy() {
        return new Invoice(this);
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }


}
