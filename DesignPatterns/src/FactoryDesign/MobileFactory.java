package FactoryDesign;

// Multiple Factories can be created using MobileFactory Method
public interface MobileFactory {
	Mobile getMobile(MobileType type);
}
