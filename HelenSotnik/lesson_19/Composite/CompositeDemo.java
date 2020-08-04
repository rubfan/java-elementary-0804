package composite;

public class CompositeDemo {
    public static void main(String[] args) {
        PepsiCoSubdivision aBeverages = new AmericasBeveragesSubdivision(
                "AmericasBeverages", "North and Latin America Beverages");
        PepsiCoSubdivision aFoods = new AmericasFoodsSubdivision(
                "AmericasFoods", "Frito-Lay North America, Latin Americas Foods");
        PepsiCoSubdivision international = new InternationalSubdivision(
                "International", "UK and Europe, Middle East,Africa and Asia");

        HeadOffice headOffice = new HeadOffice("Head Office", "total");

        headOffice.addSubdivision(aBeverages);
        headOffice.addSubdivision(aFoods);
        headOffice.addSubdivision(international);

        headOffice.showSubdivisionName();
    }
}
