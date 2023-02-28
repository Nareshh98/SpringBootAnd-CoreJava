package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

class Test08Spies {
	
	private BookingService bookingService;
	private  PaymentService paymentServiceMock;
	private  RoomService roomServiceMock;
	private  BookingDAO bookingDAOMock;
	private  MailSender mailSenderMock;
	
	@BeforeEach
	void Setup() {
		this.paymentServiceMock=mock(PaymentService.class);  // dummy object
		this.roomServiceMock=mock(RoomService.class);
		this.bookingDAOMock=spy(BookingDAO.class);
		this.mailSenderMock=mock(MailSender.class);
		
		
		this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock); 
	}

	@Test
	void should_MakeBooking_when_InpuyOk() {
		// given
		BookingRequest bookingRequest= new BookingRequest("1",LocalDate.of(2020, 01, 01),LocalDate.of(2020, 01, 05),2,true);
	   
		bookingRequest.setRoomId("1.3");
		String bookingId="1";
		
		// when
		bookingService.cancelBooking(bookingId);
		
		// then	
		
		}
	
	
	
}
