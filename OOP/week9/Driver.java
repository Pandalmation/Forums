public class Driver {
  public static void main(String[] args){


    System.out.println("| ... |_._._._._._._._._._._| ... |");
    System.out.println("| ... |_._._._._._._._._._._| ... |"); 
    System.out.println("| ||| |  o WANGSHENG BANK o | ||| |");
    System.out.println("|[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|");
    System.out.println("|     |---------------------|     |");
    System.out.println("| /// |   ///   ///   ///   | /// |");
    System.out.println("|[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|");
    System.out.println("|     | |~|~|  |_|_|  |~|~| |     |");
    System.out.println("|_____|_|_|_|__|_|_|__|_|_|_|_____|\n\n");

    System.out.println("Welcome to WANGSHENG BANK, a simple banking system\n\n");

      Bank bBank = new Bank("WANGSHENG BANK");
  
      boolean test = true;
      Methods.startUp(bBank, test);

  }
}
