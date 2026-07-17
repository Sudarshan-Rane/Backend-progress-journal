package month1.day18_Revision;

abstract class Hero implements Questable{
    private String name;
    private int level;

    Hero(String name, int level){
        this.name = name;
        this.level = level;
    }

    String getName(){
        return this.name;
    }

    int getLevel(){
        return this.level;
    }

    @Override
    public String toString(){
        return "Hero: "+this.name+" (Level "+this.level+")";
    }

}
