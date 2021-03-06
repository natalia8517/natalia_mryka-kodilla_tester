public class FirstClass {
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600, 1100, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1200, 500, 2013);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);

        Grades myGrades = new Grades();
        myGrades.add(1);
        myGrades.add(6);
        myGrades.add(1);
        myGrades.add(8);
        myGrades.add(1);
        myGrades.add(2);
        myGrades.add(2);
        myGrades.add(2);
        myGrades.add(3);
        myGrades.add(5);

        System.out.println(myGrades.getLastGrade());
        System.out.println(myGrades.countAndDisplayAverageGrade());
    }

    private static void displayNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g" + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYearOfProduction();
    }
}