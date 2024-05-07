package com.razorpay.PayLoad;

public class OrderDetails {
    int amount;
    String currency;
    String noteSbject;
    String noteContent;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNoteSbject() {
        return noteSbject;
    }

    public void setNoteSbject(String noteSbject) {
        this.noteSbject = noteSbject;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
}
