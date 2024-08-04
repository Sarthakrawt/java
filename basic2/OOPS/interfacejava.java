package sortingAlgo.OOPs;

interface parent1{
    void method();
}
interface parent2{
    void method2();
}

// multiple inheritance is allowed in interface 
// and 100% abstraction can achive using interface
class interfacejava implements parent1, parent2{
    @Override
   public void method(){
        System.out.println("you need to override function from parent class");
    }
    @Override
    public void method2(){
        System.out.println("this is also override the above function in parent2");
    }
    public static void main(String[] args) {
        interfacejava child  = new interfacejava();
        child.method();
        child.method2();
    }
}
