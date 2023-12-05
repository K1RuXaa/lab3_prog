package Objects;

import Enums.Action;
import Enums.Conditions;
import Enums.CoordinateEnum;
import Enums.Gender;
import Interfaces.Coordinate;
import Interfaces.Property;
import Interfaces.Amplifiable;

import java.util.Locale;
import java.util.Objects;

public class Entity extends Obj implements Property, Coordinate,Amplifiable {

    //проверка игнорирующая регистр
    @Override
    public boolean equals(Object o) {
        Entity entity = (Entity) o;
        return Objects.equals(ending, entity.ending) && Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    //сравнение по полу
    @Override
    public int hashCode() {
        return Objects.hash(ending);
    }

    //вывод имени и пола объекта
    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    private String ending;
    final private String name;
    final private Gender sex;

    public Entity(String name, Gender sex){
        super(name);
        this.name = name;
        this.sex = sex;
        this.ending = sex.getName();
    }
    public void doSomethingSomeWhere(Action act, Place place,Obj e){
        if (act == Action.Put){
            System.out.print(super.name + "положил " + ending + e.name  + "у"+ " в " + place.name + "у" );
        }

    }

    public void doSomething(Action act){
        if (act == Action.Clogged){
            System.out.print(super.name + " закупорил " + ending);

        }else if (act == Action.DropOut){
            System.out.print(super.name+"не выпасть"+ending);
        }else if (act == Action.Watch){
            System.out.print(super.name + " следил" );
        }else if (act == Action.Swim){
            System.out.print(super.name + " уплывает");
        }else if (act == Action.Hurt){
            System.out.print(super.name + " не заболел"+ending);
        }else if (act == Action.Stand){
            System.out.print(super.name + " стало ");
        }else if (act == Action.Seem){
            System.out.print("казаться ");
        }else if (act == Action.Understood){
            System.out.print(super.name + " понял");
        }
    }

    public void doSomethingAboutSb(Action act, Obj e){
        if (act == Action.Put){
            System.out.print(super.name + " положил"+ ending + e.name+"у");
        }else if (act == Action.Watch){
            System.out.print(super.name + " смотрел"+ ending + e.name);
        }else if(act == Action.Clogged) {
            System.out.print(super.name + " закупорил " + ending + e.name + "у");
        }else if (act == Action.LeanedOut){
            System.out.print(super.name + " высунулся" + ending + " из " + e.name + "а");
        }else if (act==Action.Throw){
            System.out.print(super.name + "бросил" + ending + e.name + "у");
        } else if (act == Action.See) {
            System.out.print(super.name +" " + e.name + " никогда не увидит");

        }
    }
    public void bothActions(Action act, Action act2){
        if (act == Action.Done  & act2 == Action.Could){
            System.out.print(super.name + " сделал" + ending +"все, что мог для своего спасения");
        }
    }
    @Override
    public void getProperty(String property){
        super.name = super.name + " " + this.name;
        super.name = super.name+" "+property;

    }


    @Override
    public void getCoordinate(CoordinateEnum xyz){
        if (xyz == CoordinateEnum.NoCoordinate){
            super.name = super.name;
        }else if (xyz == CoordinateEnum.Far){
            super.name = super.name + " дальше ";
        }
    }
    @Override
    public void getCoordinate(Place place){

        super.name = super.name + " в " + place.name;
    }
    @Override
    public void amplify(Conditions conditions) {
        if (conditions == Conditions.Defolt) {
            super.name = "как можно";
        } else if (conditions == Conditions.Better) {
            super.name = " как можно лучше";

        }else if (conditions==Conditions.But){
            super.name = " но так,чтобы ";
        }else if (conditions==Conditions.PowerFull){
            super.name = " изо всех сил ";
        }else if (conditions == Conditions.How){
            super.name = "как";
        }else if (conditions == Conditions.While){
            System.out.print(" пока " + super.name);
        }else if (conditions == Conditions.ThatIs){

            super.name = "что это" + super.name;
        }else if (conditions == Conditions.That){
            super.name = "что " + this.name;
        }else if (conditions == Conditions.Finally){
            super.name = " наконец " + this.name;
        }

    }


}