package com.khai;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create books
		Book book1 = new Book();
		book1.setIsbn(123);
		book1.setName("Lam Giau Khong Kho");
		book1.setAuthor("Khai Do");

		Book book2 = new Book();
		book2.setIsbn(124);
		book2.setName("Khoi Nghiep Tu Hai Ban Tay Trang");
		book2.setAuthor("Dung Nguyen");

		Book book3 = new Book();
		book3.setIsbn(125);
		book3.setName("Thoi Mien Khach Hang");
		book3.setAuthor("Kiet Tran");

		Book book4 = new Book();
		book4.setIsbn(126);
		book4.setName("Tro Thanh Trieu Phu Trong 3 Thang");
		book4.setAuthor("Hoang Doan");

		Book[] books = { book1, book2, book3, book4 };

		// Create Locations
		Location location1 = new Location();
		location1.setId(1);
		location1.setName("Nha Sach SG");
		location1.setAddress("Quan 1");

		Location location2 = new Location();
		location2.setId(2);
		location2.setName("Nha Sach TD");
		location2.setAddress("Thu Duc");

		Location[] locations = { location1, location2 };

		// Create Book-in-stock
		BookInStock stock1 = new BookInStock();
		stock1.setBook(book1);
		stock1.setLocation(location1);
		stock1.setQuantity(200);

		BookInStock stock2 = new BookInStock();
		stock2.setBook(book2);
		stock2.setLocation(location2);
		stock2.setQuantity(300);

		BookInStock stock3 = new BookInStock();
		stock3.setBook(book3);
		stock3.setLocation(location1);
		stock3.setQuantity(100);

		BookInStock stock4 = new BookInStock();
		stock4.setBook(book4);
		stock4.setLocation(location2);
		stock4.setQuantity(150);

		BookInStock[] stocks = { stock1, stock2, stock3, stock4 };

		// Create book types
		Type type1 = new Type();
		type1.setId(1);
		type1.setName("Economic");

		Type type2 = new Type();
		type2.setId(2);
		type2.setName("Self-Help");

		Type type3 = new Type();
		type3.setId(3);
		type3.setName("Fiction");

		Type type4 = new Type();
		type4.setId(4);
		type4.setName("Non-Fiction");

		Type[] types = { type1, type2, type3, type4 };

		// Create BookType
		BookType bookType1 = new BookType();
		bookType1.setBook(book1);
		bookType1.setType(type1);

		BookType bookType2 = new BookType();
		bookType2.setBook(book2);
		bookType2.setType(type4);

		BookType bookType3 = new BookType();
		bookType3.setBook(book3);
		bookType3.setType(type2);

		BookType bookType4 = new BookType();
		bookType4.setBook(book4);
		bookType4.setType(type3);

		BookType[] bookTypes = { bookType1, bookType2, bookType3, bookType4 };

		// Create Customers
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Johnny");

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Chris");

		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("Jake");

		Customer customer4 = new Customer();
		customer4.setId(4);
		customer4.setName("Harry");

		Customer[] customers = { customer1, customer2, customer3, customer4 };

		// Create Book-borrowed
		BookStatus bookStatus1 = new BookStatus();
		bookStatus1.setBook(book1);
		bookStatus1.setCustomer(customer1);
		bookStatus1.setBorrowDate("15-02-2023");
		bookStatus1.setReturnDate("");

		BookStatus bookStatus2 = new BookStatus();
		bookStatus2.setBook(book2);
		bookStatus2.setCustomer(customer1);
		bookStatus2.setBorrowDate("11-02-2023");
		bookStatus2.setReturnDate("25-03-2023");

		BookStatus bookStatus3 = new BookStatus();
		bookStatus3.setBook(book3);
		bookStatus3.setCustomer(customer2);
		bookStatus3.setBorrowDate("11-02-2023");
		bookStatus3.setReturnDate("");

		BookStatus bookStatus4 = new BookStatus();
		bookStatus4.setBook(book4);
		bookStatus4.setCustomer(customer2);
		bookStatus4.setBorrowDate("11-02-2023");
		bookStatus4.setReturnDate("21-03-2023");

		BookStatus bookStatus5 = new BookStatus();
		bookStatus5.setBook(book2);
		bookStatus5.setCustomer(customer3);
		bookStatus5.setBorrowDate("25-03-2023");
		bookStatus5.setReturnDate("");

		BookStatus bookStatus6 = new BookStatus();
		bookStatus6.setBook(book1);
		bookStatus6.setCustomer(customer4);
		bookStatus6.setBorrowDate("03-03-2023");
		bookStatus6.setReturnDate("01-04-2023");

		BookStatus bookStatus7 = new BookStatus();
		bookStatus7.setBook(book2);
		bookStatus7.setCustomer(customer4);
		bookStatus7.setBorrowDate("03-03-2023");
		bookStatus7.setReturnDate("");

		BookStatus[] bookStatuses = { bookStatus1, bookStatus2, bookStatus3, bookStatus4, bookStatus5, bookStatus6,
				bookStatus7 };

		showBorrowList(bookStatuses);
		getAllStatusOfBooks(bookStatuses, books);

	}

	public static void showBorrowList(BookStatus[] bookStatuses) {
		System.out.println("Borrow List \n");
		
			for (BookStatus bookStatus : bookStatuses) {
				//System.out.println("Book Name: " + bookStatus.getBook().getName());
				//System.out.println("Borrow Date: " + bookStatus.getBorrowDate());
				if (bookStatus.getReturnDate().isEmpty()){
					System.out.println("Book: " + bookStatus.getBook().getName() + " -- Customer: " + bookStatus.getCustomer().getName());
					System.out.println("Borrowed Date: " + bookStatus.getBorrowDate() + " -- Return Date: Book has not returned yet!!");
					System.out.println("--------------------------");
				} else {
					System.out.println("Book: " + bookStatus.getBook().getName() + " -- Customer: " + bookStatus.getCustomer().getName());
					System.out.println("Borrowed Date: " + bookStatus.getBorrowDate() + " -- Return Date: " + bookStatus.getReturnDate());
					System.out.println("--------------------------");

				}
			
		}
		
	}

	public static void getAllStatusOfBooks(BookStatus[] bookStatuses, Book[] books) {
		System.out.println();
		System.out.println("Show All Status of Books");
		for(Book book: books) {
			System.out.println("Status of: " + book.getName());
			for (BookStatus bookStatus : bookStatuses) {
				if(bookStatus.getBook().getName() == book.getName()) {
					if(bookStatus.getReturnDate().isEmpty()) {
						System.out.println("Borrowed by: " + bookStatus.getCustomer().getName());
						System.out.println("Borrow Date: " + bookStatus.getBorrowDate() + " -- " + " Return Date: Book has not returned yet!!");
						System.out.println("--------------------------");
					}
					else{
						System.out.println("Borrowed by: " + bookStatus.getCustomer().getName());
						System.out.println("Borrow Date: " + bookStatus.getBorrowDate() + " -- " + " Return Date: " + bookStatus.getReturnDate());
						System.out.println("--------------------------");
					}
				}
				
				
			}
		}
	}

	
}
