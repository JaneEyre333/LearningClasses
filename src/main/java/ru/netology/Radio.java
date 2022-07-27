package ru.netology;

public class Radio {
    private int stationsQuantity = 10;
    private int currentStationNumber;
    private int currentSoundVolume;
    boolean next;
    boolean prev;
    boolean soundLower;
    boolean soundLouder;

    public Radio() {
    }

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }


    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void setStationsQuantity(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public boolean isSoundLower() {
        return soundLower;
    }

    public void setSoundLower(boolean soundLower) {
        this.soundLower = soundLower;
    }

    public boolean isSoundLouder() {
        return soundLouder;
    }

    public void setSoundLouder(boolean soundLouder) {
        this.soundLouder = soundLouder;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > stationsQuantity) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void stationNext() {
        if (this.next) {
            if (this.currentStationNumber == stationsQuantity) {
                this.currentStationNumber = 0;
            } else {
                this.currentStationNumber += 1;
            }
        }
    }

    public void stationPrev() {
        if (this.prev) {
            if (this.currentStationNumber == 0) {
                this.currentStationNumber = stationsQuantity;
            } else {
                this.currentStationNumber -= 1;
            }
        }
    }

    public void changeSoundVolumeUp() {
        if (soundLouder) {
            if (this.currentSoundVolume == 100) {
                return;
            }
            this.currentSoundVolume += 1;
        }

    }

    public void changeSoundVolumeDown() {
        if (soundLower) {
            if (this.currentSoundVolume == 0) {
                return;
            }
            this.currentSoundVolume -= 1;
        }

    }
}

