package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.*;


class Test06Matchers {
	
	private BookingService bookingService;
	private  PaymentService paymentServiceMock;
	private  RoomService roomServiceMock;
	private  BookingDAO bookingDAOMock;
	private  MailSender mailSenderMock;
	private Object assertAll;
	
	@BeforeEach
	void Setup() {
		this.paymentServiceMock=mock(PaymentService.class);  // dummy object
		this.roomServiceMock=mock(RoomService.class);
		this.bookingDAOMock=mock(BookingDAO.class);
		this.mailSenderMock=mock(MailSender.class);
		
		
		this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock); 
	
		System.out.println("list for romm service"+roomServiceMock.getAvailableRooms());
		System.out.println("Object returned "+roomServiceMock.findAvailableRoomId(null));
        System.out.println("primitive returned " +roomServiceMock.getRoomCount());
	}

	@Test
	void should_NotCompleteBooking_when_PriceTooHigh() {
		// given
		BookingRequest bookingRequest= new BookingRequest("1",LocalDate.of(2020, 01, 01),LocalDate.of(2020, 01, 05),2,true);
		
		when(this.paymentServiceMock.pay(any(), anyDouble()))
		.thenThrow(BusinessException.class);
		
		// any()    for object
		// anyDouble(),anyBoolean()  for Primitives
		
		
		// when
		Executable executable =()->bookingService.makeBooking(bookingRequest);
		// then
		
		assertThrows(BusinessException.class,executable);	
	}
	
	
}
