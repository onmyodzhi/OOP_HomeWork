public class swimingAnimal extends Animal{
    swimingAnimal(boolean canFly,boolean canGo){
        this(canGo);
        super.canSwim = true;
        super.canFly = canFly;
    }
    swimingAnimal(boolean canGo){
        super.canGo = canGo;
        super.canFly = false;
        super.canSwim = true;
    }
}
