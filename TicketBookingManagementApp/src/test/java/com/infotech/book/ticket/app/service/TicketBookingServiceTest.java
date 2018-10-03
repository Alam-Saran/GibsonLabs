package com.infotech.book.ticket.app.service;

import static org.junit.Assert.assertThat;

import java.util.Date;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;
import static org.assertj.core.api.Assertions.assertThat;

public class TicketBookingServiceTest {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@MockBean
	private TicketBookingDao ticketBookingDao;
	
	public void testCreateTest() {
		Ticket ticket=new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Alam");
		ticket.setSourceStation("Bihar");
		ticket.setDestStation("Patna");
		ticket.setBookingDate(new Date());
		ticket.setEmail("cseasrar@gmail.com");
		Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);
		assertThat(ticketBookingService.createTicket(ticket)).isEqualTo(ticket);
	}
	
}
