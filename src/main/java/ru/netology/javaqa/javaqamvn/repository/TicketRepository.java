package ru.netology.javaqa.javaqamvn.repository;

import domain.Ticket;
public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];
    public Ticket[] findAll(){
        return  tickets;
    }

    public void add (Ticket ticket){
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++){
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;

    }
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }
    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException(
                    "Element with id: " + id + " not found"
            );
        }
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket item : tickets) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;

            }
        }
        tickets = tmp;
    }


}
