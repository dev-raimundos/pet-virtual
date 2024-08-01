public class Pet {
    int life = 100;
    int hapiness = 100;
    int hungry = 0;
    int dirty = 0;
    int sleep = 0;

    public String eat() {
        hungry += 25;
        if (hungry > 100) {
            hungry = 100;
            return "Seu sushi já está satisfeito";
        }
        return "Seu sushi está comendo... nhami nhami... e agora está com " + hungry + "% de fome";
    }

    public String play() {
        hapiness += 40;
        dirty += 15;
        sleep += 25;

        if (sleep > 100) {
            sleep = 100;
            return "Seu sushi está cansado demais para brincar";
        }
        if (dirty > 100) {
            dirty = 100;
            return "Seu sushi está imundo, você precisa lavá-lo agora";
        }
        if (hapiness > 100) {
            hapiness = 100;
            return "Seu sushi já está no máximo de felicidade possível";
        }
        return "Seu sushi está brincando e agora está com " + hapiness + "% de felicidade";
    }

    public String sleep() {
        sleep += 25;
        if (sleep > 100) {
            sleep = 100;
            return "Seu sushi já está descansado";
        }
        return "Seu sushi está dormindo e agora está com " + sleep + "% de sono";
    }

    public String shower() {
        dirty -= 75;
        if (dirty > 0) {
            return "Seu sushi tomou banho e agora está com " + dirty + "% de sujeira";
        } else {
            dirty = 0;
            return "Seu sushi já está limpinho";
        }
    }

    public String verifyStatus() {
        String status = "Fome: " + hungry + "\n" +
                "Felicidade: " + hapiness + "\n" +
                "Sono: " + sleep + "\n" +
                "Sujeira: " + dirty + "\n";
        return status;
    }
}