public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding suger and milk");
    }
}
