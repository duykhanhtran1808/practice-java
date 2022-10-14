package chap03.p1;

public class things {
    public static void main(String[] args) {
        // int[] nums;
        // nums = new int[7];
        // nums[0] = 6;
        // System.out.println(nums[0]);
        Dog[] pets = new Dog[3];
        for(int i = 0; i < 3; i++) {
            pets[i] = new Dog();
            pets[i].name = "Local boy " + i;
            pets[i].age = 10 + i;

            System.out.println("The dog name is " + pets[i].name + " and he is " + pets[i].age + " years old.");
            pets[i].bark();
        }
    }
}

class Dog {
    String name;
    int age;

    void bark(){
        System.out.println("Woof woof");
    }
}
