package me.Gyojun.practice.practice_1;

class AnimalParents {

    void animalSounds(){
        System.out.println("동물들이 소리를 냅니다.");
    }
}

class AnimalDog extends AnimalParents {
    @Override
    void animalSounds(){                       // 부모의 메서드와 이름이 같아야 오버라이드인것임
        System.out.println("크르르르");
    }

}

class AnimalCat extends AnimalParents {
    @Override
    void animalSounds(){            // 부모의 메서드와 이름이 같아야 오버라이드인것임
        System.out.println("냐아아오");
    }
}

class AnimalFox extends AnimalParents{
    @Override
    void animalSounds() {
        System.out.println("What does the Fox say");
        System.out.println("퍄퍄퍄퍄 퍄퍄퍄우");
    }
}



class Practice1 {
    public static void main(String[] args) {

        AnimalParents sounds = new AnimalParents();
        sounds.animalSounds();

        sounds = new AnimalDog();
        sounds.animalSounds();

        sounds = new AnimalCat();
        sounds.animalSounds();

        sounds = new AnimalFox();
        sounds.animalSounds();


    }

}
