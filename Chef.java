package mentorcsc102;

public class Chef {

    private String name;
    private String surname;
    private String typeOfCuisine;
    private int year;
    private String position;
    private static int[] chefCount = new int[4];

    public Chef(String n, String s, String t, int y, String p) {
        name = n;
        surname = s;
        if (t.equalsIgnoreCase("Japanese")) {
            typeOfCuisine = "Japanese";
        } else if (t.equalsIgnoreCase("American")) {
            typeOfCuisine = "American";
        } else if (t.equalsIgnoreCase("Dessert")) {
            typeOfCuisine = "Dessert";
        } else {
            System.out.println("your typeOfCuisine is invalid, so it set to be Japanese");
            typeOfCuisine = "Japanese";
        }

        if (y < 0) {
            year = 0;
        } else {
            year = y;
        }

        if (p.equalsIgnoreCase("Head Chef")) {
            position = "Head Chef";
            chefCount[0]++;
        } else if (p.equalsIgnoreCase("Second Chef")) {
            position = "Second Chef";
            chefCount[1]++;
        } else if (p.equalsIgnoreCase("Line Chef")) {
            position = "Line Chef";
            chefCount[2]++;
        } else if (p.equalsIgnoreCase("Dishwasher")) {
            position = "Dishwasher";
            typeOfCuisine = "";
            chefCount[3]++;
        } else {
            System.out.println("your position is invalid, so it set to be Dishwasher");
            position = "Dishwasher";
            typeOfCuisine = "";
            chefCount[3]++;
        }
    }

    public String getName() {
        return name + " " + surname;
    }

    public String getPosition() {
        return position;
    }

    public String getTypeOfCuisine() {
        return typeOfCuisine;
    }

    public String cook(String food) {
        String[] foodList = {
            "Sushi", "Ramen", "Tonkatsu",
            "Pizza", "Hotdog", "Hamburger",
            "Ice-cream", "Bingsu", "Brownie"
        };
        for (int i = 0; i < foodList.length; i++) {
            if (foodList[i].equalsIgnoreCase(food)) {
//                System.out.println("food is "+foodList[i]);
                if (i < 3 && typeOfCuisine.equals("Japanese")) {
                    return "finish";
                } else if (i < 6 && typeOfCuisine.equals("American")) {
                    return "finish";
                } else if (i < 9 && typeOfCuisine.equals("Dessert")) {
                    return "finish";
                } else {
                    return "I can’t cook this";
                }
            }
        }
        return "I can’t cook this";
    }

    public void getNumberOfChef() {
        System.out.print("The Restaurant is including with " + chefCount[0] + " Head chef, " + chefCount[1] + " Second Chef, " + chefCount[2] + " Line Chef and " + chefCount[3] + " Dishwasher. ");
    }
    public void printInfo(){
  
    }
}
