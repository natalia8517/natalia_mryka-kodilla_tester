public class Notebook {
    int weight;
    int price;
    int yearOfProduction;
    public Notebook (int weight, int price, int yearOfProduction){
    this.weight = weight;
    this.price = price;
    this.yearOfProduction = yearOfProduction;

}
    public void checkPrice(){
    if (price <=600){
        System.out.println("This notebook is very cheap.");
    }
    else if(price > 600 && this.price<=1000) {
        System.out.println("The price is good.");
    }
    else if (price > 1000) {
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
    public void checkPriceAndYearOfProduction(){
        if (yearOfProduction > 2019 && price < 1700){
            System.out.println("The price is good for such a new notebook");
        }
        else if (yearOfProduction < 2016 && price > 1000){
            System.out.println("The price is too high for such an old notebook");
        }
    }
}

