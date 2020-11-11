public class Notebook {
    int weight;
    int price;
    public Notebook (int weight, int price){
    this.weight = weight;
    this.price = price;
}
    public void checkPrice(){
    if (this.price <=600){
        System.out.println("This notebook is very cheap.");
    }
    else if(this.price > 600 && this.price<=1000) {
        System.out.println("The price is good.");
    }
    else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight(){
        if (this.weight <=600){
            System.out.println("This notebook is light");
        }
        else if(this.weight > 600 && this.weight<1500) {
            System.out.println("The notebook is not very heavy");
        }
        else if (this.weight >= 1500) {
            System.out.println("This notebook is very heavy");
        }
    }
}

