public class BookCopy
{
  private String title;
  private boolean borrowed;

  public BookCopy(String title)
  {
    this.title = title;
    borrowed = false;
  }

  public boolean borrow()
  {
    if (borrowed)
    {
      return false;
    }

    borrowed = true;
    return true;
  }

  public void returnBook()
  {
    borrowed = false;
  }

  public boolean isBorrowed()
  {
    return borrowed;
  }
}