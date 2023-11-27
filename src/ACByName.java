import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Print out the accessibility criteria by name.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class ACByName {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Print out the accessiblity criteria by name.
   */
  public static void main(String[] args) throws Exception {
    // Create the heap
    Heap<AccessibilityCriterion> criteria = 
      new Heap<AccessibilityCriterion>((x,y) -> x.title.compareTo(y.title));
    File txtFile = new File("src/accessibility-criteria.txt");
    Scanner sc = new Scanner(txtFile);

    // Add all the elements to the heap.
    while (sc.hasNext()) {
      AccessibilityCriterion accessibilityTxt = new AccessibilityCriterion(sc.nextLine());
      criteria.put(accessibilityTxt);
    } // while

    // Get all the elements, printing them out as you go.
    while (!criteria.isEmpty()) {
      System.out.println(criteria.get());
    } // while
  } // main(String[])
} // ACByName