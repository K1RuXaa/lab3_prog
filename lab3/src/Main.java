import Enums.*;
import Objects.Entity;
import Objects.Place;
import Objects.PlaceTime;
import Objects.Thing;


public class Main {

    public static void main(String[] args){
        //объекты, которые могут действовать
        Entity he = new Entity("он ", Gender.Male);
        Entity paper = new Entity("бумаг",Gender.Female);
        Entity piggy = new Entity("Пятачок", Gender.Male);
        Entity she = new Entity("она",Gender.Female);
        Entity eyes = new Entity("глаза ",Gender.All);
        Entity him = new Entity("у него ",Gender.Male);
        Entity remakehim = new Entity("ему",Gender.Male);
        Entity her = new Entity("её",Gender.Female);







        //объекты не умеющие действовать

        Thing ripples = new Thing("рябь");

        //объекты места


        Place bottle = new Place("бутылк");
        Place window = new Place("окошк");
        Place water = new Place("на воде");

        System.out.println("=================================================================================\n");
        //1 предложение
        PlaceTime.setTime(Time.Then);
        he.doSomethingSomeWhere(Action.Put,bottle,paper);
        System.out.print(",");
        he.amplify(Conditions.Better);
        he.doSomethingAboutSb(Action.Clogged,bottle);
        System.out.print(",");
        he.amplify(Conditions.Defolt);
        he.getCoordinate(CoordinateEnum.Far);
        he.doSomethingAboutSb(Action.LeanedOut,window);
        System.out.print("--");
        he.amplify(Conditions.But);
        he.doSomething(Action.DropOut);
        System.out.print(",--и");
        he.amplify(Conditions.PowerFull);
        he.doSomethingAboutSb(Action.Throw,bottle);
        System.out.print(".");
        he.amplify(Conditions.That);

        //2 предложение
        System.out.print("-\n");
        piggy.doSomething(Action.Watch);
        System.out.print(",");
        she.amplify(Conditions.How);
        she.getProperty("медленно");
        she.doSomething(Action.Swim);
        him.amplify(Conditions.While);
        eyes.doSomething(Action.Hurt);
        System.out.print(", и ");
        remakehim.doSomething(Action.Stand);
        PlaceTime.setTime(Time.Sometimes);
        remakehim.doSomething(Action.Seem);
        bottle.amplify(Conditions.ThatIs);
        remakehim.amplify(Conditions.ThatIs);
        System.out.print(",a ");
        PlaceTime.setTime(Time.Sometimes);
        ripples.implie(water);
        ripples.amplify(Conditions.ThatIs);
        System.out.print(",и");
        he.amplify(Conditions.Finally);
        he.doSomething(Action.Understood);
        System.out.print("-\n");
        he.amplify(Conditions.That);
        he.getProperty("больше");
        he.doSomethingAboutSb(Action.See,her);
        System.out.print(" и ");
        he.amplify(Conditions.That);
        he.bothActions(Action.Done,Action.Could);
        System.out.print(".");





        System.out.println("\n\n=================================================================================");


        //проверка на одного и того же человека с помощью пола + имя(не важен регистр)
        Entity e1 = new Entity("name1", Gender.Male);
        Entity e2 = new Entity("Name1", Gender.Male);

        System.out.println(e1.equals(e2));
        System.out.println(e1);
    }

}