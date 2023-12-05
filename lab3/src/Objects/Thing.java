package Objects;

import Enums.Conditions;
import Interfaces.Amplifiable;
import Interfaces.Implied;
import Interfaces.Property;

import java.util.Objects;

public class Thing extends Obj implements Property, Amplifiable, Implied {
    final String name;

    public Thing(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void getProperty(String property){
        super.name = this.name;
        super.name = property + " " + super.name;
    }
    @Override
    public void amplify(Conditions conditions){
        if (conditions == Conditions.ThatIs){
            System.out.print(" что это просто " + super.name  );
        }
    }
    @Override
    public void implie(Place place){
        super.name = this.name + " " + place.name;
    }
}