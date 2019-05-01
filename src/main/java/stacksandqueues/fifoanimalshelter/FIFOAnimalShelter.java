package stacksandqueues.fifoanimalshelter;

import stacksandqueues.Queue;

public class FIFOAnimalShelter {
    private Queue<Pet> q;

    public FIFOAnimalShelter() {
        q = new Queue<>();
        q.enqueue(new Pet("ENDPOINT DO NOT GIVE"));
    }

    public boolean enqueue(Pet newPet) {
        if (newPet.getClass() == Cat.class || newPet.getClass() == Dog.class) {
            q.enqueue(newPet);
            return true;
        }
        return false;
    }

    public Pet dequeue(String pref) {
        Pet output = null;

        if (pref != null) {
            pref = pref.toLowerCase();
        }
        if (pref != null && !(pref.equals("cat") || pref.equals("dog"))) {
            return null;
        }

        Class prefClass = Pet.class;
        if (pref != null && pref.equals("cat")) {
            prefClass = Cat.class;
        } else if (pref != null && pref.equals("dog")) {
            prefClass = Dog.class;
        }

        q.enqueue(q.dequeue());
        if (prefClass == Pet.class) {
            output = q.dequeue();
            while (q.peek().getClass() != Pet.class) {
                q.enqueue(q.dequeue());
            }

        } else {
            while (q.peek().getClass() != prefClass && q.peek().getClass() != Pet.class) {
                q.enqueue(q.dequeue());
            }


            if (q.peek().getClass() == prefClass) {
                output = q.dequeue();
                while (q.peek().getClass() != Pet.class) {
                    q.enqueue(q.dequeue());
                }
            }
        }
//        q.enqueue(q.dequeue());

        return output;
    }
}
