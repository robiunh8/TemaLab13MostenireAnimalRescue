package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Dog cusi= new Dog();

        cusi.setName("Cusi");
        cusi.setAge(1);
        cusi.setFavoriteActivity("Running in the park");
        cusi.setFavoriteFOOD("bones");
        cusi.setHappinessLevel(10);
        cusi.setHungerLevel(5);
        cusi.setHealthState(10);
        System.out.println("The animal's name is: "+ cusi.getName());
        System.out.println("It has "+ cusi.getAge() +" year");
        System.out.println("It's health state is "+ cusi.getHealthState());
        System.out.println("On a scale from 1 to 10 it's hunger level is: "+ cusi.getHungerLevel());
        System.out.println("It's happiness level is: "+ cusi.getHappinessLevel());
        System.out.println("It's favorite food is "+ cusi.getFavoriteFOOD());
        System.out.println(cusi.getFavoriteActivity() +" is it's favorite activity");


        Fetita gesi= new Fetita();

        gesi.setNameofAdopter("Gesi");
        gesi.setMoneyforanimal(150);
        System.out.println(cusi.getName() +" is adopted by "+gesi.getNameofAdopter());
        System.out.println(gesi.getNameofAdopter()+" paid "+gesi.getMoneyforanimal()+"lei for it's vaccination");


        FoodForDog foodForDog= new FoodForDog();

        foodForDog.setFoodAvailable(18);
        foodForDog.setPriceOfFood(10);
        foodForDog.setQuantityOfFood(20);
        foodForDog.setNameOfAnimalFood("kibble");
        System.out.println("It ate a little bowl of "+ foodForDog.getNameOfAnimalFood() +" today");
        System.out.println("The price for a bag of "+ foodForDog.getNameOfAnimalFood() +" is "+ foodForDog.getPriceOfFood() +" lei");
        System.out.println("There are "+ foodForDog.getQuantityOfFood());
        System.out.println("The remainder of "+ foodForDog.getNameOfAnimalFood() +" is "+ foodForDog.getFoodAvailable());


        RecActivityforDog recActForDog= new RecActivityforDog();

        recActForDog.setNameofRecActivity("going for a walk");
        System.out.println("Tommorrow it is "+ recActForDog.getNameofRecActivity());


        Veterinarian vet= new Veterinarian();
        vet.setVetSpecialty("nutrition");
        vet.setNameOfVet("Bob");

        System.out.println("The vet's name is "+ vet.getNameOfVet());
        System.out.println("His specialty is in "+ vet.getVetSpecialty());
    }
}
