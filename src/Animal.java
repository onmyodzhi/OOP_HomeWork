public abstract class Animal {

    protected boolean canFly;
    protected boolean canSwim;
    protected boolean canGo;

    public void toGO(){
        System.out.println(canGo?"Animal to go":"animal can't walk");
    }
    public void fly(){
        System.out.println(canFly?"Animal flying":"animal can't flying");
    }
    public void swim(){
        System.out.println(canSwim?"The animal swam":"the animal cannot swim");
    }
}
