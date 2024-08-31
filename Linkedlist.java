import java.util.LinkedList;
class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();
    // add elements in LinkedList
    languages.add("Java");
    languages.add("SE");
    languages.add("DAA");
    languages.add("DM");
    System.out.println("LinkedList: " + languages);
    // remove elements from index 1
    String str = languages.remove(1);
    System.out.println("Removed Element: " + str);
    System.out.println("Updated LinkedList: " + languages);
  }
}
