public class Colors {

    public String showColorName() {
        String userSelected = UserDialogs.getColorFirstLetter();
        String color = "";
        switch (userSelected) {
            case "G":
                color ="green" ;
                break;                     // [1]
            case "Y":
                color = "yellow";
                break;                     // [2]
            case "R":
                color = "red";
                break;                     // [3]
            case "B":
                color = "black";
                break;                     // [4]
        }
        return color;
    }

}