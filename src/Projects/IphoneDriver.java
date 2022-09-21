package Projects;

public class IphoneDriver {

    public static void main(String[] args) {
        Iphone10AbaMade.setPrice(48897);
        double iphone10Price = Iphone10AbaMade.getPrice();
        System.out.printf("Our iphone price is: %2f", iphone10Price);

        System.out.println();

        Iphone10AbaMade iphoneColor = new Iphone10AbaMade();
        iphoneColor.setColor("Green");
        String iphone10Color = iphoneColor.getColor();
        System.out.printf("You Iphone10 colour is: %s",iphone10Color );
    }
}
