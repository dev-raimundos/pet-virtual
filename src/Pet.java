public class Pet {
    int life = 100;
    int happiness = 100;
    int hungry = 0;
    int dirty = 0;
    int sleep = 0;

    public String eat() {
        hungry -= 25;
        life += 10;
        if (hungry < 0) {
            hungry = 0;
            return "Seu sushi já está satisfeito";
        }
        if (life > 100) {
            life = 100; 
        }
        return "Seu sushi está comendo... nhami nhami... e agora está com " + hungry + "% de fome";
    }

    public String play() {
        happiness += 40;
        dirty += 15;
        sleep += 25;

        if (sleep > 100) {
            sleep = 100;
            life -= 10; 
            return "Seu sushi está cansado demais para brincar";
        }
        if (dirty > 100) {
            dirty = 100;
            life -= 10; 
            return "Seu sushi está imundo, você precisa lavá-lo agora";
        }
        if (happiness > 100) {
            happiness = 100;
            return "Seu sushi já está no máximo de felicidade possível";
        }
        if (life < 0) {
            life = 0; 
        }
        return "Seu sushi está brincando e agora está com " + happiness + "% de felicidade";
    }

    public String sleep() {
        sleep -= 25;
        happiness += 10;
        dirty -= 10;
        life += 15; 

        if (sleep < 0) {
            sleep = 0;
            return "Seu sushi já está descansado";
        }
        if (life > 100) {
            life = 100; 
        }
        return "Seu sushi está dormindo e agora está com " + sleep + "% de sono";
    }

    public String shower() {
        dirty -= 75;
        life += 5; 

        if (dirty < 0) {
            dirty = 0;
        }
        if (life > 100) {
            life = 100; 
        }
        return "Seu sushi tomou banho e agora está com " + dirty + "% de sujeira";
    }

    public String verifyStatus() {
        String status = "Vida: " + life + "\n" +
                "Fome: " + hungry + "\n" +
                "Felicidade: " + happiness + "\n" +
                "Sono: " + sleep + "\n" +
                "Sujeira: " + dirty + "\n";
        return status;
    }
}
