public class Task1 {
    public static void main(String[] args) {
        int cock_count = 0;
        int hen_count = 0;
        int chicken_count = 0;
        for(int cock = 5; cock <= 100; cock=cock+5){
            cock_count = cock_count + 1;
            for(int hen = 3; hen <= 100; hen=hen+3){
                hen_count = hen_count + 1;
                if(cock+hen > 100){
                    break;
                }
                for(int chicken = 1; chicken <=100; chicken=chicken+1){
                    chicken_count = chicken_count + 3;
                    if(cock+hen+chicken > 100 || chicken_count+hen_count+cock_count > 100){
                        break;
                    }
                    if(cock_count+hen_count+chicken_count == 100 && cock+hen+chicken<=100){
                        System.out.println("Cock: "+cock_count+" Hen: "+hen_count+" Chicken: " + chicken_count + " Cost: "+(cock+hen+chicken));
                    }
                }
                chicken_count = 0;
            }
            hen_count = 0;
        }
    }
}
