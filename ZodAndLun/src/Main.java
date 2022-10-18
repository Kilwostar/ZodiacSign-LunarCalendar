import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Год: ");
        int year = in.nextInt();
        System.out.println("Число месяца: ");
        int month = in.nextInt();
        System.out.println("День: ");
        int day = in.nextInt();

        zodiac(month, day);
        moonDate(year,month, day);

    }
    public void zodiac(int month, int day){
        String zodiak = "";
        switch (month) {
            case (1):
                if (day > 19) {
                    zodiak = "Водолей";
                }
                else {
                    zodiak = "Козерог";
                }
                break;
            case (2):
                if (day > 18) {
                    zodiak = "Рыбы";
                }
                else {
                    zodiak = "Водолей";
                }
                break;
            case (3):
                if (day > 20) {
                    zodiak = "Овен";
                }
                else {
                    zodiak = "Рыбы";
                }
                break;
            case (4):
                if (day > 19) {
                    zodiak = "Телец";
                }
                else {
                    zodiak = "Овен";
                }
                break;
            case (5):
                if (day > 20) {
                    zodiak = "Близнецы";
                }
                else {
                    zodiak = "Телец";
                }
                break;
            case (6):
                if (day > 20) {
                    zodiak = "Рак";
                }
                else {
                    zodiak = "Близнецы";
                }
                break;
            case (7):
                if (day > 22) {
                    zodiak = "Лев";
                }
                else {
                    zodiak = "Рак";
                }
                break;
            case (8):
                if (day > 22) {
                    zodiak = "Дева";
                }
                else {
                    zodiak = "Лев";
                }
                break;
            case (9):
                if (day > 22) {
                    zodiak = "Весы";
                }
                else {
                    zodiak = "Дева";
                }
                break;
            case (10):
                if (day > 22) {
                    zodiak = "Скорпион";
                }
                else {
                    zodiak = "Весы";
                }
                break;
            case (11):
                if (day > 21) {
                    zodiak = "Стрелец";
                }
                else {
                    zodiak = "Скорпион";
                }
                break;
            case (12):
                if (day > 21) {
                    zodiak = "Козерог";
                }
                else {
                    zodiak = "Стрелец";
                }
                break;
        }
        System.out.println("Zodiac: " + zodiak + "\n");
    }
    public void moonDate(int year, int month, int day){
        int lunarAge;
        int lunarNum = 0;
        int num = 1;

        for (int i = 0; i < year; i++) {
            if(num == 19){
                num = 0;
            }
            num++;
            lunarNum = num;
        }

        lunarAge = lunarNum * 11 - 14 + day + month;
        while(lunarAge > 30){
            lunarAge = lunarAge - 30;
        }

        if(lunarAge == 0 || lunarAge == 30){
            System.out.println("New moon. Moon not visible");
        }
        else if(lunarAge > 0 && lunarAge <=7){
            System.out.println("First quarter. The best time to observe is in the evening");
        }
        else if(lunarAge > 7 && lunarAge <= 15){
            System.out.println("Full Moon. Visible all night from sunset to sunrise");
        }
        else if(lunarAge > 15){
            System.out.println("Last Quarter. The Moon is best observed in the second half of the night, in the morning");
        }
    }
}