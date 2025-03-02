
class animal {
    public void makesound(){

    }
}

class dog extends animal {

    @Override
    public void makesound() {
        System.out.println("Wooof");
    }
}

class cat extends animal {
    @Override
    public void makesound() {
        System.out.println("Meowoo");
    
    }
}


public class  mani {
    public static void main(String[] args) {
        animal dog = new dog();
         animal cat  = new cat();
        dog.makesound();
        cat.makesound();

    }

}