class Jason{
    private static Jason jason= new Jason();
    private int weapon;
    private Jason(){
        this.weapon = 3;
    }
    public static Jason getInstance(){
        return jason;
    }
    public int getWeapon(){
        return weapon;
    }
    public void setWeapon(int weapon){
        this.weapon = weapon;
    }
}
public class Lab14 {

    public static void main(String[] args) {
        Jason prjason = Jason.getInstance();
        System.out.println("Имя героя Джейсон");
        System.out.println("Количество оружий" + ":"+ "" + prjason.getWeapon());
        System.out.println("Был получен пистолет");
        prjason.setWeapon(prjason.getWeapon() + 1);
        Jason prjason1 = Jason.getInstance();
        System.out.println("Количество оружий" + ":" + "" +prjason1.getWeapon());
    }
}