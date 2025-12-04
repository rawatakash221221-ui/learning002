package ex_24_Enum;

public class Lab_003_Enum_P3 {
    public static void main(String[] args) {
        System.out.println(hexcolors.Red.getHexcode());
    }
}
enum hexcolors{
    Red("#FF0000 "),
    Green("#00FF00"),
        Blue("#0000FF"),
    White("FFFFFF");
    private String hexcode;

    public String getHexcode() {
        return hexcode;
    }

    hexcolors(String hexcode){
        this.hexcode=hexcode;

        }


}
// Hex	Color
//#FF0000	🔴 Full red
//#00FF00	🟢 Full green
//#00FF00	🔵 Full blue
//#FFFFFF	⚪ White