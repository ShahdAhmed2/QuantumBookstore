# Quantum Bookstore

**Quantum Bookstore** is a Java console-based application that simulates a simple and extensible online bookstore.  
This project was developed as part of the **Fawry Full Stack Internship** qualification tasks.

## Features

✅ Add books to inventory (PaperBook, EBook, ShowcaseBook)  
✅ Buy books using ISBN  
✅ Remove outdated books based on publishing year  
✅ Handle purchase logic (reduce stock, validate type)  
✅ Simulate delivery (ShippingService / MailService)  
✅ Extensible architecture for new book types  

## Book Types

| Type          | Description                                      |
|---------------|--------------------------------------------------|
| 📘 PaperBook   | Physical book with stock quantity and shipping   |
| 📗 EBook       | Electronic book with file type, sent by email    |
| 📕 ShowcaseBook| Not for sale, used for display/demo purposes     |

## How It Works

- **Add Book:** Add any type of book to the inventory with `ISBN`, `Title`, `Author`, `Year`, and `Price`.
- **Buy Book:** Buy using the ISBN and quantity. 
  - If PaperBook → simulates shipping.
  - If EBook → simulates email delivery.
  - If ShowcaseBook → throws error: "Book not for sale".
- **Remove Outdated:** Removes books older than given number of years.

## Example Usage

```java
Inventory inv = new Inventory();

inv.addBook(new PaperBook("101", "Python Course", "Ali", 2012, 150.0, 3));
inv.addBook(new EBook("202", "Clean Code", "Shahd", 2020, 200.0, "PDF"));
inv.addBook(new ShowcaseBook("303", "Java Course", "Unknown", 1946, 0.0));

inv.buyBook("101", 2, "y@y.com", "6 October City");
inv.buyBook("202", 1, "s@s.com", "");

try {
    inv.buyBook("303", 1, "g@g.com", "Nowhere");
} catch (Exception ex) {
    System.out.println("Quantum book store : Error: " + ex.getMessage());
}

inv.removeOutdated(10);
## 📸 Screenshots

### App running:
![App Screenshot](screenshots/app.png)

