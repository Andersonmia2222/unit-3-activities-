public class Main {
public static void main(String []args) {
   Pet basicPet = new Pet("Buddy", "dog", 3, 25.5, true);
   System.out.println(basicPet);
   Pet pet2 = new Pet("Mochi", "cat", 1, 8.2, false);

   System.out.println(pet2);
   System.out.println( pet2.getName() );
   System.out.println( pet2.getType() );

   int age = pet2.getAge();
   System.out.println(age);

   pet2.setName("Mochi");
   pet2.setAge(2); 
   pet2.setWeight(9.0);
   System.out.println(pet2);

}

}