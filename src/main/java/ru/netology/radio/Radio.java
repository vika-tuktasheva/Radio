package ru.netology.radio;

public class Radio {

    public int currentStation;
    public int currentVolume;

    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 10;

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
    public void increaseStation(int currentStation) {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        }
    }

    //переключение на предыдущую радиостанцию
    public void decreaseStation(int currentStation) {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        }
    }

    //значение текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // выставление громкости с проверкой допустимости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //увеличение громкости
    public void increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    //уменьшение громкости
    public void decreaseVolume(int currentVolume) {
        if (currentVolume > minStation) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minStation) {
            this.currentVolume = minStation;
        }
    }
}
