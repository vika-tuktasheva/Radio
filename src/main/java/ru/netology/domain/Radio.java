package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    // значение текущей радиостанции
    public int getCurrentStation() {
        return currentStation;
    }

    // выставление номера радиостанции с проверкой допустимости
    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    //переключение на следующую радиостанцию
    public void increaseStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            this.currentStation = 0;
        }
    }

    //переключение на предыдущую радиостанцию
    public void decreaseStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
    }

    //значение текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // выставление громкости с проверкой допустимости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            this.currentVolume = currentVolume;
        }
    }

    //уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }
}
