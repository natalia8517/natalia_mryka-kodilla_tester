public class FirstClass {
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600, 1000);
        System.out.println(notebook.weight + "g" + " "+notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        Notebook heavyNotebook = new Notebook(2000, 1500);
        Notebook oldNotebook = new Notebook(1200, 500);
        System.out.println(heavyNotebook.weight + "g"+" "+ heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        System.out.println(oldNotebook.weight + "g"+" "+ oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
    }
}