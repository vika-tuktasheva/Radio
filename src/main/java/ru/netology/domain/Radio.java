package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {//радио по умолчанию со станциями от 0 до 9

    }

    public Radio(int stationCounts) {//радио с количеством станций stationCounts
        maxStation = stationCounts - 1;
    }

    // значение текущей радиостанции
    public int getCurrentStation() {

        return currentStation;
    }

    // выставление номера радиостанции с проверкой допустимости
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //переключение на следующую радиостанцию
    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    //переключение на предыдущую радиостанцию
    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    //значение текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // выставление громкости с проверкой допустимости
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //увеличение громкости
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            return;
        }
    }

    //уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            return;
        }
    }
}
