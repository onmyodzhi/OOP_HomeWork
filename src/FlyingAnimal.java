public class FlyingAnimal extends Animal{
    FlyingAnimal(boolean canSwim,boolean canGo){
        this(canGo);
        super.canSwim = canSwim;
        super.canFly = true;
    }
    FlyingAnimal(boolean canGo){
        super.canGo = canGo;
        super.canFly = true;
        super.canSwim = false;
    }
}
