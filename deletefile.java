import java.io.File; 
public class Deletefile
	{
  public static void main(String[] args)
	  { 
    File myObj = new File("D:// filename.txt"); 
    if (myObj.delete()) 
		{ 
      System.out.println("Deleted the file" + myObj.getName());
    } 
	else
	{
      System.out.println("Failed to delete the file");
    } 
  } 
}
