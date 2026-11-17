public class Main
{
  public static void main(String[] args)
  {
    BookCopy copy = new BookCopy("Den lille prins");

    System.out.println("Nyt eksemplar - udlånt: " + copy.isBorrowed());

    System.out.println("Første udlån: " + copy.borrow());
    System.out.println("Status efter første udlån: " + copy.isBorrowed());

    System.out.println("Nyt udlånsforsøg: " + copy.borrow());
    System.out.println("Status efter afvist udlån: " + copy.isBorrowed());

    copy.returnBook();
    System.out.println("Status efter aflevering: " + copy.isBorrowed());

    System.out.println("Udlån efter aflevering: " + copy.borrow());
    System.out.println("Status efter nyt udlån: " + copy.isBorrowed());
  }
}


