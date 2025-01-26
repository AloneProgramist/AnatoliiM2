package module2;

public class CreatorAnimal {
    public enum Type{
        PREDATORS,
        HERBIVORES,
    }
    public Animal createSignelAnimal(Type type, Animal MotherClass) {
        if (type == Type.PREDATORS) {
            return new Predators(MotherClass.getName(),MotherClass.eatMap);
        } else if (type == Type.HERBIVORES) {
            return new Herbivores(MotherClass.getName(), MotherClass.eatMap);
        }
        throw new TypeNotFounded("Type "+ type.toString() + " Not Founded");
    }
}
