package person;

import person.consciousness.Knowledge;

import java.util.Scanner;

public class Student {
    int level=0;
    String name;
    public Student(String name) {
        System.out.println ("Input Student`s level" );
        this.name = name;
        Scanner scanner = new Scanner ( System.in );
      setKnowledge ( new Knowledge (scanner.nextInt ()) );
    }

    public void setKnowledge(Knowledge knowledge) {
     level = knowledge.level;
    }
    public int getLevel(){
      return level;
    }
    public String getName(){
    return name;
    }
}
