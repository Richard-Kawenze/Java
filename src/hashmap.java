import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities=new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Kenya","Nairobi");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway","Oslo");
        System.out.println(capitalCities.get("Kenya"));
        for(String i:capitalCities.values())
        {
            System.out.println(i);
        }
        
    }

    
}
