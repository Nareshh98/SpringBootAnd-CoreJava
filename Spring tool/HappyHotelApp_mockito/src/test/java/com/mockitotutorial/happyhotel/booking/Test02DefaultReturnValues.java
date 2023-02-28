package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

class Test02DefaultReturnValues {
	
	private BookingService bookingService;
	private  PaymentService paymentServiceMock;
	private  RoomService roomServiceMock;
	private  BookingDAO bookingDAOMock;
	private  MailSender mailSenderMock;
	
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
	void should_countAvaliablePlaces() {
		// given
		
		int excepted=0;
		// when
		int actual=bookingService.getAvailablePlaceCount();
		// then
		
		assertEquals(excepted, actual);
		
	}

}